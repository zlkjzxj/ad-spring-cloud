package com.sunny.ad.service;

import com.sunny.ad.exception.AdException;
import com.sunny.ad.vo.CreateUserRequest;
import com.sunny.ad.vo.CreateUserResponse;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 17:18
 */
public interface UserService {
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
