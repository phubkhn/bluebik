package com.bluebik.api_gw.service;

import com.bluebik.api_gw.model.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserService {

    User addUser(User request) throws Exception;

    User updateUser(Long id, User request) throws Exception;

    List<User> getAllUsers(String pattern) throws Exception;

    User getUserById(Long id) throws Exception;

    String deleteUser(Long id) throws Exception;

    String deleteMultipleUser(List<Long> ids) throws Exception;

    String updateMultipleUser(List<Long> ids, String newName, String newInfo) throws Exception;

    List<User> addMultipleUser(List<User> users) throws Exception;
}
