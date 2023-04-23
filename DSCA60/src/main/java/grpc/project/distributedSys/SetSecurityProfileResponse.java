// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Service02.proto

package grpc.project.distributedSys;

/**
 * Protobuf type {@code SetSecurityProfileResponse}
 */
public  final class SetSecurityProfileResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SetSecurityProfileResponse)
    SetSecurityProfileResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetSecurityProfileResponse.newBuilder() to construct.
  private SetSecurityProfileResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetSecurityProfileResponse() {
    userId_ = "";
    securityLevel_ = "";
    twoFactorAuth_ = false;
    dateSet_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetSecurityProfileResponse(
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

            userId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            securityLevel_ = s;
            break;
          }
          case 24: {

            twoFactorAuth_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            dateSet_ = s;
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
    return grpc.project.distributedSys.Service02Impl.internal_static_SetSecurityProfileResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.project.distributedSys.Service02Impl.internal_static_SetSecurityProfileResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.project.distributedSys.SetSecurityProfileResponse.class, grpc.project.distributedSys.SetSecurityProfileResponse.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <code>string user_id = 1;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECURITY_LEVEL_FIELD_NUMBER = 2;
  private volatile java.lang.Object securityLevel_;
  /**
   * <code>string security_level = 2;</code>
   */
  public java.lang.String getSecurityLevel() {
    java.lang.Object ref = securityLevel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      securityLevel_ = s;
      return s;
    }
  }
  /**
   * <code>string security_level = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSecurityLevelBytes() {
    java.lang.Object ref = securityLevel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      securityLevel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TWO_FACTOR_AUTH_FIELD_NUMBER = 3;
  private boolean twoFactorAuth_;
  /**
   * <code>bool two_factor_auth = 3;</code>
   */
  public boolean getTwoFactorAuth() {
    return twoFactorAuth_;
  }

  public static final int DATE_SET_FIELD_NUMBER = 4;
  private volatile java.lang.Object dateSet_;
  /**
   * <code>string date_set = 4;</code>
   */
  public java.lang.String getDateSet() {
    java.lang.Object ref = dateSet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateSet_ = s;
      return s;
    }
  }
  /**
   * <code>string date_set = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDateSetBytes() {
    java.lang.Object ref = dateSet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateSet_ = b;
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
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (!getSecurityLevelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, securityLevel_);
    }
    if (twoFactorAuth_ != false) {
      output.writeBool(3, twoFactorAuth_);
    }
    if (!getDateSetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dateSet_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!getSecurityLevelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, securityLevel_);
    }
    if (twoFactorAuth_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, twoFactorAuth_);
    }
    if (!getDateSetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dateSet_);
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
    if (!(obj instanceof grpc.project.distributedSys.SetSecurityProfileResponse)) {
      return super.equals(obj);
    }
    grpc.project.distributedSys.SetSecurityProfileResponse other = (grpc.project.distributedSys.SetSecurityProfileResponse) obj;

    boolean result = true;
    result = result && getUserId()
        .equals(other.getUserId());
    result = result && getSecurityLevel()
        .equals(other.getSecurityLevel());
    result = result && (getTwoFactorAuth()
        == other.getTwoFactorAuth());
    result = result && getDateSet()
        .equals(other.getDateSet());
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + SECURITY_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getSecurityLevel().hashCode();
    hash = (37 * hash) + TWO_FACTOR_AUTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getTwoFactorAuth());
    hash = (37 * hash) + DATE_SET_FIELD_NUMBER;
    hash = (53 * hash) + getDateSet().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.project.distributedSys.SetSecurityProfileResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.project.distributedSys.SetSecurityProfileResponse parseFrom(
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
  public static Builder newBuilder(grpc.project.distributedSys.SetSecurityProfileResponse prototype) {
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
   * Protobuf type {@code SetSecurityProfileResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SetSecurityProfileResponse)
      grpc.project.distributedSys.SetSecurityProfileResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.project.distributedSys.Service02Impl.internal_static_SetSecurityProfileResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.project.distributedSys.Service02Impl.internal_static_SetSecurityProfileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.project.distributedSys.SetSecurityProfileResponse.class, grpc.project.distributedSys.SetSecurityProfileResponse.Builder.class);
    }

    // Construct using grpc.project.distributedSys.SetSecurityProfileResponse.newBuilder()
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
      userId_ = "";

      securityLevel_ = "";

      twoFactorAuth_ = false;

      dateSet_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.project.distributedSys.Service02Impl.internal_static_SetSecurityProfileResponse_descriptor;
    }

    @java.lang.Override
    public grpc.project.distributedSys.SetSecurityProfileResponse getDefaultInstanceForType() {
      return grpc.project.distributedSys.SetSecurityProfileResponse.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.project.distributedSys.SetSecurityProfileResponse build() {
      grpc.project.distributedSys.SetSecurityProfileResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.project.distributedSys.SetSecurityProfileResponse buildPartial() {
      grpc.project.distributedSys.SetSecurityProfileResponse result = new grpc.project.distributedSys.SetSecurityProfileResponse(this);
      result.userId_ = userId_;
      result.securityLevel_ = securityLevel_;
      result.twoFactorAuth_ = twoFactorAuth_;
      result.dateSet_ = dateSet_;
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
      if (other instanceof grpc.project.distributedSys.SetSecurityProfileResponse) {
        return mergeFrom((grpc.project.distributedSys.SetSecurityProfileResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.project.distributedSys.SetSecurityProfileResponse other) {
      if (other == grpc.project.distributedSys.SetSecurityProfileResponse.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getSecurityLevel().isEmpty()) {
        securityLevel_ = other.securityLevel_;
        onChanged();
      }
      if (other.getTwoFactorAuth() != false) {
        setTwoFactorAuth(other.getTwoFactorAuth());
      }
      if (!other.getDateSet().isEmpty()) {
        dateSet_ = other.dateSet_;
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
      grpc.project.distributedSys.SetSecurityProfileResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.project.distributedSys.SetSecurityProfileResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 1;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object securityLevel_ = "";
    /**
     * <code>string security_level = 2;</code>
     */
    public java.lang.String getSecurityLevel() {
      java.lang.Object ref = securityLevel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        securityLevel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string security_level = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSecurityLevelBytes() {
      java.lang.Object ref = securityLevel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        securityLevel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string security_level = 2;</code>
     */
    public Builder setSecurityLevel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      securityLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string security_level = 2;</code>
     */
    public Builder clearSecurityLevel() {
      
      securityLevel_ = getDefaultInstance().getSecurityLevel();
      onChanged();
      return this;
    }
    /**
     * <code>string security_level = 2;</code>
     */
    public Builder setSecurityLevelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      securityLevel_ = value;
      onChanged();
      return this;
    }

    private boolean twoFactorAuth_ ;
    /**
     * <code>bool two_factor_auth = 3;</code>
     */
    public boolean getTwoFactorAuth() {
      return twoFactorAuth_;
    }
    /**
     * <code>bool two_factor_auth = 3;</code>
     */
    public Builder setTwoFactorAuth(boolean value) {
      
      twoFactorAuth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool two_factor_auth = 3;</code>
     */
    public Builder clearTwoFactorAuth() {
      
      twoFactorAuth_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object dateSet_ = "";
    /**
     * <code>string date_set = 4;</code>
     */
    public java.lang.String getDateSet() {
      java.lang.Object ref = dateSet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateSet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date_set = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDateSetBytes() {
      java.lang.Object ref = dateSet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateSet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date_set = 4;</code>
     */
    public Builder setDateSet(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateSet_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string date_set = 4;</code>
     */
    public Builder clearDateSet() {
      
      dateSet_ = getDefaultInstance().getDateSet();
      onChanged();
      return this;
    }
    /**
     * <code>string date_set = 4;</code>
     */
    public Builder setDateSetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateSet_ = value;
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


    // @@protoc_insertion_point(builder_scope:SetSecurityProfileResponse)
  }

  // @@protoc_insertion_point(class_scope:SetSecurityProfileResponse)
  private static final grpc.project.distributedSys.SetSecurityProfileResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.project.distributedSys.SetSecurityProfileResponse();
  }

  public static grpc.project.distributedSys.SetSecurityProfileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetSecurityProfileResponse>
      PARSER = new com.google.protobuf.AbstractParser<SetSecurityProfileResponse>() {
    @java.lang.Override
    public SetSecurityProfileResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetSecurityProfileResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetSecurityProfileResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetSecurityProfileResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.project.distributedSys.SetSecurityProfileResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
