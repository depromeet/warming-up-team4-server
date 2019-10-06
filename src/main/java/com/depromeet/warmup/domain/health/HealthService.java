package com.depromeet.warmup.domain.health;

import com.depromeet.warmup.grpc.HealthGrpc;
import com.depromeet.warmup.grpc.HealthOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HealthService extends HealthGrpc.HealthImplBase {

    @Override
    public void echo(final HealthOuterClass.EchoMessage request,
                     final StreamObserver<HealthOuterClass.EchoMessage> responseObserver) {
        responseObserver.onNext(request);
        responseObserver.onCompleted();
    }
}
