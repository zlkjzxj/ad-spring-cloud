package com.sunny.ad.service;


import com.sunny.ad.exception.AdException;
import com.sunny.ad.vo.CreateUserRequest;
import com.sunny.ad.vo.CreateUserResponse;

/**
 * Created by Qinyi.
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
