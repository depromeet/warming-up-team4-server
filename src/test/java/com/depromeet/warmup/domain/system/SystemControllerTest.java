package com.depromeet.warmup.domain.system;

import com.depromeet.warmup.grpc.service.SystemGrpc;
import com.depromeet.warmup.grpc.vo.Int64OuterClass;
import com.depromeet.warmup.support.BaseSupports;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

class SystemControllerTest extends BaseSupports {

    @Autowired
    private SystemGrpc.SystemImplBase systemController;

    @Test
    void currentTimeMillis() throws InterruptedException {
        final var latch = new CountDownLatch(2);

        systemController.currentTimeMillis(Empty.getDefaultInstance(), new StreamObserver<>() {
            @Override
            public void onNext(final Int64OuterClass.Int64 value) {
                final var currentTimeMillis = System.currentTimeMillis();
                final var term = 1_000;

                assertThat(value.getValue()).isBetween(currentTimeMillis - term, currentTimeMillis + term);
                latch.countDown();
            }

            @Override
            public void onError(final Throwable t) {
                throw new RuntimeException(t);
            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        assertThat(latch.await(1_000, TimeUnit.MILLISECONDS)).isTrue();
    }
}