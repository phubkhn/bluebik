package com.bluebik.api_gw.controller;

import com.bluebik.api_gw.model.ApiResponse;
import com.bluebik.grpc.user.UserProto;
import com.bluebik.api_gw.model.User;
import com.bluebik.api_gw.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService apiService) {
        this.userService = apiService;
    }

    /**
     *
     * 1. Implement Rest Apis in Api Service to register user details, update, get and delete user
     * details.
     *
     */
    @PostMapping
    public ApiResponse createUser(@RequestBody User request) throws Exception {
        log.info(request.toString());
        return ApiResponse.ok(userService.addUser(request), "OK");
    }

    @PutMapping("/{id}")
    public ApiResponse updateUser(@PathVariable Long id, @RequestBody User request) throws Exception {
        log.info(request.toString());
        //validate
        return ApiResponse.ok(userService.updateUser(id, request), "OK");
    }

    @GetMapping("/{id}")
    public ApiResponse getUserById(@PathVariable Long id) throws Exception{
        return ApiResponse.ok(userService.getUserById(id), "OK");
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteUser(@PathVariable Long id) throws Exception{

        return ApiResponse.ok(userService.deleteUser(id), "OK");
    }
    // End first request

    // 4. Search user using a pattern i.e., if we type ABC, show all users which start with name ABC.
    @GetMapping
    public ApiResponse getAllUsers(@RequestParam(required = false) String pattern) throws Exception{
        return ApiResponse.ok(userService.getAllUsers(pattern), "OK");
    }

    /**
     *
     * 3. Insert  multiple users into the system
     *
     *
     */
    @PostMapping("/bulk-insert")
    public ApiResponse addMultipleUser(@RequestBody List<User> request) throws Exception {
        log.info(request.toString());
        return ApiResponse.ok(userService.addMultipleUser(request), "OK");
    }

    /**
     *
     * 5. Update and delete users in bulk.
     *
     *
     */
    @DeleteMapping("/bulk-delete")
    public ApiResponse deleteMultipleUser(@RequestParam List<Long> request) throws Exception {
        log.info(request.toString());
        return ApiResponse.ok(userService.deleteMultipleUser(request), "OK");
    }

    @PutMapping("/bulk-update")
    public ApiResponse updateMultipleUser(@RequestParam List<Long> ids,
                                          @RequestParam String newName,
                                          @RequestParam String newInfo) throws Exception {
        return ApiResponse.ok(userService.updateMultipleUser(ids, newName, newInfo), "OK");
    }
}
