package com.bluebik.grpc.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: User.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.bluebik.grpc.user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.UserRequest,
      com.bluebik.grpc.user.UserProto.UserResponse> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserById",
      requestType = com.bluebik.grpc.user.UserProto.UserRequest.class,
      responseType = com.bluebik.grpc.user.UserProto.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.UserRequest,
      com.bluebik.grpc.user.UserProto.UserResponse> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.UserRequest, com.bluebik.grpc.user.UserProto.UserResponse> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = UserServiceGrpc.getGetUserByIdMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserByIdMethod = UserServiceGrpc.getGetUserByIdMethod) == null) {
          UserServiceGrpc.getGetUserByIdMethod = getGetUserByIdMethod =
              io.grpc.MethodDescriptor.<com.bluebik.grpc.user.UserProto.UserRequest, com.bluebik.grpc.user.UserProto.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserById"))
              .build();
        }
      }
    }
    return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.SearchRequest,
      com.bluebik.grpc.user.UserProto.ListUser> getGetAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUsers",
      requestType = com.bluebik.grpc.user.UserProto.SearchRequest.class,
      responseType = com.bluebik.grpc.user.UserProto.ListUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.SearchRequest,
      com.bluebik.grpc.user.UserProto.ListUser> getGetAllUsersMethod() {
    io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.SearchRequest, com.bluebik.grpc.user.UserProto.ListUser> getGetAllUsersMethod;
    if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
          UserServiceGrpc.getGetAllUsersMethod = getGetAllUsersMethod =
              io.grpc.MethodDescriptor.<com.bluebik.grpc.user.UserProto.SearchRequest, com.bluebik.grpc.user.UserProto.ListUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.ListUser.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUsers"))
              .build();
        }
      }
    }
    return getGetAllUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.User,
      com.bluebik.grpc.user.UserProto.UserResponse> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUser",
      requestType = com.bluebik.grpc.user.UserProto.User.class,
      responseType = com.bluebik.grpc.user.UserProto.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.User,
      com.bluebik.grpc.user.UserProto.UserResponse> getAddUserMethod() {
    io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.User, com.bluebik.grpc.user.UserProto.UserResponse> getAddUserMethod;
    if ((getAddUserMethod = UserServiceGrpc.getAddUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddUserMethod = UserServiceGrpc.getAddUserMethod) == null) {
          UserServiceGrpc.getAddUserMethod = getAddUserMethod =
              io.grpc.MethodDescriptor.<com.bluebik.grpc.user.UserProto.User, com.bluebik.grpc.user.UserProto.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddUser"))
              .build();
        }
      }
    }
    return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.User,
      com.bluebik.grpc.user.UserProto.UserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.bluebik.grpc.user.UserProto.User.class,
      responseType = com.bluebik.grpc.user.UserProto.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.User,
      com.bluebik.grpc.user.UserProto.UserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.User, com.bluebik.grpc.user.UserProto.UserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.bluebik.grpc.user.UserProto.User, com.bluebik.grpc.user.UserProto.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.UserRequest,
      com.bluebik.grpc.user.UserProto.Response> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.bluebik.grpc.user.UserProto.UserRequest.class,
      responseType = com.bluebik.grpc.user.UserProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.UserRequest,
      com.bluebik.grpc.user.UserProto.Response> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.UserRequest, com.bluebik.grpc.user.UserProto.Response> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.bluebik.grpc.user.UserProto.UserRequest, com.bluebik.grpc.user.UserProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.ListUser,
      com.bluebik.grpc.user.UserProto.ListUser> getAddMultipleUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMultipleUser",
      requestType = com.bluebik.grpc.user.UserProto.ListUser.class,
      responseType = com.bluebik.grpc.user.UserProto.ListUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.ListUser,
      com.bluebik.grpc.user.UserProto.ListUser> getAddMultipleUserMethod() {
    io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.ListUser, com.bluebik.grpc.user.UserProto.ListUser> getAddMultipleUserMethod;
    if ((getAddMultipleUserMethod = UserServiceGrpc.getAddMultipleUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddMultipleUserMethod = UserServiceGrpc.getAddMultipleUserMethod) == null) {
          UserServiceGrpc.getAddMultipleUserMethod = getAddMultipleUserMethod =
              io.grpc.MethodDescriptor.<com.bluebik.grpc.user.UserProto.ListUser, com.bluebik.grpc.user.UserProto.ListUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMultipleUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.ListUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.ListUser.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddMultipleUser"))
              .build();
        }
      }
    }
    return getAddMultipleUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.BulkUpdateRequest,
      com.bluebik.grpc.user.UserProto.Response> getUpdateMultipleUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMultipleUser",
      requestType = com.bluebik.grpc.user.UserProto.BulkUpdateRequest.class,
      responseType = com.bluebik.grpc.user.UserProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.BulkUpdateRequest,
      com.bluebik.grpc.user.UserProto.Response> getUpdateMultipleUserMethod() {
    io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.BulkUpdateRequest, com.bluebik.grpc.user.UserProto.Response> getUpdateMultipleUserMethod;
    if ((getUpdateMultipleUserMethod = UserServiceGrpc.getUpdateMultipleUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateMultipleUserMethod = UserServiceGrpc.getUpdateMultipleUserMethod) == null) {
          UserServiceGrpc.getUpdateMultipleUserMethod = getUpdateMultipleUserMethod =
              io.grpc.MethodDescriptor.<com.bluebik.grpc.user.UserProto.BulkUpdateRequest, com.bluebik.grpc.user.UserProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMultipleUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.BulkUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateMultipleUser"))
              .build();
        }
      }
    }
    return getUpdateMultipleUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.BulkDeleteRequest,
      com.bluebik.grpc.user.UserProto.Response> getDeleteMultipleUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMultipleUser",
      requestType = com.bluebik.grpc.user.UserProto.BulkDeleteRequest.class,
      responseType = com.bluebik.grpc.user.UserProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.BulkDeleteRequest,
      com.bluebik.grpc.user.UserProto.Response> getDeleteMultipleUserMethod() {
    io.grpc.MethodDescriptor<com.bluebik.grpc.user.UserProto.BulkDeleteRequest, com.bluebik.grpc.user.UserProto.Response> getDeleteMultipleUserMethod;
    if ((getDeleteMultipleUserMethod = UserServiceGrpc.getDeleteMultipleUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteMultipleUserMethod = UserServiceGrpc.getDeleteMultipleUserMethod) == null) {
          UserServiceGrpc.getDeleteMultipleUserMethod = getDeleteMultipleUserMethod =
              io.grpc.MethodDescriptor.<com.bluebik.grpc.user.UserProto.BulkDeleteRequest, com.bluebik.grpc.user.UserProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMultipleUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.BulkDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bluebik.grpc.user.UserProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteMultipleUser"))
              .build();
        }
      }
    }
    return getDeleteMultipleUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserById(com.bluebik.grpc.user.UserProto.UserRequest request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllUsers(com.bluebik.grpc.user.UserProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.ListUser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUsersMethod(), responseObserver);
    }

    /**
     */
    public void addUser(com.bluebik.grpc.user.UserProto.User request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(com.bluebik.grpc.user.UserProto.User request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(com.bluebik.grpc.user.UserProto.UserRequest request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void addMultipleUser(com.bluebik.grpc.user.UserProto.ListUser request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.ListUser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMultipleUserMethod(), responseObserver);
    }

    /**
     */
    public void updateMultipleUser(com.bluebik.grpc.user.UserProto.BulkUpdateRequest request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMultipleUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteMultipleUser(com.bluebik.grpc.user.UserProto.BulkDeleteRequest request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMultipleUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bluebik.grpc.user.UserProto.UserRequest,
                com.bluebik.grpc.user.UserProto.UserResponse>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getGetAllUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bluebik.grpc.user.UserProto.SearchRequest,
                com.bluebik.grpc.user.UserProto.ListUser>(
                  this, METHODID_GET_ALL_USERS)))
          .addMethod(
            getAddUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bluebik.grpc.user.UserProto.User,
                com.bluebik.grpc.user.UserProto.UserResponse>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bluebik.grpc.user.UserProto.User,
                com.bluebik.grpc.user.UserProto.UserResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bluebik.grpc.user.UserProto.UserRequest,
                com.bluebik.grpc.user.UserProto.Response>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getAddMultipleUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bluebik.grpc.user.UserProto.ListUser,
                com.bluebik.grpc.user.UserProto.ListUser>(
                  this, METHODID_ADD_MULTIPLE_USER)))
          .addMethod(
            getUpdateMultipleUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bluebik.grpc.user.UserProto.BulkUpdateRequest,
                com.bluebik.grpc.user.UserProto.Response>(
                  this, METHODID_UPDATE_MULTIPLE_USER)))
          .addMethod(
            getDeleteMultipleUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bluebik.grpc.user.UserProto.BulkDeleteRequest,
                com.bluebik.grpc.user.UserProto.Response>(
                  this, METHODID_DELETE_MULTIPLE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserById(com.bluebik.grpc.user.UserProto.UserRequest request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUsers(com.bluebik.grpc.user.UserProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.ListUser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUser(com.bluebik.grpc.user.UserProto.User request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.bluebik.grpc.user.UserProto.User request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.bluebik.grpc.user.UserProto.UserRequest request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMultipleUser(com.bluebik.grpc.user.UserProto.ListUser request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.ListUser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMultipleUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMultipleUser(com.bluebik.grpc.user.UserProto.BulkUpdateRequest request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMultipleUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMultipleUser(com.bluebik.grpc.user.UserProto.BulkDeleteRequest request,
        io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMultipleUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bluebik.grpc.user.UserProto.UserResponse getUserById(com.bluebik.grpc.user.UserProto.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bluebik.grpc.user.UserProto.ListUser getAllUsers(com.bluebik.grpc.user.UserProto.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bluebik.grpc.user.UserProto.UserResponse addUser(com.bluebik.grpc.user.UserProto.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bluebik.grpc.user.UserProto.UserResponse updateUser(com.bluebik.grpc.user.UserProto.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bluebik.grpc.user.UserProto.Response deleteUser(com.bluebik.grpc.user.UserProto.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bluebik.grpc.user.UserProto.ListUser addMultipleUser(com.bluebik.grpc.user.UserProto.ListUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMultipleUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bluebik.grpc.user.UserProto.Response updateMultipleUser(com.bluebik.grpc.user.UserProto.BulkUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMultipleUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bluebik.grpc.user.UserProto.Response deleteMultipleUser(com.bluebik.grpc.user.UserProto.BulkDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMultipleUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bluebik.grpc.user.UserProto.UserResponse> getUserById(
        com.bluebik.grpc.user.UserProto.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bluebik.grpc.user.UserProto.ListUser> getAllUsers(
        com.bluebik.grpc.user.UserProto.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bluebik.grpc.user.UserProto.UserResponse> addUser(
        com.bluebik.grpc.user.UserProto.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bluebik.grpc.user.UserProto.UserResponse> updateUser(
        com.bluebik.grpc.user.UserProto.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bluebik.grpc.user.UserProto.Response> deleteUser(
        com.bluebik.grpc.user.UserProto.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bluebik.grpc.user.UserProto.ListUser> addMultipleUser(
        com.bluebik.grpc.user.UserProto.ListUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMultipleUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bluebik.grpc.user.UserProto.Response> updateMultipleUser(
        com.bluebik.grpc.user.UserProto.BulkUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMultipleUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bluebik.grpc.user.UserProto.Response> deleteMultipleUser(
        com.bluebik.grpc.user.UserProto.BulkDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMultipleUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_BY_ID = 0;
  private static final int METHODID_GET_ALL_USERS = 1;
  private static final int METHODID_ADD_USER = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;
  private static final int METHODID_ADD_MULTIPLE_USER = 5;
  private static final int METHODID_UPDATE_MULTIPLE_USER = 6;
  private static final int METHODID_DELETE_MULTIPLE_USER = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((com.bluebik.grpc.user.UserProto.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.UserResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((com.bluebik.grpc.user.UserProto.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.ListUser>) responseObserver);
          break;
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.bluebik.grpc.user.UserProto.User) request,
              (io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.UserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.bluebik.grpc.user.UserProto.User) request,
              (io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.UserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.bluebik.grpc.user.UserProto.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.Response>) responseObserver);
          break;
        case METHODID_ADD_MULTIPLE_USER:
          serviceImpl.addMultipleUser((com.bluebik.grpc.user.UserProto.ListUser) request,
              (io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.ListUser>) responseObserver);
          break;
        case METHODID_UPDATE_MULTIPLE_USER:
          serviceImpl.updateMultipleUser((com.bluebik.grpc.user.UserProto.BulkUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.Response>) responseObserver);
          break;
        case METHODID_DELETE_MULTIPLE_USER:
          serviceImpl.deleteMultipleUser((com.bluebik.grpc.user.UserProto.BulkDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.bluebik.grpc.user.UserProto.Response>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bluebik.grpc.user.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getGetAllUsersMethod())
              .addMethod(getAddUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getAddMultipleUserMethod())
              .addMethod(getUpdateMultipleUserMethod())
              .addMethod(getDeleteMultipleUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
