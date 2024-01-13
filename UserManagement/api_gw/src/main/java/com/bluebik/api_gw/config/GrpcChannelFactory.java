package com.bluebik.api_gw.config;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

public class GrpcChannelFactory extends BasePooledObjectFactory<ManagedChannel> {

    @Override
    public ManagedChannel create() {
        return ManagedChannelBuilder.forAddress("localhost", 8000)
                .usePlaintext()
                .build();
    }

    @Override
    public void destroyObject(PooledObject<ManagedChannel> p) throws Exception {
        ManagedChannel channel = p.getObject();
        if (channel != null && !channel.isShutdown()) {
            channel.shutdown();
        }
        super.destroyObject(p);
    }

    @Override
    public PooledObject<ManagedChannel> wrap(ManagedChannel channel) {
        return new DefaultPooledObject<>(channel);
    }
}
