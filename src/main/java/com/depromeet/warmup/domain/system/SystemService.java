package com.depromeet.warmup.domain.system;

import com.depromeet.warmup.grpc.Int64OuterClass;
import com.depromeet.warmup.grpc.SystemGrpc;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SystemService extends SystemGrpc.SystemImplBase {

    @Override
    public void currentTimeMillis(final Empty request,
                                  final StreamObserver<Int64OuterClass.Int64> responseObserver) {
        final var currentTimeMillis = Int64OuterClass.Int64.newBuilder()
                .setValue(System.currentTimeMillis())
                .build();

        responseObserver.onNext(currentTimeMillis);
        responseObserver.onCompleted();
    }
}
