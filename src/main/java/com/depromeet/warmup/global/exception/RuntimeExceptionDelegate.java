package com.depromeet.warmup.global.exception;

import io.grpc.ForwardingServerCallListener;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.Status;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RuntimeExceptionDelegate<ReqT, RespT> extends ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT> {

    private final ServerCall<ReqT, RespT> call;

    public RuntimeExceptionDelegate(final ServerCall<ReqT, RespT> call,
                                    final Metadata headers,
                                    final ServerCallHandler<ReqT, RespT> next) {
        super(next.startCall(call, headers));

        this.call = call;
    }

    @Override
    public void onMessage(final ReqT message) {
        run(() -> super.onMessage(message));
    }

    @Override
    public void onHalfClose() {
        run(super::onHalfClose);
    }

    @Override
    public void onReady() {
        run(super::onReady);
    }

    private void run(final Runnable runnable) {
        try {
            runnable.run();
        } catch (final RuntimeException e) {
            final var status = extractStatusFrom(e);
            call.close(status, new Metadata());
        }
    }

    private Status extractStatusFrom(final RuntimeException e) {
        if (e instanceof SystemException) {
            final var description = ((SystemException) e).getDescription();

            log.debug("Throwing service exception on runtime [status={}]", description);
            return Status.INTERNAL.withDescription(description);
        }

        log.error("Unknown runtime exception occurred", e);
        return Status.UNKNOWN;
    }
}
