package com.depromeet.warmup.domain.item;

import com.depromeet.warmup.global.entity.ProtobufConverter;
import com.depromeet.warmup.grpc.service.ItemGrpc;
import com.depromeet.warmup.grpc.service.ItemOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@RequiredArgsConstructor
@GrpcService
class ItemController extends ItemGrpc.ItemImplBase {

    private final ItemService itemService;

    @Override
    public void save(final ItemOuterClass.SaveRequest request,
                     final StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
        itemService.save(Item.builder()
                .name(request.getName())
                .description(request.getDescription())

                .build())
                .map(ProtobufConverter::toProtoBuf)
                .subscribe(responseObserver::onNext,
                        responseObserver::onError,
                        responseObserver::onCompleted);
    }

    @Override
    public void findAll(final ItemOuterClass.FindAllRequest request,
                        final StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
        itemService.findAll()
                .map(ProtobufConverter::toProtoBuf)
                .subscribe(responseObserver::onNext,
                        responseObserver::onError,
                        responseObserver::onCompleted);
    }

    @Override
    public void findById(final ItemOuterClass.FindByIdRequest request,
                         final StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
        itemService.findById(request.getId())
                .map(ProtobufConverter::toProtoBuf)
                .subscribe(responseObserver::onNext,
                        responseObserver::onError,
                        responseObserver::onCompleted);
    }
}
