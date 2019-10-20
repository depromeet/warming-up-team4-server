package com.depromeet.warmup.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: notification.proto")
public final class NotificationGrpc {

  private NotificationGrpc() {}

  public static final String SERVICE_NAME = "warmup.service.Notification";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm> getSubscribeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm> getSubscribeMethod;
    if ((getSubscribeMethod = NotificationGrpc.getSubscribeMethod) == null) {
      synchronized (NotificationGrpc.class) {
        if ((getSubscribeMethod = NotificationGrpc.getSubscribeMethod) == null) {
          NotificationGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.NotificationOuterClass.CheckRequest,
      com.google.protobuf.Empty> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Check",
      requestType = com.depromeet.warmup.grpc.service.NotificationOuterClass.CheckRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.NotificationOuterClass.CheckRequest,
      com.google.protobuf.Empty> getCheckMethod() {
    io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.NotificationOuterClass.CheckRequest, com.google.protobuf.Empty> getCheckMethod;
    if ((getCheckMethod = NotificationGrpc.getCheckMethod) == null) {
      synchronized (NotificationGrpc.class) {
        if ((getCheckMethod = NotificationGrpc.getCheckMethod) == null) {
          NotificationGrpc.getCheckMethod = getCheckMethod =
              io.grpc.MethodDescriptor.<com.depromeet.warmup.grpc.service.NotificationOuterClass.CheckRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.NotificationOuterClass.CheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationMethodDescriptorSupplier("Check"))
              .build();
        }
      }
    }
    return getCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationStub newStub(io.grpc.Channel channel) {
    return new NotificationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotificationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotificationFutureStub(channel);
  }

  /**
   */
  public static abstract class NotificationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 알람 받기
     * </pre>
     */
    public void subscribe(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     * <pre>
     * 알람 확인
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.service.NotificationOuterClass.CheckRequest> check(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscribeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getCheckMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.depromeet.warmup.grpc.service.NotificationOuterClass.CheckRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_CHECK)))
          .build();
    }
  }

  /**
   */
  public static final class NotificationStub extends io.grpc.stub.AbstractStub<NotificationStub> {
    private NotificationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationStub(channel, callOptions);
    }

    /**
     * <pre>
     * 알람 받기
     * </pre>
     */
    public void subscribe(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 알람 확인
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.service.NotificationOuterClass.CheckRequest> check(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class NotificationBlockingStub extends io.grpc.stub.AbstractStub<NotificationBlockingStub> {
    private NotificationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 알람 받기
     * </pre>
     */
    public java.util.Iterator<com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm> subscribe(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotificationFutureStub extends io.grpc.stub.AbstractStub<NotificationFutureStub> {
    private NotificationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SUBSCRIBE = 0;
  private static final int METHODID_CHECK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.AlarmOuterClass.Alarm>) responseObserver);
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
        case METHODID_CHECK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.check(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NotificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.depromeet.warmup.grpc.service.NotificationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Notification");
    }
  }

  private static final class NotificationFileDescriptorSupplier
      extends NotificationBaseDescriptorSupplier {
    NotificationFileDescriptorSupplier() {}
  }

  private static final class NotificationMethodDescriptorSupplier
      extends NotificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotificationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationFileDescriptorSupplier())
              .addMethod(getSubscribeMethod())
              .addMethod(getCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
