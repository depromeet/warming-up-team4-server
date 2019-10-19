package com.depromeet.warmup.domain.system;

import com.depromeet.warmup.grpc.service.SystemGrpc;
import com.depromeet.warmup.grpc.vo.Int64OuterClass;
import com.depromeet.warmup.utils.Thrower;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@RequiredArgsConstructor
@GrpcService
public class SystemController extends SystemGrpc.SystemImplBase {

    private final SystemService systemService;

    @Override
    public void currentTimeMillis(final Empty request,
                                  final StreamObserver<Int64OuterClass.Int64> responseObserver) {
        systemService.getCurrentTimeMillis()
                .map(this::wrap)
                .subscribe(responseObserver::onNext,
                        Thrower::just,
                        responseObserver::onCompleted);
    }

    private Int64OuterClass.Int64 wrap(final long currentTimeMillis) {
        return Int64OuterClass.Int64.newBuilder()
                .setValue(currentTimeMillis)
                .build();
    }
}
