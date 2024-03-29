// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity/authentication.proto

package com.depromeet.warmup.grpc.entity;

public final class AuthenticationOuterClass {
  private AuthenticationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AuthenticationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:warmup.entity.Authentication)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string email = 1;</code>
     * @return The email.
     */
    java.lang.String getEmail();
    /**
     * <code>string email = 1;</code>
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    /**
     * <code>.warmup.entity.User user = 2;</code>
     * @return Whether the user field is set.
     */
    boolean hasUser();
    /**
     * <code>.warmup.entity.User user = 2;</code>
     * @return The user.
     */
    com.depromeet.warmup.grpc.entity.UserOuterClass.User getUser();
    /**
     * <code>.warmup.entity.User user = 2;</code>
     */
    com.depromeet.warmup.grpc.entity.UserOuterClass.UserOrBuilder getUserOrBuilder();
  }
  /**
   * <pre>
   * 인증 정보
   * </pre>
   *
   * Protobuf type {@code warmup.entity.Authentication}
   */
  public  static final class Authentication extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:warmup.entity.Authentication)
      AuthenticationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Authentication.newBuilder() to construct.
    private Authentication(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Authentication() {
      email_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Authentication();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Authentication(
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

              email_ = s;
              break;
            }
            case 18: {
              com.depromeet.warmup.grpc.entity.UserOuterClass.User.Builder subBuilder = null;
              if (user_ != null) {
                subBuilder = user_.toBuilder();
              }
              user_ = input.readMessage(com.depromeet.warmup.grpc.entity.UserOuterClass.User.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(user_);
                user_ = subBuilder.buildPartial();
              }

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
      return com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.internal_static_warmup_entity_Authentication_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.internal_static_warmup_entity_Authentication_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication.class, com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication.Builder.class);
    }

    public static final int EMAIL_FIELD_NUMBER = 1;
    private volatile java.lang.Object email_;
    /**
     * <code>string email = 1;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      }
    }
    /**
     * <code>string email = 1;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USER_FIELD_NUMBER = 2;
    private com.depromeet.warmup.grpc.entity.UserOuterClass.User user_;
    /**
     * <code>.warmup.entity.User user = 2;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return user_ != null;
    }
    /**
     * <code>.warmup.entity.User user = 2;</code>
     * @return The user.
     */
    public com.depromeet.warmup.grpc.entity.UserOuterClass.User getUser() {
      return user_ == null ? com.depromeet.warmup.grpc.entity.UserOuterClass.User.getDefaultInstance() : user_;
    }
    /**
     * <code>.warmup.entity.User user = 2;</code>
     */
    public com.depromeet.warmup.grpc.entity.UserOuterClass.UserOrBuilder getUserOrBuilder() {
      return getUser();
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
      if (!getEmailBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, email_);
      }
      if (user_ != null) {
        output.writeMessage(2, getUser());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getEmailBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, email_);
      }
      if (user_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getUser());
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
      if (!(obj instanceof com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication)) {
        return super.equals(obj);
      }
      com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication other = (com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication) obj;

      if (!getEmail()
          .equals(other.getEmail())) return false;
      if (hasUser() != other.hasUser()) return false;
      if (hasUser()) {
        if (!getUser()
            .equals(other.getUser())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + EMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getEmail().hashCode();
      if (hasUser()) {
        hash = (37 * hash) + USER_FIELD_NUMBER;
        hash = (53 * hash) + getUser().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parseFrom(
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
    public static Builder newBuilder(com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication prototype) {
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
     * 인증 정보
     * </pre>
     *
     * Protobuf type {@code warmup.entity.Authentication}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:warmup.entity.Authentication)
        com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.AuthenticationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.internal_static_warmup_entity_Authentication_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.internal_static_warmup_entity_Authentication_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication.class, com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication.Builder.class);
      }

      // Construct using com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication.newBuilder()
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
        email_ = "";

        if (userBuilder_ == null) {
          user_ = null;
        } else {
          user_ = null;
          userBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.internal_static_warmup_entity_Authentication_descriptor;
      }

      @java.lang.Override
      public com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication getDefaultInstanceForType() {
        return com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication.getDefaultInstance();
      }

      @java.lang.Override
      public com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication build() {
        com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication buildPartial() {
        com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication result = new com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication(this);
        result.email_ = email_;
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
        }
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
        if (other instanceof com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication) {
          return mergeFrom((com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication other) {
        if (other == com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication.getDefaultInstance()) return this;
        if (!other.getEmail().isEmpty()) {
          email_ = other.email_;
          onChanged();
        }
        if (other.hasUser()) {
          mergeUser(other.getUser());
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
        com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>string email = 1;</code>
       * @return The email.
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string email = 1;</code>
       * @return The bytes for email.
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string email = 1;</code>
       * @param value The email to set.
       * @return This builder for chaining.
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        email_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string email = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmail() {
        
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      /**
       * <code>string email = 1;</code>
       * @param value The bytes for email to set.
       * @return This builder for chaining.
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        email_ = value;
        onChanged();
        return this;
      }

      private com.depromeet.warmup.grpc.entity.UserOuterClass.User user_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.depromeet.warmup.grpc.entity.UserOuterClass.User, com.depromeet.warmup.grpc.entity.UserOuterClass.User.Builder, com.depromeet.warmup.grpc.entity.UserOuterClass.UserOrBuilder> userBuilder_;
      /**
       * <code>.warmup.entity.User user = 2;</code>
       * @return Whether the user field is set.
       */
      public boolean hasUser() {
        return userBuilder_ != null || user_ != null;
      }
      /**
       * <code>.warmup.entity.User user = 2;</code>
       * @return The user.
       */
      public com.depromeet.warmup.grpc.entity.UserOuterClass.User getUser() {
        if (userBuilder_ == null) {
          return user_ == null ? com.depromeet.warmup.grpc.entity.UserOuterClass.User.getDefaultInstance() : user_;
        } else {
          return userBuilder_.getMessage();
        }
      }
      /**
       * <code>.warmup.entity.User user = 2;</code>
       */
      public Builder setUser(com.depromeet.warmup.grpc.entity.UserOuterClass.User value) {
        if (userBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          user_ = value;
          onChanged();
        } else {
          userBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.warmup.entity.User user = 2;</code>
       */
      public Builder setUser(
          com.depromeet.warmup.grpc.entity.UserOuterClass.User.Builder builderForValue) {
        if (userBuilder_ == null) {
          user_ = builderForValue.build();
          onChanged();
        } else {
          userBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.warmup.entity.User user = 2;</code>
       */
      public Builder mergeUser(com.depromeet.warmup.grpc.entity.UserOuterClass.User value) {
        if (userBuilder_ == null) {
          if (user_ != null) {
            user_ =
              com.depromeet.warmup.grpc.entity.UserOuterClass.User.newBuilder(user_).mergeFrom(value).buildPartial();
          } else {
            user_ = value;
          }
          onChanged();
        } else {
          userBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.warmup.entity.User user = 2;</code>
       */
      public Builder clearUser() {
        if (userBuilder_ == null) {
          user_ = null;
          onChanged();
        } else {
          user_ = null;
          userBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.warmup.entity.User user = 2;</code>
       */
      public com.depromeet.warmup.grpc.entity.UserOuterClass.User.Builder getUserBuilder() {
        
        onChanged();
        return getUserFieldBuilder().getBuilder();
      }
      /**
       * <code>.warmup.entity.User user = 2;</code>
       */
      public com.depromeet.warmup.grpc.entity.UserOuterClass.UserOrBuilder getUserOrBuilder() {
        if (userBuilder_ != null) {
          return userBuilder_.getMessageOrBuilder();
        } else {
          return user_ == null ?
              com.depromeet.warmup.grpc.entity.UserOuterClass.User.getDefaultInstance() : user_;
        }
      }
      /**
       * <code>.warmup.entity.User user = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.depromeet.warmup.grpc.entity.UserOuterClass.User, com.depromeet.warmup.grpc.entity.UserOuterClass.User.Builder, com.depromeet.warmup.grpc.entity.UserOuterClass.UserOrBuilder> 
          getUserFieldBuilder() {
        if (userBuilder_ == null) {
          userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.depromeet.warmup.grpc.entity.UserOuterClass.User, com.depromeet.warmup.grpc.entity.UserOuterClass.User.Builder, com.depromeet.warmup.grpc.entity.UserOuterClass.UserOrBuilder>(
                  getUser(),
                  getParentForChildren(),
                  isClean());
          user_ = null;
        }
        return userBuilder_;
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


      // @@protoc_insertion_point(builder_scope:warmup.entity.Authentication)
    }

    // @@protoc_insertion_point(class_scope:warmup.entity.Authentication)
    private static final com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication();
    }

    public static com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Authentication>
        PARSER = new com.google.protobuf.AbstractParser<Authentication>() {
      @java.lang.Override
      public Authentication parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Authentication(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Authentication> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Authentication> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.depromeet.warmup.grpc.entity.AuthenticationOuterClass.Authentication getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_warmup_entity_Authentication_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_warmup_entity_Authentication_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033entity/authentication.proto\022\rwarmup.en" +
      "tity\032\021entity/user.proto\"B\n\016Authenticatio" +
      "n\022\r\n\005email\030\001 \001(\t\022!\n\004user\030\002 \001(\0132\023.warmup." +
      "entity.UserB\"\n com.depromeet.warmup.grpc" +
      ".entityb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.depromeet.warmup.grpc.entity.UserOuterClass.getDescriptor(),
        });
    internal_static_warmup_entity_Authentication_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_warmup_entity_Authentication_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_warmup_entity_Authentication_descriptor,
        new java.lang.String[] { "Email", "User", });
    com.depromeet.warmup.grpc.entity.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
