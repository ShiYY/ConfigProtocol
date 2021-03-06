// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GM.proto

package info.xiaomo.server.protocol;

public final class GMProto {
  private GMProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CloseServerRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CloseServerRequest)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code CloseServerRequest}
   */
  public  static final class CloseServerRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CloseServerRequest)
      CloseServerRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CloseServerRequest.newBuilder() to construct.
    private CloseServerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CloseServerRequest() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CloseServerRequest(
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
            default: {
              if (!parseUnknownFieldProto3(
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
      return info.xiaomo.server.protocol.GMProto.internal_static_CloseServerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.protocol.GMProto.internal_static_CloseServerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.protocol.GMProto.CloseServerRequest.class, info.xiaomo.server.protocol.GMProto.CloseServerRequest.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof info.xiaomo.server.protocol.GMProto.CloseServerRequest)) {
        return super.equals(obj);
      }
      info.xiaomo.server.protocol.GMProto.CloseServerRequest other = (info.xiaomo.server.protocol.GMProto.CloseServerRequest) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest parseFrom(
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
    public static Builder newBuilder(info.xiaomo.server.protocol.GMProto.CloseServerRequest prototype) {
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
     * Protobuf type {@code CloseServerRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CloseServerRequest)
        info.xiaomo.server.protocol.GMProto.CloseServerRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return info.xiaomo.server.protocol.GMProto.internal_static_CloseServerRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return info.xiaomo.server.protocol.GMProto.internal_static_CloseServerRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                info.xiaomo.server.protocol.GMProto.CloseServerRequest.class, info.xiaomo.server.protocol.GMProto.CloseServerRequest.Builder.class);
      }

      // Construct using info.xiaomo.server.protocol.GMProto.CloseServerRequest.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return info.xiaomo.server.protocol.GMProto.internal_static_CloseServerRequest_descriptor;
      }

      @java.lang.Override
      public info.xiaomo.server.protocol.GMProto.CloseServerRequest getDefaultInstanceForType() {
        return info.xiaomo.server.protocol.GMProto.CloseServerRequest.getDefaultInstance();
      }

      @java.lang.Override
      public info.xiaomo.server.protocol.GMProto.CloseServerRequest build() {
        info.xiaomo.server.protocol.GMProto.CloseServerRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public info.xiaomo.server.protocol.GMProto.CloseServerRequest buildPartial() {
        info.xiaomo.server.protocol.GMProto.CloseServerRequest result = new info.xiaomo.server.protocol.GMProto.CloseServerRequest(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof info.xiaomo.server.protocol.GMProto.CloseServerRequest) {
          return mergeFrom((info.xiaomo.server.protocol.GMProto.CloseServerRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(info.xiaomo.server.protocol.GMProto.CloseServerRequest other) {
        if (other == info.xiaomo.server.protocol.GMProto.CloseServerRequest.getDefaultInstance()) return this;
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
        info.xiaomo.server.protocol.GMProto.CloseServerRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (info.xiaomo.server.protocol.GMProto.CloseServerRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CloseServerRequest)
    }

    // @@protoc_insertion_point(class_scope:CloseServerRequest)
    private static final info.xiaomo.server.protocol.GMProto.CloseServerRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new info.xiaomo.server.protocol.GMProto.CloseServerRequest();
    }

    public static info.xiaomo.server.protocol.GMProto.CloseServerRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CloseServerRequest>
        PARSER = new com.google.protobuf.AbstractParser<CloseServerRequest>() {
      @java.lang.Override
      public CloseServerRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CloseServerRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CloseServerRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CloseServerRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public info.xiaomo.server.protocol.GMProto.CloseServerRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CloseServerResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CloseServerResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string resMsg = 1;</code>
     */
    java.lang.String getResMsg();
    /**
     * <code>string resMsg = 1;</code>
     */
    com.google.protobuf.ByteString
        getResMsgBytes();
  }
  /**
   * Protobuf type {@code CloseServerResponse}
   */
  public  static final class CloseServerResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CloseServerResponse)
      CloseServerResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CloseServerResponse.newBuilder() to construct.
    private CloseServerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CloseServerResponse() {
      resMsg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CloseServerResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              resMsg_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return info.xiaomo.server.protocol.GMProto.internal_static_CloseServerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.protocol.GMProto.internal_static_CloseServerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.protocol.GMProto.CloseServerResponse.class, info.xiaomo.server.protocol.GMProto.CloseServerResponse.Builder.class);
    }

    public static final int RESMSG_FIELD_NUMBER = 1;
    private volatile java.lang.Object resMsg_;
    /**
     * <code>string resMsg = 1;</code>
     */
    public java.lang.String getResMsg() {
      java.lang.Object ref = resMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resMsg_ = s;
        return s;
      }
    }
    /**
     * <code>string resMsg = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResMsgBytes() {
      java.lang.Object ref = resMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resMsg_ = b;
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
      if (!getResMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resMsg_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getResMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resMsg_);
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
      if (!(obj instanceof info.xiaomo.server.protocol.GMProto.CloseServerResponse)) {
        return super.equals(obj);
      }
      info.xiaomo.server.protocol.GMProto.CloseServerResponse other = (info.xiaomo.server.protocol.GMProto.CloseServerResponse) obj;

      boolean result = true;
      result = result && getResMsg()
          .equals(other.getResMsg());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RESMSG_FIELD_NUMBER;
      hash = (53 * hash) + getResMsg().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse parseFrom(
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
    public static Builder newBuilder(info.xiaomo.server.protocol.GMProto.CloseServerResponse prototype) {
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
     * Protobuf type {@code CloseServerResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CloseServerResponse)
        info.xiaomo.server.protocol.GMProto.CloseServerResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return info.xiaomo.server.protocol.GMProto.internal_static_CloseServerResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return info.xiaomo.server.protocol.GMProto.internal_static_CloseServerResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                info.xiaomo.server.protocol.GMProto.CloseServerResponse.class, info.xiaomo.server.protocol.GMProto.CloseServerResponse.Builder.class);
      }

      // Construct using info.xiaomo.server.protocol.GMProto.CloseServerResponse.newBuilder()
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
        resMsg_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return info.xiaomo.server.protocol.GMProto.internal_static_CloseServerResponse_descriptor;
      }

      @java.lang.Override
      public info.xiaomo.server.protocol.GMProto.CloseServerResponse getDefaultInstanceForType() {
        return info.xiaomo.server.protocol.GMProto.CloseServerResponse.getDefaultInstance();
      }

      @java.lang.Override
      public info.xiaomo.server.protocol.GMProto.CloseServerResponse build() {
        info.xiaomo.server.protocol.GMProto.CloseServerResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public info.xiaomo.server.protocol.GMProto.CloseServerResponse buildPartial() {
        info.xiaomo.server.protocol.GMProto.CloseServerResponse result = new info.xiaomo.server.protocol.GMProto.CloseServerResponse(this);
        result.resMsg_ = resMsg_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof info.xiaomo.server.protocol.GMProto.CloseServerResponse) {
          return mergeFrom((info.xiaomo.server.protocol.GMProto.CloseServerResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(info.xiaomo.server.protocol.GMProto.CloseServerResponse other) {
        if (other == info.xiaomo.server.protocol.GMProto.CloseServerResponse.getDefaultInstance()) return this;
        if (!other.getResMsg().isEmpty()) {
          resMsg_ = other.resMsg_;
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
        info.xiaomo.server.protocol.GMProto.CloseServerResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (info.xiaomo.server.protocol.GMProto.CloseServerResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object resMsg_ = "";
      /**
       * <code>string resMsg = 1;</code>
       */
      public java.lang.String getResMsg() {
        java.lang.Object ref = resMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          resMsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string resMsg = 1;</code>
       */
      public com.google.protobuf.ByteString
          getResMsgBytes() {
        java.lang.Object ref = resMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          resMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string resMsg = 1;</code>
       */
      public Builder setResMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        resMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string resMsg = 1;</code>
       */
      public Builder clearResMsg() {
        
        resMsg_ = getDefaultInstance().getResMsg();
        onChanged();
        return this;
      }
      /**
       * <code>string resMsg = 1;</code>
       */
      public Builder setResMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        resMsg_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CloseServerResponse)
    }

    // @@protoc_insertion_point(class_scope:CloseServerResponse)
    private static final info.xiaomo.server.protocol.GMProto.CloseServerResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new info.xiaomo.server.protocol.GMProto.CloseServerResponse();
    }

    public static info.xiaomo.server.protocol.GMProto.CloseServerResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CloseServerResponse>
        PARSER = new com.google.protobuf.AbstractParser<CloseServerResponse>() {
      @java.lang.Override
      public CloseServerResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CloseServerResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CloseServerResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CloseServerResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public info.xiaomo.server.protocol.GMProto.CloseServerResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CloseServerRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CloseServerRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CloseServerResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CloseServerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\010GM.proto\"\024\n\022CloseServerRequest\"%\n\023Clos" +
      "eServerResponse\022\016\n\006resMsg\030\001 \001(\tB&\n\033info." +
      "xiaomo.server.protocolB\007GMProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_CloseServerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CloseServerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CloseServerRequest_descriptor,
        new java.lang.String[] { });
    internal_static_CloseServerResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CloseServerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CloseServerResponse_descriptor,
        new java.lang.String[] { "ResMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
