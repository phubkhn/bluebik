package com.bluebik.management.utils;


import com.bluebik.management.entities.UserEntity;
import com.bluebik.grpc.user.UserProto;

public class UserConverter {

    public static UserProto.User toUserProto(UserEntity userEntity) {

        return UserProto.User.newBuilder()
                .setId(userEntity.getId())
                .setName(userEntity.getName())
                .setInfo(userEntity.getInfo())
                .build();
    }

    public static UserEntity toUserEntity(UserProto.User user) {
        return UserEntity.builder()
                .id(user.getId())
                .name(user.getName())
                .info(user.getInfo())
                .build();
    }
}
