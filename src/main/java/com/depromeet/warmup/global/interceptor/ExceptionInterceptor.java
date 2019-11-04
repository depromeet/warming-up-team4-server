package com.depromeet.warmup.global.interceptor;

import com.depromeet.warmup.global.exception.ExceptionDelegate;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.core.annotation.Order;

@RequiredArgsConstructor
@Order(ExceptionInterceptor.ORDER)
@GrpcGlobalServerInterceptor
public class ExceptionInterceptor implements ServerInterceptor {

    static final int ORDER = AuthInterceptor.ORDER - 1;

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(final ServerCall<ReqT, RespT> call,
                                                                 final Metadata headers,
                                                                 final ServerCallHandler<ReqT, RespT> next) {
        return next.startCall(new ExceptionDelegate<>(call), headers);
    }
}
