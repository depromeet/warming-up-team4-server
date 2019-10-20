package com.depromeet.warmup.domain.account;

import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.global.entity.ProtobufConverter;
import com.depromeet.warmup.global.exception.ServiceRuntimeException;
import com.depromeet.warmup.global.exception.ServiceStatus;
import com.depromeet.warmup.grpc.entity.AuthenticationOuterClass;
import com.depromeet.warmup.grpc.service.AccountGrpc;
import com.depromeet.warmup.grpc.service.AccountOuterClass;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@RequiredArgsConstructor
@GrpcService
public class AccountController extends AccountGrpc.AccountImplBase {

    private final AccountService accountService;

    @Override
    public void signUp(final AccountOuterClass.SignUpRequest request,
                       final StreamObserver<AuthenticationOuterClass.Authentication> responseObserver) {
        accountService.signUp(Authentication.builder()
                .nickname(request.getNickname())
                .password(request.getPassword())
                .email(request.getEmail())
                .build())
                .map(ProtobufConverter::toProtoBuf)
                .subscribe(responseObserver::onNext,
                        responseObserver::onError,
                        responseObserver::onCompleted);
    }

    @Override
    public void signIn(final AccountOuterClass.SignInRequest request,
                       final StreamObserver<AccountOuterClass.SignInResponse> responseObserver) {
        accountService.signIn(Authentication.builder()
                .email(request.getEmail())
                .password(request.getPassword())
                .build())
                .subscribe(responseObserver::onNext,
                        responseObserver::onError,
                        responseObserver::onCompleted);
    }

    @Override
    public void verify(final AccountOuterClass.VerificationRequest request,
                       final StreamObserver<Empty> responseObserver) {
        responseObserver.onError(ServiceRuntimeException.status(ServiceStatus.NOT_IMPLEMENTED_YET));
    }
}