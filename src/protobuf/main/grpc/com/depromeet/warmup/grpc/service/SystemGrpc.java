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
    comments = "Source: service/system.proto")
public final class SystemGrpc {

  private SystemGrpc() {}

  public static final String SERVICE_NAME = "warmup.service.System";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64> getCurrentTimeMillisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentTimeMillis",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64> getCurrentTimeMillisMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64> getCurrentTimeMillisMethod;
    if ((getCurrentTimeMillisMethod = SystemGrpc.getCurrentTimeMillisMethod) == null) {
      synchronized (SystemGrpc.class) {
        if ((getCurrentTimeMillisMethod = SystemGrpc.getCurrentTimeMillisMethod) == null) {
          SystemGrpc.getCurrentTimeMillisMethod = getCurrentTimeMillisMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentTimeMillis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64.getDefaultInstance()))
              .setSchemaDescriptor(new SystemMethodDescriptorSupplier("CurrentTimeMillis"))
              .build();
        }
      }
    }
    return getCurrentTimeMillisMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SystemStub newStub(io.grpc.Channel channel) {
    return new SystemStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SystemBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SystemBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SystemFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SystemFutureStub(channel);
  }

  /**
   */
  public static abstract class SystemImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 현재 시간을 timestamp 형식으로 가져옴
     * </pre>
     */
    public void currentTimeMillis(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64> responseObserver) {
      asyncUnimplementedUnaryCall(getCurrentTimeMillisMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCurrentTimeMillisMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64>(
                  this, METHODID_CURRENT_TIME_MILLIS)))
          .build();
    }
  }

  /**
   */
  public static final class SystemStub extends io.grpc.stub.AbstractStub<SystemStub> {
    private SystemStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SystemStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SystemStub(channel, callOptions);
    }

    /**
     * <pre>
     * 현재 시간을 timestamp 형식으로 가져옴
     * </pre>
     */
    public void currentTimeMillis(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCurrentTimeMillisMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SystemBlockingStub extends io.grpc.stub.AbstractStub<SystemBlockingStub> {
    private SystemBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SystemBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SystemBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 현재 시간을 timestamp 형식으로 가져옴
     * </pre>
     */
    public com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64 currentTimeMillis(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getCurrentTimeMillisMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SystemFutureStub extends io.grpc.stub.AbstractStub<SystemFutureStub> {
    private SystemFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SystemFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SystemFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 현재 시간을 timestamp 형식으로 가져옴
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64> currentTimeMillis(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getCurrentTimeMillisMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CURRENT_TIME_MILLIS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SystemImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SystemImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CURRENT_TIME_MILLIS:
          serviceImpl.currentTimeMillis((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.vo.Int64OuterClass.Int64>) responseObserver);
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

  private static abstract class SystemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SystemBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.depromeet.warmup.grpc.service.SystemOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("System");
    }
  }

  private static final class SystemFileDescriptorSupplier
      extends SystemBaseDescriptorSupplier {
    SystemFileDescriptorSupplier() {}
  }

  private static final class SystemMethodDescriptorSupplier
      extends SystemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SystemMethodDescriptorSupplier(String methodName) {
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
      synchronized (SystemGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SystemFileDescriptorSupplier())
              .addMethod(getCurrentTimeMillisMethod())
              .build();
        }
      }
    }
    return result;
  }
}
