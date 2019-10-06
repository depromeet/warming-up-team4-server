package com.depromeet.warmup.global.interceptor;

import com.depromeet.warmup.global.exception.RuntimeExceptionDelegate;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@RequiredArgsConstructor
@Order(Ordered.LOWEST_PRECEDENCE)
@GrpcGlobalServerInterceptor
public class RuntimeExceptionInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(final ServerCall<ReqT, RespT> call,
                                                                 final Metadata headers,
                                                                 final ServerCallHandler<ReqT, RespT> next) {
        return new RuntimeExceptionDelegate<>(call, headers, next);
    }
}
