// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/schema.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code RelationShipProto}
 */
public  final class RelationShipProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RelationShipProto)
    RelationShipProtoOrBuilder {
  // Use RelationShipProto.newBuilder() to construct.
  private RelationShipProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RelationShipProto() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RelationShipProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.alibaba.maxgraph.proto.TypeIdProto.Builder subBuilder = null;
            if (srcId_ != null) {
              subBuilder = srcId_.toBuilder();
            }
            srcId_ = input.readMessage(com.alibaba.maxgraph.proto.TypeIdProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(srcId_);
              srcId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.alibaba.maxgraph.proto.TypeIdProto.Builder subBuilder = null;
            if (dstId_ != null) {
              subBuilder = dstId_.toBuilder();
            }
            dstId_ = input.readMessage(com.alibaba.maxgraph.proto.TypeIdProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dstId_);
              dstId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.alibaba.maxgraph.proto.TypeIdProto.Builder subBuilder = null;
            if (edgeId_ != null) {
              subBuilder = edgeId_.toBuilder();
            }
            edgeId_ = input.readMessage(com.alibaba.maxgraph.proto.TypeIdProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(edgeId_);
              edgeId_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.Schema.internal_static_RelationShipProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.Schema.internal_static_RelationShipProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.RelationShipProto.class, com.alibaba.maxgraph.proto.RelationShipProto.Builder.class);
  }

  public static final int SRCID_FIELD_NUMBER = 1;
  private com.alibaba.maxgraph.proto.TypeIdProto srcId_;
  /**
   * <code>optional .TypeIdProto srcId = 1;</code>
   */
  public boolean hasSrcId() {
    return srcId_ != null;
  }
  /**
   * <code>optional .TypeIdProto srcId = 1;</code>
   */
  public com.alibaba.maxgraph.proto.TypeIdProto getSrcId() {
    return srcId_ == null ? com.alibaba.maxgraph.proto.TypeIdProto.getDefaultInstance() : srcId_;
  }
  /**
   * <code>optional .TypeIdProto srcId = 1;</code>
   */
  public com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder getSrcIdOrBuilder() {
    return getSrcId();
  }

  public static final int DSTID_FIELD_NUMBER = 2;
  private com.alibaba.maxgraph.proto.TypeIdProto dstId_;
  /**
   * <code>optional .TypeIdProto dstId = 2;</code>
   */
  public boolean hasDstId() {
    return dstId_ != null;
  }
  /**
   * <code>optional .TypeIdProto dstId = 2;</code>
   */
  public com.alibaba.maxgraph.proto.TypeIdProto getDstId() {
    return dstId_ == null ? com.alibaba.maxgraph.proto.TypeIdProto.getDefaultInstance() : dstId_;
  }
  /**
   * <code>optional .TypeIdProto dstId = 2;</code>
   */
  public com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder getDstIdOrBuilder() {
    return getDstId();
  }

  public static final int EDGEID_FIELD_NUMBER = 3;
  private com.alibaba.maxgraph.proto.TypeIdProto edgeId_;
  /**
   * <code>optional .TypeIdProto edgeId = 3;</code>
   */
  public boolean hasEdgeId() {
    return edgeId_ != null;
  }
  /**
   * <code>optional .TypeIdProto edgeId = 3;</code>
   */
  public com.alibaba.maxgraph.proto.TypeIdProto getEdgeId() {
    return edgeId_ == null ? com.alibaba.maxgraph.proto.TypeIdProto.getDefaultInstance() : edgeId_;
  }
  /**
   * <code>optional .TypeIdProto edgeId = 3;</code>
   */
  public com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder getEdgeIdOrBuilder() {
    return getEdgeId();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (srcId_ != null) {
      output.writeMessage(1, getSrcId());
    }
    if (dstId_ != null) {
      output.writeMessage(2, getDstId());
    }
    if (edgeId_ != null) {
      output.writeMessage(3, getEdgeId());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (srcId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSrcId());
    }
    if (dstId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDstId());
    }
    if (edgeId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEdgeId());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alibaba.maxgraph.proto.RelationShipProto)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.RelationShipProto other = (com.alibaba.maxgraph.proto.RelationShipProto) obj;

    boolean result = true;
    result = result && (hasSrcId() == other.hasSrcId());
    if (hasSrcId()) {
      result = result && getSrcId()
          .equals(other.getSrcId());
    }
    result = result && (hasDstId() == other.hasDstId());
    if (hasDstId()) {
      result = result && getDstId()
          .equals(other.getDstId());
    }
    result = result && (hasEdgeId() == other.hasEdgeId());
    if (hasEdgeId()) {
      result = result && getEdgeId()
          .equals(other.getEdgeId());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasSrcId()) {
      hash = (37 * hash) + SRCID_FIELD_NUMBER;
      hash = (53 * hash) + getSrcId().hashCode();
    }
    if (hasDstId()) {
      hash = (37 * hash) + DSTID_FIELD_NUMBER;
      hash = (53 * hash) + getDstId().hashCode();
    }
    if (hasEdgeId()) {
      hash = (37 * hash) + EDGEID_FIELD_NUMBER;
      hash = (53 * hash) + getEdgeId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.RelationShipProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.RelationShipProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.RelationShipProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.RelationShipProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.RelationShipProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.RelationShipProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.RelationShipProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.RelationShipProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.RelationShipProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.RelationShipProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alibaba.maxgraph.proto.RelationShipProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code RelationShipProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RelationShipProto)
      com.alibaba.maxgraph.proto.RelationShipProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.Schema.internal_static_RelationShipProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.Schema.internal_static_RelationShipProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.RelationShipProto.class, com.alibaba.maxgraph.proto.RelationShipProto.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.RelationShipProto.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (srcIdBuilder_ == null) {
        srcId_ = null;
      } else {
        srcId_ = null;
        srcIdBuilder_ = null;
      }
      if (dstIdBuilder_ == null) {
        dstId_ = null;
      } else {
        dstId_ = null;
        dstIdBuilder_ = null;
      }
      if (edgeIdBuilder_ == null) {
        edgeId_ = null;
      } else {
        edgeId_ = null;
        edgeIdBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.Schema.internal_static_RelationShipProto_descriptor;
    }

    public com.alibaba.maxgraph.proto.RelationShipProto getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.RelationShipProto.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.RelationShipProto build() {
      com.alibaba.maxgraph.proto.RelationShipProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.RelationShipProto buildPartial() {
      com.alibaba.maxgraph.proto.RelationShipProto result = new com.alibaba.maxgraph.proto.RelationShipProto(this);
      if (srcIdBuilder_ == null) {
        result.srcId_ = srcId_;
      } else {
        result.srcId_ = srcIdBuilder_.build();
      }
      if (dstIdBuilder_ == null) {
        result.dstId_ = dstId_;
      } else {
        result.dstId_ = dstIdBuilder_.build();
      }
      if (edgeIdBuilder_ == null) {
        result.edgeId_ = edgeId_;
      } else {
        result.edgeId_ = edgeIdBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alibaba.maxgraph.proto.RelationShipProto) {
        return mergeFrom((com.alibaba.maxgraph.proto.RelationShipProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.RelationShipProto other) {
      if (other == com.alibaba.maxgraph.proto.RelationShipProto.getDefaultInstance()) return this;
      if (other.hasSrcId()) {
        mergeSrcId(other.getSrcId());
      }
      if (other.hasDstId()) {
        mergeDstId(other.getDstId());
      }
      if (other.hasEdgeId()) {
        mergeEdgeId(other.getEdgeId());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alibaba.maxgraph.proto.RelationShipProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.RelationShipProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.alibaba.maxgraph.proto.TypeIdProto srcId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.TypeIdProto, com.alibaba.maxgraph.proto.TypeIdProto.Builder, com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder> srcIdBuilder_;
    /**
     * <code>optional .TypeIdProto srcId = 1;</code>
     */
    public boolean hasSrcId() {
      return srcIdBuilder_ != null || srcId_ != null;
    }
    /**
     * <code>optional .TypeIdProto srcId = 1;</code>
     */
    public com.alibaba.maxgraph.proto.TypeIdProto getSrcId() {
      if (srcIdBuilder_ == null) {
        return srcId_ == null ? com.alibaba.maxgraph.proto.TypeIdProto.getDefaultInstance() : srcId_;
      } else {
        return srcIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .TypeIdProto srcId = 1;</code>
     */
    public Builder setSrcId(com.alibaba.maxgraph.proto.TypeIdProto value) {
      if (srcIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        srcId_ = value;
        onChanged();
      } else {
        srcIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto srcId = 1;</code>
     */
    public Builder setSrcId(
        com.alibaba.maxgraph.proto.TypeIdProto.Builder builderForValue) {
      if (srcIdBuilder_ == null) {
        srcId_ = builderForValue.build();
        onChanged();
      } else {
        srcIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto srcId = 1;</code>
     */
    public Builder mergeSrcId(com.alibaba.maxgraph.proto.TypeIdProto value) {
      if (srcIdBuilder_ == null) {
        if (srcId_ != null) {
          srcId_ =
            com.alibaba.maxgraph.proto.TypeIdProto.newBuilder(srcId_).mergeFrom(value).buildPartial();
        } else {
          srcId_ = value;
        }
        onChanged();
      } else {
        srcIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto srcId = 1;</code>
     */
    public Builder clearSrcId() {
      if (srcIdBuilder_ == null) {
        srcId_ = null;
        onChanged();
      } else {
        srcId_ = null;
        srcIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto srcId = 1;</code>
     */
    public com.alibaba.maxgraph.proto.TypeIdProto.Builder getSrcIdBuilder() {
      
      onChanged();
      return getSrcIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .TypeIdProto srcId = 1;</code>
     */
    public com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder getSrcIdOrBuilder() {
      if (srcIdBuilder_ != null) {
        return srcIdBuilder_.getMessageOrBuilder();
      } else {
        return srcId_ == null ?
            com.alibaba.maxgraph.proto.TypeIdProto.getDefaultInstance() : srcId_;
      }
    }
    /**
     * <code>optional .TypeIdProto srcId = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.TypeIdProto, com.alibaba.maxgraph.proto.TypeIdProto.Builder, com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder> 
        getSrcIdFieldBuilder() {
      if (srcIdBuilder_ == null) {
        srcIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.alibaba.maxgraph.proto.TypeIdProto, com.alibaba.maxgraph.proto.TypeIdProto.Builder, com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder>(
                getSrcId(),
                getParentForChildren(),
                isClean());
        srcId_ = null;
      }
      return srcIdBuilder_;
    }

    private com.alibaba.maxgraph.proto.TypeIdProto dstId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.TypeIdProto, com.alibaba.maxgraph.proto.TypeIdProto.Builder, com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder> dstIdBuilder_;
    /**
     * <code>optional .TypeIdProto dstId = 2;</code>
     */
    public boolean hasDstId() {
      return dstIdBuilder_ != null || dstId_ != null;
    }
    /**
     * <code>optional .TypeIdProto dstId = 2;</code>
     */
    public com.alibaba.maxgraph.proto.TypeIdProto getDstId() {
      if (dstIdBuilder_ == null) {
        return dstId_ == null ? com.alibaba.maxgraph.proto.TypeIdProto.getDefaultInstance() : dstId_;
      } else {
        return dstIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .TypeIdProto dstId = 2;</code>
     */
    public Builder setDstId(com.alibaba.maxgraph.proto.TypeIdProto value) {
      if (dstIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dstId_ = value;
        onChanged();
      } else {
        dstIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto dstId = 2;</code>
     */
    public Builder setDstId(
        com.alibaba.maxgraph.proto.TypeIdProto.Builder builderForValue) {
      if (dstIdBuilder_ == null) {
        dstId_ = builderForValue.build();
        onChanged();
      } else {
        dstIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto dstId = 2;</code>
     */
    public Builder mergeDstId(com.alibaba.maxgraph.proto.TypeIdProto value) {
      if (dstIdBuilder_ == null) {
        if (dstId_ != null) {
          dstId_ =
            com.alibaba.maxgraph.proto.TypeIdProto.newBuilder(dstId_).mergeFrom(value).buildPartial();
        } else {
          dstId_ = value;
        }
        onChanged();
      } else {
        dstIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto dstId = 2;</code>
     */
    public Builder clearDstId() {
      if (dstIdBuilder_ == null) {
        dstId_ = null;
        onChanged();
      } else {
        dstId_ = null;
        dstIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto dstId = 2;</code>
     */
    public com.alibaba.maxgraph.proto.TypeIdProto.Builder getDstIdBuilder() {
      
      onChanged();
      return getDstIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .TypeIdProto dstId = 2;</code>
     */
    public com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder getDstIdOrBuilder() {
      if (dstIdBuilder_ != null) {
        return dstIdBuilder_.getMessageOrBuilder();
      } else {
        return dstId_ == null ?
            com.alibaba.maxgraph.proto.TypeIdProto.getDefaultInstance() : dstId_;
      }
    }
    /**
     * <code>optional .TypeIdProto dstId = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.TypeIdProto, com.alibaba.maxgraph.proto.TypeIdProto.Builder, com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder> 
        getDstIdFieldBuilder() {
      if (dstIdBuilder_ == null) {
        dstIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.alibaba.maxgraph.proto.TypeIdProto, com.alibaba.maxgraph.proto.TypeIdProto.Builder, com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder>(
                getDstId(),
                getParentForChildren(),
                isClean());
        dstId_ = null;
      }
      return dstIdBuilder_;
    }

    private com.alibaba.maxgraph.proto.TypeIdProto edgeId_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.TypeIdProto, com.alibaba.maxgraph.proto.TypeIdProto.Builder, com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder> edgeIdBuilder_;
    /**
     * <code>optional .TypeIdProto edgeId = 3;</code>
     */
    public boolean hasEdgeId() {
      return edgeIdBuilder_ != null || edgeId_ != null;
    }
    /**
     * <code>optional .TypeIdProto edgeId = 3;</code>
     */
    public com.alibaba.maxgraph.proto.TypeIdProto getEdgeId() {
      if (edgeIdBuilder_ == null) {
        return edgeId_ == null ? com.alibaba.maxgraph.proto.TypeIdProto.getDefaultInstance() : edgeId_;
      } else {
        return edgeIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .TypeIdProto edgeId = 3;</code>
     */
    public Builder setEdgeId(com.alibaba.maxgraph.proto.TypeIdProto value) {
      if (edgeIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        edgeId_ = value;
        onChanged();
      } else {
        edgeIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto edgeId = 3;</code>
     */
    public Builder setEdgeId(
        com.alibaba.maxgraph.proto.TypeIdProto.Builder builderForValue) {
      if (edgeIdBuilder_ == null) {
        edgeId_ = builderForValue.build();
        onChanged();
      } else {
        edgeIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto edgeId = 3;</code>
     */
    public Builder mergeEdgeId(com.alibaba.maxgraph.proto.TypeIdProto value) {
      if (edgeIdBuilder_ == null) {
        if (edgeId_ != null) {
          edgeId_ =
            com.alibaba.maxgraph.proto.TypeIdProto.newBuilder(edgeId_).mergeFrom(value).buildPartial();
        } else {
          edgeId_ = value;
        }
        onChanged();
      } else {
        edgeIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto edgeId = 3;</code>
     */
    public Builder clearEdgeId() {
      if (edgeIdBuilder_ == null) {
        edgeId_ = null;
        onChanged();
      } else {
        edgeId_ = null;
        edgeIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .TypeIdProto edgeId = 3;</code>
     */
    public com.alibaba.maxgraph.proto.TypeIdProto.Builder getEdgeIdBuilder() {
      
      onChanged();
      return getEdgeIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .TypeIdProto edgeId = 3;</code>
     */
    public com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder getEdgeIdOrBuilder() {
      if (edgeIdBuilder_ != null) {
        return edgeIdBuilder_.getMessageOrBuilder();
      } else {
        return edgeId_ == null ?
            com.alibaba.maxgraph.proto.TypeIdProto.getDefaultInstance() : edgeId_;
      }
    }
    /**
     * <code>optional .TypeIdProto edgeId = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.alibaba.maxgraph.proto.TypeIdProto, com.alibaba.maxgraph.proto.TypeIdProto.Builder, com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder> 
        getEdgeIdFieldBuilder() {
      if (edgeIdBuilder_ == null) {
        edgeIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.alibaba.maxgraph.proto.TypeIdProto, com.alibaba.maxgraph.proto.TypeIdProto.Builder, com.alibaba.maxgraph.proto.TypeIdProtoOrBuilder>(
                getEdgeId(),
                getParentForChildren(),
                isClean());
        edgeId_ = null;
      }
      return edgeIdBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:RelationShipProto)
  }

  // @@protoc_insertion_point(class_scope:RelationShipProto)
  private static final com.alibaba.maxgraph.proto.RelationShipProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.RelationShipProto();
  }

  public static com.alibaba.maxgraph.proto.RelationShipProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelationShipProto>
      PARSER = new com.google.protobuf.AbstractParser<RelationShipProto>() {
    public RelationShipProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RelationShipProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RelationShipProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelationShipProto> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.RelationShipProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
