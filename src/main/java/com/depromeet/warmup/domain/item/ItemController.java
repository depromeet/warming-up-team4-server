package com.depromeet.warmup.domain.item;

import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.domain.authentication.AuthenticationService;
import com.depromeet.warmup.global.entity.ProtobufConverter;
import com.depromeet.warmup.global.exception.ServiceRuntimeException;
import com.depromeet.warmup.global.exception.ServiceStatus;
import com.depromeet.warmup.global.interceptor.AuthInterceptor;
import com.depromeet.warmup.global.security.AccessToken;
import com.depromeet.warmup.global.security.AccessTokenContext;
import com.depromeet.warmup.grpc.service.ItemGrpc;
import com.depromeet.warmup.grpc.service.ItemOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@RequiredArgsConstructor
@GrpcService(interceptors = {AuthInterceptor.class})
class ItemController extends ItemGrpc.ItemImplBase {

    private final ItemService itemService;
    private final AuthenticationService authenticationService;

    @Override
    public void save(final ItemOuterClass.SaveRequest request,
                     final StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
        AccessTokenContext.getAccessToken()
                .map(AccessToken::getEmail)
                .map(authenticationService::findByEmail)
                .orElseThrow(() -> ServiceRuntimeException.status(ServiceStatus.AUTHENTICATION_NOT_FOUND))
                .map(Authentication::getUser)
                .map(user -> Item.builder()
                        .name(request.getName())
                        .description(request.getDescription())
                        .image(request.getImageList())
                        .place(request.getPlace())
                        .category(Category.from(request.getCategory()))
                        .tag(request.getTag())
                        .user(user)
                        .build())
                .flatMap(itemService::save)
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

    @Override
    public void findItemByCategory(final ItemOuterClass.FindByCategoryRequest request,
                        final StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
        itemService.findItemByCategory(Category.from(request.getCategory()))
                .map(ProtobufConverter::toProtoBuf)
                .subscribe(responseObserver::onNext,
                        responseObserver::onError,
                        responseObserver::onCompleted);
    }
}
