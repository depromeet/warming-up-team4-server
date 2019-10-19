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
    comments = "Source: service/health.proto")
public final class HealthGrpc {

  private HealthGrpc() {}

  public static final String SERVICE_NAME = "warmup.service.Health";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage,
      com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage.class,
      responseType = com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage,
      com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage> getEchoMethod() {
    io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage, com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage> getEchoMethod;
    if ((getEchoMethod = HealthGrpc.getEchoMethod) == null) {
      synchronized (HealthGrpc.class) {
        if ((getEchoMethod = HealthGrpc.getEchoMethod) == null) {
          HealthGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage, com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage.getDefaultInstance()))
              .setSchemaDescriptor(new HealthMethodDescriptorSupplier("Echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthStub newStub(io.grpc.Channel channel) {
    return new HealthStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HealthBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HealthFutureStub(channel);
  }

  /**
   */
  public static abstract class HealthImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 서버 헬스 체크를 위한 에코 메시지
     * </pre>
     */
    public void echo(com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEchoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage,
                com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage>(
                  this, METHODID_ECHO)))
          .build();
    }
  }

  /**
   */
  public static final class HealthStub extends io.grpc.stub.AbstractStub<HealthStub> {
    private HealthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthStub(channel, callOptions);
    }

    /**
     * <pre>
     * 서버 헬스 체크를 위한 에코 메시지
     * </pre>
     */
    public void echo(com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HealthBlockingStub extends io.grpc.stub.AbstractStub<HealthBlockingStub> {
    private HealthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 서버 헬스 체크를 위한 에코 메시지
     * </pre>
     */
    public com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage echo(com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage request) {
      return blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HealthFutureStub extends io.grpc.stub.AbstractStub<HealthFutureStub> {
    private HealthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 서버 헬스 체크를 위한 에코 메시지
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage> echo(
        com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HealthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HealthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO:
          serviceImpl.echo((com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage) request,
              (io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.service.HealthOuterClass.EchoMessage>) responseObserver);
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

  private static abstract class HealthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HealthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.depromeet.warmup.grpc.service.HealthOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Health");
    }
  }

  private static final class HealthFileDescriptorSupplier
      extends HealthBaseDescriptorSupplier {
    HealthFileDescriptorSupplier() {}
  }

  private static final class HealthMethodDescriptorSupplier
      extends HealthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HealthMethodDescriptorSupplier(String methodName) {
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
      synchronized (HealthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HealthFileDescriptorSupplier())
              .addMethod(getEchoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
