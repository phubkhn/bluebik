package com.bluebik.api_gw.client;

import com.bluebik.grpc.user.UserServiceGrpc;

@FunctionalInterface

public interface ClientOperation<T> {
    T execute(UserServiceGrpc.UserServiceBlockingStub stub);
}
