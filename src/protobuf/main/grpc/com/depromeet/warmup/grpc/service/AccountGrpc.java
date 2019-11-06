package com.depromeet.warmup.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.1)",
    comments = "Source: account.proto")
public final class AccountGrpc {

  private AccountGrpc() {}

  public static final String SERVICE_NAME = "warmup.service.Account";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest,
      com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignUp",
      requestType = com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest.class,
      responseType = com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest,
      com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication> getSignUpMethod() {
    io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest, com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication> getSignUpMethod;
    if ((getSignUpMethod = AccountGrpc.getSignUpMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getSignUpMethod = AccountGrpc.getSignUpMethod) == null) {
          AccountGrpc.getSignUpMethod = getSignUpMethod =
              io.grpc.MethodDescriptor.<com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest, com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("SignUp"))
              .build();
        }
      }
    }
    return getSignUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest,
      com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse> getSignInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignIn",
      requestType = com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest.class,
      responseType = com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest,
      com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse> getSignInMethod() {
    io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest, com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse> getSignInMethod;
    if ((getSignInMethod = AccountGrpc.getSignInMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getSignInMethod = AccountGrpc.getSignInMethod) == null) {
          AccountGrpc.getSignInMethod = getSignInMethod =
              io.grpc.MethodDescriptor.<com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest, com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("SignIn"))
              .build();
        }
      }
    }
    return getSignInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest,
      com.google.protobuf.Empty> getVerifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Verify",
      requestType = com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest,
      com.google.protobuf.Empty> getVerifyMethod() {
    io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest, com.google.protobuf.Empty> getVerifyMethod;
    if ((getVerifyMethod = AccountGrpc.getVerifyMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getVerifyMethod = AccountGrpc.getVerifyMethod) == null) {
          AccountGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("Verify"))
              .build();
        }
      }
    }
    return getVerifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountStub newStub(io.grpc.Channel channel) {
    return new AccountStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountFutureStub(channel);
  }

  /**
   */
  public static abstract class AccountImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 회원가입
     * </pre>
     */
    public void signUp(com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication> responseObserver) {
      asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    /**
     * <pre>
     * 로그인
     * </pre>
     */
    public void signIn(com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignInMethod(), responseObserver);
    }

    /**
     * <pre>
     * 인증번호 인증
     * </pre>
     */
    public void verify(com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest,
                com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication>(
                  this, METHODID_SIGN_UP)))
          .addMethod(
            getSignInMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest,
                com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse>(
                  this, METHODID_SIGN_IN)))
          .addMethod(
            getVerifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_VERIFY)))
          .build();
    }
  }

  /**
   */
  public static final class AccountStub extends io.grpc.stub.AbstractStub<AccountStub> {
    private AccountStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountStub(channel, callOptions);
    }

    /**
     * <pre>
     * 회원가입
     * </pre>
     */
    public void signUp(com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 로그인
     * </pre>
     */
    public void signIn(com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 인증번호 인증
     * </pre>
     */
    public void verify(com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountBlockingStub extends io.grpc.stub.AbstractStub<AccountBlockingStub> {
    private AccountBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 회원가입
     * </pre>
     */
    public com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication signUp(com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 로그인
     * </pre>
     */
    public com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse signIn(com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 인증번호 인증
     * </pre>
     */
    public com.google.protobuf.Empty verify(com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerifyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountFutureStub extends io.grpc.stub.AbstractStub<AccountFutureStub> {
    private AccountFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 회원가입
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication> signUp(
        com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 로그인
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse> signIn(
        com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 인증번호 인증
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> verify(
        com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_UP = 0;
  private static final int METHODID_SIGN_IN = 1;
  private static final int METHODID_VERIFY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_UP:
          serviceImpl.signUp((com.depromeet.warmup.grpc.service.AccountOuterClass.SignUpRequest) request,
              (io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication>) responseObserver);
          break;
        case METHODID_SIGN_IN:
          serviceImpl.signIn((com.depromeet.warmup.grpc.service.AccountOuterClass.SignInRequest) request,
              (io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.service.AccountOuterClass.SignInResponse>) responseObserver);
          break;
        case METHODID_VERIFY:
          serviceImpl.verify((com.depromeet.warmup.grpc.service.AccountOuterClass.VerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.depromeet.warmup.grpc.service.AccountOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Account");
    }
  }

  private static final class AccountFileDescriptorSupplier
      extends AccountBaseDescriptorSupplier {
    AccountFileDescriptorSupplier() {}
  }

  private static final class AccountMethodDescriptorSupplier
      extends AccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AccountGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountFileDescriptorSupplier())
              .addMethod(getSignUpMethod())
              .addMethod(getSignInMethod())
              .addMethod(getVerifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
