package com.bluebik.api_gw.client;

import com.bluebik.api_gw.config.GrpcChannelFactory;
import com.bluebik.api_gw.model.User;
import com.bluebik.grpc.user.UserProto;
import com.bluebik.grpc.user.UserServiceGrpc;
import io.grpc.ManagedChannel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class GrpcClient {
    private final GenericObjectPool<ManagedChannel> channelPool = new GenericObjectPool<>(new GrpcChannelFactory());

    public User addUser(User request) throws Exception {

        UserProto.User user = UserProto.User.newBuilder()
                .setInfo(request.getInfo())
                .setName(request.getName())
                .build();
        UserProto.UserResponse response = callToGrpcServer(stub -> stub.addUser(user));
        return User.builder()
                .id(response.getUser().getId())
                .name(response.getUser().getName())
                .info(response.getUser().getInfo())
                .build();

    }

    public User updateUser(Long id, User request) throws Exception {
        UserProto.User user = UserProto.User.newBuilder()
                .setId(id)
                .setInfo(request.getInfo())
                .setName(request.getName())
                .build();
        UserProto.UserResponse response = callToGrpcServer(stub -> stub.updateUser(user));
        return User.builder()
                .id(response.getUser().getId())
                .name(response.getUser().getName())
                .info(response.getUser().getInfo())
                .build();
    }

    public String deleteUser(Long id) throws Exception {
        UserProto.UserRequest user = UserProto.UserRequest.newBuilder()
                .setId(id)
                .build();
        UserProto.Response response = callToGrpcServer(stub -> stub.deleteUser(user));
        return response.getMessage();

    }

    public User getUserById(Long id) throws Exception {
        UserProto.UserRequest user = UserProto.UserRequest.newBuilder()
                .setId(id)
                .build();
        UserProto.UserResponse response = callToGrpcServer(stub -> stub.getUserById(user));
        return User.builder()
                .id(response.getUser().getId())
                .name(response.getUser().getName())
                .info(response.getUser().getInfo())
                .build();
    }

    public List<User> getAllUsers(String pattern) throws Exception {
        UserProto.SearchRequest searchRequest = UserProto.SearchRequest.newBuilder()
                .setPattern(pattern)
                .build();
        UserProto.ListUser response = callToGrpcServer(stub -> stub.getAllUsers(searchRequest));
        return response.getUsersList().stream().map(u -> User.builder()
                .id(u.getId())
                .name(u.getName())
                .info(u.getInfo())
                .build()).toList();
    }

    public String updateMultipleUser(List<Long> ids, String newName, String newInfo) throws Exception {
        UserProto.BulkUpdateRequest request = UserProto.BulkUpdateRequest.newBuilder()
                .addAllIds(ids)
                .setNewInfo(newInfo)
                .setNewName(newName)
                .build();
        UserProto.Response response = callToGrpcServer(stub -> stub.updateMultipleUser(request));
        return response.getMessage();
    }

    public List<User> addMultipleUser(List<User> users) throws Exception {
        List<UserProto.User> usersList = users.stream()
                .map(u -> UserProto.User.newBuilder()
                        .setName(u.getName())
                        .setInfo(u.getInfo())
                        .build()).toList();
        UserProto.ListUser request = UserProto.ListUser.newBuilder()
                .addAllUsers(usersList)
                .build();
        UserProto.ListUser response = callToGrpcServer(stub -> stub.addMultipleUser(request));
        return response.getUsersList().stream().map(u -> User.builder()
                .id(u.getId())
                .name(u.getName())
                .info(u.getInfo())
                .build()).toList();
    }

    public String deleteMultipleUser(List<Long> ids) throws Exception {
        UserProto.BulkDeleteRequest request = UserProto.BulkDeleteRequest.newBuilder()
                .addAllIds(ids)
                .build();
        UserProto.Response response = callToGrpcServer(stub -> stub.deleteMultipleUser(request));
        return response.getMessage();
    }

    private <T> T callToGrpcServer(ClientOperation<T> operation) throws Exception {
        ManagedChannel channel = null;
        try {
            channel = channelPool.borrowObject();
            UserServiceGrpc.UserServiceBlockingStub userServiceStub = UserServiceGrpc.newBlockingStub(channel);
            return operation.execute(userServiceStub);
        } catch (Exception e) {
            log.error("Error: ", e);
            throw new Exception("Error");
        } finally {
            if (channel != null) {
                try {
                    channelPool.returnObject(channel);
                } catch (Exception e) {
                    log.error("Error: ", e);
                }
            }
        }
    }
}
