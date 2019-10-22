package com.depromeet.warmup.global.interceptor;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.global.exception.ServiceStatus;
import com.depromeet.warmup.global.security.AccessTokenContext;
import com.depromeet.warmup.global.security.AccessTokenService;
import com.depromeet.warmup.global.security.jwt.JwtManager;
import com.depromeet.warmup.utils.StringUtils;
import io.grpc.Context;
import io.grpc.Contexts;
import io.grpc.ForwardingServerCall;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@RequiredArgsConstructor
@Order(AuthInterceptor.ORDER)
@Component
public class AuthInterceptor implements ServerInterceptor {

    static final int ORDER = 100;

    private final AccessTokenService accessTokenService;

    private final JwtManager<Authentication> jwtManager;

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call,
                                                                 final Metadata headers,
                                                                 final ServerCallHandler<ReqT, RespT> next) {
        final var rawJwtToken = headers.get(AccessTokenContext.getAccessTokenMetadataKey());
        if (StringUtils.isBlank(rawJwtToken)) {
            return unauthenticated(ServiceStatus.INVALID_ACCESS_TOKEN, call, headers);
        }
        if (isInvalidJwtToken(rawJwtToken)) {
            return unauthenticated(ServiceStatus.INVALID_ACCESS_TOKEN, call, headers);
        }

        final var decodedJWT = jwtManager.decode(rawJwtToken);

        final var accessToken = accessTokenService.findById(decodedJWT.getId())
                .block();
        if (Objects.isNull(accessToken)) {
            return unauthenticated(ServiceStatus.ACCESS_TOKEN_EXPIRED, call, headers);
        }
        if (!accessToken.verify(rawJwtToken)) {
            return unauthenticated(ServiceStatus.SIGN_IN_ANOTHER_DEVICE, call, headers);
        }

        if (isExpired(decodedJWT)) {
            call = new ForwardingServerCall.SimpleForwardingServerCall<>(call) {

                @Override
                public void sendHeaders(final Metadata trailers) {
                    trailers.put(AccessTokenContext.getNewAccessTokenMetadataKey(), jwtManager.renew(decodedJWT));
                    super.sendHeaders(trailers);
                }
            };
        }

        final var context = Context.current().withValue(AccessTokenContext.getAccessTokenKey(), accessToken);
        return Contexts.interceptCall(context, call, headers, next);
    }

    private boolean isExpired(final DecodedJWT decodedJWT) {
        return decodedJWT.getExpiresAt()
                .getTime() <= System.currentTimeMillis();
    }

    private boolean isInvalidJwtToken(final String jwtToken) {
        return !jwtManager.isValid(jwtToken);
    }

    private <ReqT, RespT> ServerCall.Listener<ReqT> unauthenticated(final ServiceStatus serviceStatus,
                                                                    final ServerCall<ReqT, RespT> call,
                                                                    final Metadata headers) {
        log.debug("Unauthenticated access token [status={}, token={}]",
                serviceStatus.name(), headers.get(AccessTokenContext.getAccessTokenMetadataKey()));

        call.close(Status.UNAUTHENTICATED.withDescription(serviceStatus.name()), headers);

        return new ServerCall.Listener<>() {
        };
    }
}
