package com.depromeet.warmup.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: barter.proto")
public final class BarterGrpc {

  private BarterGrpc() {}

  public static final String SERVICE_NAME = "warmup.service.Barter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest,
      com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest> getAskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ask",
      requestType = com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest.class,
      responseType = com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest,
      com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest> getAskMethod() {
    io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest, com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest> getAskMethod;
    if ((getAskMethod = BarterGrpc.getAskMethod) == null) {
      synchronized (BarterGrpc.class) {
        if ((getAskMethod = BarterGrpc.getAskMethod) == null) {
          BarterGrpc.getAskMethod = getAskMethod =
              io.grpc.MethodDescriptor.<com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest, com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest.getDefaultInstance()))
              .setSchemaDescriptor(new BarterMethodDescriptorSupplier("Ask"))
              .build();
        }
      }
    }
    return getAskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest,
      com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction> getAnswerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Answer",
      requestType = com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest.class,
      responseType = com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest,
      com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction> getAnswerMethod() {
    io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest, com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction> getAnswerMethod;
    if ((getAnswerMethod = BarterGrpc.getAnswerMethod) == null) {
      synchronized (BarterGrpc.class) {
        if ((getAnswerMethod = BarterGrpc.getAnswerMethod) == null) {
          BarterGrpc.getAnswerMethod = getAnswerMethod =
              io.grpc.MethodDescriptor.<com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest, com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Answer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction.getDefaultInstance()))
              .setSchemaDescriptor(new BarterMethodDescriptorSupplier("Answer"))
              .build();
        }
      }
    }
    return getAnswerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BarterStub newStub(io.grpc.Channel channel) {
    return new BarterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BarterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BarterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BarterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BarterFutureStub(channel);
  }

  /**
   */
  public static abstract class BarterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 물물교환 신청
     * </pre>
     */
    public void ask(com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getAskMethod(), responseObserver);
    }

    /**
     * <pre>
     * 물물교환 응답
     * </pre>
     */
    public void answer(com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getAnswerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest,
                com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest>(
                  this, METHODID_ASK)))
          .addMethod(
            getAnswerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest,
                com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction>(
                  this, METHODID_ANSWER)))
          .build();
    }
  }

  /**
   */
  public static final class BarterStub extends io.grpc.stub.AbstractStub<BarterStub> {
    private BarterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BarterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BarterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BarterStub(channel, callOptions);
    }

    /**
     * <pre>
     * 물물교환 신청
     * </pre>
     */
    public void ask(com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 물물교환 응답
     * </pre>
     */
    public void answer(com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAnswerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BarterBlockingStub extends io.grpc.stub.AbstractStub<BarterBlockingStub> {
    private BarterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BarterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BarterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BarterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 물물교환 신청
     * </pre>
     */
    public com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest ask(com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest request) {
      return blockingUnaryCall(
          getChannel(), getAskMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 물물교환 응답
     * </pre>
     */
    public com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction answer(com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAnswerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BarterFutureStub extends io.grpc.stub.AbstractStub<BarterFutureStub> {
    private BarterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BarterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BarterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BarterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 물물교환 신청
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest> ask(
        com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAskMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 물물교환 응답
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction> answer(
        com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAnswerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASK = 0;
  private static final int METHODID_ANSWER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BarterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BarterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASK:
          serviceImpl.ask((com.depromeet.warmup.grpc.service.BarterOuterClass.AskRequest) request,
              (io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.BarterRequestOuterClass.BarterRequest>) responseObserver);
          break;
        case METHODID_ANSWER:
          serviceImpl.answer((com.depromeet.warmup.grpc.service.BarterOuterClass.AnswerRequest) request,
              (io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.BarterTransactionOuterClass.BarterTransaction>) responseObserver);
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

  private static abstract class BarterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BarterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.depromeet.warmup.grpc.service.BarterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Barter");
    }
  }

  private static final class BarterFileDescriptorSupplier
      extends BarterBaseDescriptorSupplier {
    BarterFileDescriptorSupplier() {}
  }

  private static final class BarterMethodDescriptorSupplier
      extends BarterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BarterMethodDescriptorSupplier(String methodName) {
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
      synchronized (BarterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BarterFileDescriptorSupplier())
              .addMethod(getAskMethod())
              .addMethod(getAnswerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
