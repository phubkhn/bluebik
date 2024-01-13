package com.bluebik.management.service;


import com.bluebik.grpc.user.UserProto.*;
import com.bluebik.grpc.user.UserServiceGrpc;
import com.bluebik.management.repository.UserRepository;
import com.bluebik.management.utils.UserConverter;
import io.grpc.stub.StreamObserver;
import jakarta.transaction.Transactional;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import com.bluebik.management.entities.UserEntity;

import java.util.List;
import java.util.Optional;

@GrpcService
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void getUserById(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        long userId = request.getId();

        Optional<UserEntity> userOptional = userRepository.findById(userId);

        if (userOptional.isPresent()) {
            UserEntity user = userOptional.get();
            UserResponse response = UserResponse.newBuilder().setUser(UserConverter.toUserProto(user)).build();
            responseObserver.onNext(response);
        } else {
            responseObserver.onError(new RuntimeException("User not found"));
        }

        responseObserver.onCompleted();
    }

    @Override
    public void getAllUsers(SearchRequest request, StreamObserver<ListUser> responseObserver) {
        List<UserEntity> users = userRepository.findByNameLikeIgnoreCase(request.getPattern());
        ListUser response = ListUser.newBuilder()
                .addAllUsers(users.stream().map(UserConverter::toUserProto).toList())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void addUser(User request, StreamObserver<UserResponse> responseObserver) {
        UserEntity savedUser = userRepository.save(UserEntity.builder().name(request.getName()).info(request.getInfo()).build());
        UserResponse response = UserResponse.newBuilder().setUser(UserConverter.toUserProto(savedUser)).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void updateUser(User request, StreamObserver<UserResponse> responseObserver) {
        long userId = request.getId();
        Optional<UserEntity> userOptional = userRepository.findById(userId);

        if (userOptional.isPresent()) {
            UserEntity user = userOptional.get();
            user.setName(request.getName());
            user.setInfo(request.getInfo());
            userRepository.save(user);
            UserResponse response = UserResponse.newBuilder().setUser(UserConverter.toUserProto(user)).build();
            responseObserver.onNext(response);
        } else {
            responseObserver.onError(new RuntimeException("User not found"));
        }

        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void deleteUser(UserRequest request, StreamObserver<Response> responseObserver) {
        long userId = request.getId();
        userRepository.deleteById(userId);
        responseObserver.onNext(Response.newBuilder().setMessage("OK").build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void addMultipleUser(ListUser request, StreamObserver<ListUser> responseObserver) {
        List<UserEntity> users = request.getUsersList().stream()
                .map(u -> UserEntity.builder().name(u.getName()).info(u.getInfo()).build()).toList();
        List<UserEntity> result = userRepository.saveAll(users);
        ListUser response = ListUser.newBuilder()
                .addAllUsers(result.stream().map(UserConverter::toUserProto).toList())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();    }

    @Override
    @Transactional
    public void updateMultipleUser(BulkUpdateRequest request, StreamObserver<Response> responseObserver) {
        List<Long> userIds = request.getIdsList();
        userRepository.updateUserNameAndEmail(userIds, request.getNewName(), request.getNewInfo());
        responseObserver.onNext(Response.newBuilder().setMessage("OK").build());
        responseObserver.onCompleted();
    }

    @Override
    @Transactional
    public void deleteMultipleUser(BulkDeleteRequest request, StreamObserver<Response> responseObserver) {
        userRepository.deleteUsersByIds(request.getIdsList());
        responseObserver.onNext(Response.newBuilder().setMessage("OK").build());
        responseObserver.onCompleted();
    }


}
