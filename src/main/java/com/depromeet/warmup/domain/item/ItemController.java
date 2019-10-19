package com.depromeet.warmup.domain.item;

import com.depromeet.warmup.grpc.service.ItemGrpc;
import com.depromeet.warmup.grpc.service.ItemOuterClass;
import com.depromeet.warmup.utils.Thrower;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@RequiredArgsConstructor
@GrpcService
class ItemController extends ItemGrpc.ItemImplBase {

    private final ItemConverter itemConverter;
    private final ItemService itemService;

    // TODO: validate

    @Override
    public void save(final ItemOuterClass.SaveRequest request,
                     final StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
        itemConverter.convert(request)
                .flatMap(itemService::save)
                .map(Item::toProtoBuf)
                .subscribe(responseObserver::onNext,
                        Thrower::just,
                        responseObserver::onCompleted);
    }

    @Override
    public void findAll(final ItemOuterClass.FindAllRequest request,
                        final StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
        itemService.findAll()
                .map(Item::toProtoBuf)
                .subscribe(responseObserver::onNext,
                        Thrower::just,
                        responseObserver::onCompleted);
    }

    @Override
    public void findById(final ItemOuterClass.FindByIdRequest request,
                         final StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
        itemService.findById(request.getId())
                .map(Item::toProtoBuf)
                .subscribe(responseObserver::onNext,
                        Thrower::just,
                        responseObserver::onCompleted);
    }
}
