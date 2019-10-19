package com.depromeet.warmup.global.entity;

import com.google.protobuf.GeneratedMessageV3;

@FunctionalInterface
public interface ProtobufConverter<T extends GeneratedMessageV3> {

    T toProtoBuf();
}
