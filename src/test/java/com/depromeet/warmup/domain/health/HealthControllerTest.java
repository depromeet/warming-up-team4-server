package com.depromeet.warmup.domain.health;

import com.depromeet.warmup.grpc.HealthGrpc;
import com.depromeet.warmup.grpc.HealthOuterClass;
import com.depromeet.warmup.support.BaseSupports;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

class HealthControllerTest extends BaseSupports {

    @Autowired
    private HealthGrpc.HealthImplBase healthController;

    @Test
    void echo() throws InterruptedException {
        final var latch = new CountDownLatch(2);

        final var echoMessage = HealthOuterClass.EchoMessage.newBuilder()
                .build();

        healthController.echo(echoMessage, new StreamObserver<>() {
            @Override
            public void onNext(final HealthOuterClass.EchoMessage value) {
                assertThat(echoMessage).isEqualTo(value);
                latch.countDown();
            }

            @Override
            public void onError(Throwable t) {
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