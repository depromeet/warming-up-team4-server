package com.depromeet.warmup.global.exception;

import io.grpc.ForwardingServerCall;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.Status;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExceptionDelegate<ReqT, RespT> extends ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT> {

    public ExceptionDelegate(final ServerCall<ReqT, RespT> call) {
        super(call);
    }

    @Override
    public void close(final Status status,
                      final Metadata trailers) {

        if (status.getCode() != Status.UNKNOWN.getCode()) {
            super.close(status, trailers);
            return;
        }

        super.close(extractStatusFrom(status.getCause()), trailers);
    }

    private Status extractStatusFrom(final Throwable e) {
        if (e instanceof SystemException) {
            final var description = ((SystemException) e).getDescription();

            log.debug("Throwing service exception [status={}]", description);
            return Status.INTERNAL.withDescription(description);
        }

        log.error("Unknown runtime occurred", e);
        return Status.UNKNOWN;
    }
}
