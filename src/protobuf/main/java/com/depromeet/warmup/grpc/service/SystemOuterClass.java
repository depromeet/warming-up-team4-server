// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: system.proto

package com.depromeet.warmup.grpc.service;

public final class SystemOuterClass {
  private SystemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014system.proto\022\016warmup.service\032\033google/p" +
      "rotobuf/empty.proto\032\016vo/int64.proto2G\n\006S" +
      "ystem\022=\n\021CurrentTimeMillis\022\026.google.prot" +
      "obuf.Empty\032\020.warmup.vo.Int64B#\n!com.depr" +
      "omeet.warmup.grpc.serviceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.depromeet.warmup.grpc.vo.Int64OuterClass.getDescriptor(),
        });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.depromeet.warmup.grpc.vo.Int64OuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
