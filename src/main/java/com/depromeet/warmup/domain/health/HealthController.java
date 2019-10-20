package com.depromeet.warmup.domain.health;

import com.depromeet.warmup.grpc.service.HealthGrpc;
import com.depromeet.warmup.grpc.service.HealthOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import reactor.core.publisher.Mono;

@GrpcService
public class HealthController extends HealthGrpc.HealthImplBase {

    @Override
    public void echo(final HealthOuterClass.EchoMessage request,
                     final StreamObserver<HealthOuterClass.EchoMessage> responseObserver) {
        Mono.just(request)
                .subscribe(responseObserver::onNext,
                        responseObserver::onError,
                        responseObserver::onCompleted);
    }
}
