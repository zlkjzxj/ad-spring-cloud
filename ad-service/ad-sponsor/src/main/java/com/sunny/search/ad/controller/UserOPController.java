package com.sunny.search.ad.controller;

import com.alibaba.fastjson.JSON;
import com.sunny.ad.exception.AdException;
import com.sunny.ad.IUserService;
import com.sunny.ad.vo.CreateUserRequest;
import com.sunny.ad.vo.CreateUserResponse;
import com.sunny.search.ad.exception.AdException;
import com.sunny.search.ad.vo.CreateUserRequest;
import com.sunny.search.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Qinyi.
 */
@Slf4j
@RestController
public class UserOPController {

    private final IUserService userService;

    @Autowired
    public UserOPController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create/user")
    public CreateUserResponse createUser(
            @RequestBody CreateUserRequest request) throws AdException {
        log.info("ad-sponsor: createUser -> {}",
                JSON.toJSONString(request));
        return userService.createUser(request);
    }
}
