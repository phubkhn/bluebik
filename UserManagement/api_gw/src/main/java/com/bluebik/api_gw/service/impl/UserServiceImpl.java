package com.bluebik.api_gw.service.impl;

import com.bluebik.api_gw.client.GrpcClient;
import com.bluebik.api_gw.model.User;
import com.bluebik.api_gw.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final GrpcClient client;

    @Autowired
    public UserServiceImpl(GrpcClient client) {
        this.client = client;
    }

    public User addUser(User request) throws Exception {
        return client.addUser(request);
    }

    public User updateUser(Long id, User request) throws Exception {
        return client.updateUser(id, request);
    }

    @Override
    public List<User> getAllUsers(String pattern) throws Exception {

        return client.getAllUsers(StringUtils.isAllBlank(pattern) ? "%" : pattern);
    }

    @Override
    public User getUserById(Long id) throws Exception {
        return client.getUserById(id);
    }

    @Override
    public String deleteUser(Long id) throws Exception {
        return client.deleteUser(id);
    }

    @Override
    public String deleteMultipleUser(List<Long> ids) throws Exception {
        return client.deleteMultipleUser(ids);
    }

    @Override
    public String updateMultipleUser(List<Long> ids, String newName, String newInfo) throws Exception {
        return client.updateMultipleUser(ids,newName,newInfo);
    }

    @Override
    public List<User> addMultipleUser(List<User> users) throws Exception {
        return client.addMultipleUser(users);
    }
}
