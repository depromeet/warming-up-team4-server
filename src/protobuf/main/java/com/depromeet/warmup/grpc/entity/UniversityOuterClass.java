// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity/university.proto

package com.depromeet.warmup.grpc.entity;

public final class UniversityOuterClass {
  private UniversityOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UniversityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:warmup.entity.University)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string emailDomain = 2;</code>
     * @return The emailDomain.
     */
    java.lang.String getEmailDomain();
    /**
     * <code>string emailDomain = 2;</code>
     * @return The bytes for emailDomain.
     */
    com.google.protobuf.ByteString
        getEmailDomainBytes();
  }
  /**
   * <pre>
   * 대학 정보
   * </pre>
   *
   * Protobuf type {@code warmup.entity.University}
   */
  public  static final class University extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:warmup.entity.University)
      UniversityOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use University.newBuilder() to construct.
    private University(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private University() {
      name_ = "";
      emailDomain_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new University();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private University(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              emailDomain_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.depromeet.warmup.grpc.entity.UniversityOuterClass.internal_static_warmup_entity_University_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.depromeet.warmup.grpc.entity.UniversityOuterClass.internal_static_warmup_entity_University_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.depromeet.warmup.grpc.entity.UniversityOuterClass.University.class, com.depromeet.warmup.grpc.entity.UniversityOuterClass.University.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EMAILDOMAIN_FIELD_NUMBER = 2;
    private volatile java.lang.Object emailDomain_;
    /**
     * <code>string emailDomain = 2;</code>
     * @return The emailDomain.
     */
    public java.lang.String getEmailDomain() {
      java.lang.Object ref = emailDomain_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        emailDomain_ = s;
        return s;
      }
    }
    /**
     * <code>string emailDomain = 2;</code>
     * @return The bytes for emailDomain.
     */
    public com.google.protobuf.ByteString
        getEmailDomainBytes() {
      java.lang.Object ref = emailDomain_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        emailDomain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!getEmailDomainBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, emailDomain_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!getEmailDomainBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, emailDomain_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.depromeet.warmup.grpc.entity.UniversityOuterClass.University)) {
        return super.equals(obj);
      }
      com.depromeet.warmup.grpc.entity.UniversityOuterClass.University other = (com.depromeet.warmup.grpc.entity.UniversityOuterClass.University) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getEmailDomain()
          .equals(other.getEmailDomain())) return false;
        return unknownFields.equals(other.unknownFields);
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + EMAILDOMAIN_FIELD_NUMBER;
      hash = (53 * hash) + getEmailDomain().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.depromeet.warmup.grpc.entity.UniversityOuterClass.University prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 대학 정보
     * </pre>
     *
     * Protobuf type {@code warmup.entity.University}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:warmup.entity.University)
        com.depromeet.warmup.grpc.entity.UniversityOuterClass.UniversityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.depromeet.warmup.grpc.entity.UniversityOuterClass.internal_static_warmup_entity_University_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.depromeet.warmup.grpc.entity.UniversityOuterClass.internal_static_warmup_entity_University_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.depromeet.warmup.grpc.entity.UniversityOuterClass.University.class, com.depromeet.warmup.grpc.entity.UniversityOuterClass.University.Builder.class);
      }

      // Construct using com.depromeet.warmup.grpc.entity.UniversityOuterClass.University.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        emailDomain_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.depromeet.warmup.grpc.entity.UniversityOuterClass.internal_static_warmup_entity_University_descriptor;
      }

      @java.lang.Override
      public com.depromeet.warmup.grpc.entity.UniversityOuterClass.University getDefaultInstanceForType() {
        return com.depromeet.warmup.grpc.entity.UniversityOuterClass.University.getDefaultInstance();
      }

      @java.lang.Override
      public com.depromeet.warmup.grpc.entity.UniversityOuterClass.University build() {
        com.depromeet.warmup.grpc.entity.UniversityOuterClass.University result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.depromeet.warmup.grpc.entity.UniversityOuterClass.University buildPartial() {
        com.depromeet.warmup.grpc.entity.UniversityOuterClass.University result = new com.depromeet.warmup.grpc.entity.UniversityOuterClass.University(this);
        result.name_ = name_;
        result.emailDomain_ = emailDomain_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.depromeet.warmup.grpc.entity.UniversityOuterClass.University) {
          return mergeFrom((com.depromeet.warmup.grpc.entity.UniversityOuterClass.University)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.depromeet.warmup.grpc.entity.UniversityOuterClass.University other) {
        if (other == com.depromeet.warmup.grpc.entity.UniversityOuterClass.University.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getEmailDomain().isEmpty()) {
          emailDomain_ = other.emailDomain_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.depromeet.warmup.grpc.entity.UniversityOuterClass.University parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.depromeet.warmup.grpc.entity.UniversityOuterClass.University) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object emailDomain_ = "";
      /**
       * <code>string emailDomain = 2;</code>
       * @return The emailDomain.
       */
      public java.lang.String getEmailDomain() {
        java.lang.Object ref = emailDomain_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          emailDomain_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string emailDomain = 2;</code>
       * @return The bytes for emailDomain.
       */
      public com.google.protobuf.ByteString
          getEmailDomainBytes() {
        java.lang.Object ref = emailDomain_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          emailDomain_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string emailDomain = 2;</code>
       * @param value The emailDomain to set.
       * @return This builder for chaining.
       */
      public Builder setEmailDomain(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        emailDomain_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string emailDomain = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmailDomain() {
        
        emailDomain_ = getDefaultInstance().getEmailDomain();
        onChanged();
        return this;
      }
      /**
       * <code>string emailDomain = 2;</code>
       * @param value The bytes for emailDomain to set.
       * @return This builder for chaining.
       */
      public Builder setEmailDomainBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        emailDomain_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:warmup.entity.University)
    }

    // @@protoc_insertion_point(class_scope:warmup.entity.University)
    private static final com.depromeet.warmup.grpc.entity.UniversityOuterClass.University DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.depromeet.warmup.grpc.entity.UniversityOuterClass.University();
    }

    public static com.depromeet.warmup.grpc.entity.UniversityOuterClass.University getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<University>
        PARSER = new com.google.protobuf.AbstractParser<University>() {
      @java.lang.Override
      public University parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new University(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<University> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<University> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.depromeet.warmup.grpc.entity.UniversityOuterClass.University getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_warmup_entity_University_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_warmup_entity_University_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027entity/university.proto\022\rwarmup.entity" +
      "\"/\n\nUniversity\022\014\n\004name\030\001 \001(\t\022\023\n\013emailDom" +
      "ain\030\002 \001(\tB\"\n com.depromeet.warmup.grpc.e" +
      "ntityb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_warmup_entity_University_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_warmup_entity_University_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_warmup_entity_University_descriptor,
        new java.lang.String[] { "Name", "EmailDomain", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}