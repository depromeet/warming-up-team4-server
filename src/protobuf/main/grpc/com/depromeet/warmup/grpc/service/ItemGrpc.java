package com.depromeet.warmup.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: service/Item.proto")
public final class ItemGrpc {

  private ItemGrpc() {}

  public static final String SERVICE_NAME = "warmup.service.Item";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest,
      com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Save",
      requestType = com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest.class,
      responseType = com.depromeet.warmup.grpc.entity.ItemOuterClass.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest,
      com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> getSaveMethod() {
    io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest, com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> getSaveMethod;
    if ((getSaveMethod = ItemGrpc.getSaveMethod) == null) {
      synchronized (ItemGrpc.class) {
        if ((getSaveMethod = ItemGrpc.getSaveMethod) == null) {
          ItemGrpc.getSaveMethod = getSaveMethod =
              io.grpc.MethodDescriptor.<com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest, com.depromeet.warmup.grpc.entity.ItemOuterClass.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.entity.ItemOuterClass.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemMethodDescriptorSupplier("Save"))
              .build();
        }
      }
    }
    return getSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest,
      com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAll",
      requestType = com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest.class,
      responseType = com.depromeet.warmup.grpc.entity.ItemOuterClass.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest,
      com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> getFindAllMethod() {
    io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest, com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> getFindAllMethod;
    if ((getFindAllMethod = ItemGrpc.getFindAllMethod) == null) {
      synchronized (ItemGrpc.class) {
        if ((getFindAllMethod = ItemGrpc.getFindAllMethod) == null) {
          ItemGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest, com.depromeet.warmup.grpc.entity.ItemOuterClass.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.entity.ItemOuterClass.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemMethodDescriptorSupplier("FindAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest,
      com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindById",
      requestType = com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest.class,
      responseType = com.depromeet.warmup.grpc.entity.ItemOuterClass.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest,
      com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> getFindByIdMethod() {
    io.grpc.MethodDescriptor<com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest, com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> getFindByIdMethod;
    if ((getFindByIdMethod = ItemGrpc.getFindByIdMethod) == null) {
      synchronized (ItemGrpc.class) {
        if ((getFindByIdMethod = ItemGrpc.getFindByIdMethod) == null) {
          ItemGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest, com.depromeet.warmup.grpc.entity.ItemOuterClass.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.depromeet.warmup.grpc.entity.ItemOuterClass.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemMethodDescriptorSupplier("FindById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemStub newStub(io.grpc.Channel channel) {
    return new ItemStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ItemBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ItemFutureStub(channel);
  }

  /**
   */
  public static abstract class ItemImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 물품 등록
     * </pre>
     */
    public void save(com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    /**
     * <pre>
     * 물품 조회 (피드)
     * </pre>
     */
    public void findAll(com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
      asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * 물품 상세 조회
     * </pre>
     */
    public void findById(com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
      asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest,
                com.depromeet.warmup.grpc.entity.ItemOuterClass.Item>(
                  this, METHODID_SAVE)))
          .addMethod(
            getFindAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest,
                com.depromeet.warmup.grpc.entity.ItemOuterClass.Item>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getFindByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest,
                com.depromeet.warmup.grpc.entity.ItemOuterClass.Item>(
                  this, METHODID_FIND_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ItemStub extends io.grpc.stub.AbstractStub<ItemStub> {
    private ItemStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemStub(channel, callOptions);
    }

    /**
     * <pre>
     * 물품 등록
     * </pre>
     */
    public void save(com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 물품 조회 (피드)
     * </pre>
     */
    public void findAll(com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 물품 상세 조회
     * </pre>
     */
    public void findById(com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest request,
        io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemBlockingStub extends io.grpc.stub.AbstractStub<ItemBlockingStub> {
    private ItemBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 물품 등록
     * </pre>
     */
    public com.depromeet.warmup.grpc.entity.ItemOuterClass.Item save(com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 물품 조회 (피드)
     * </pre>
     */
    public java.util.Iterator<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> findAll(
        com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 물품 상세 조회
     * </pre>
     */
    public com.depromeet.warmup.grpc.entity.ItemOuterClass.Item findById(com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemFutureStub extends io.grpc.stub.AbstractStub<ItemFutureStub> {
    private ItemFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 물품 등록
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> save(
        com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 물품 상세 조회
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item> findById(
        com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE = 0;
  private static final int METHODID_FIND_ALL = 1;
  private static final int METHODID_FIND_BY_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE:
          serviceImpl.save((com.depromeet.warmup.grpc.service.ItemOuterClass.SaveRequest) request,
              (io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((com.depromeet.warmup.grpc.service.ItemOuterClass.FindAllRequest) request,
              (io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((com.depromeet.warmup.grpc.service.ItemOuterClass.FindByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.depromeet.warmup.grpc.entity.ItemOuterClass.Item>) responseObserver);
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

  private static abstract class ItemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.depromeet.warmup.grpc.service.ItemOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Item");
    }
  }

  private static final class ItemFileDescriptorSupplier
      extends ItemBaseDescriptorSupplier {
    ItemFileDescriptorSupplier() {}
  }

  private static final class ItemMethodDescriptorSupplier
      extends ItemBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemFileDescriptorSupplier())
              .addMethod(getSaveMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getFindByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
