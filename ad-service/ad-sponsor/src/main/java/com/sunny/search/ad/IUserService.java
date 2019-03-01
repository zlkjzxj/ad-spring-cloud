package com.sunny.search.ad;


import com.sunny.ad.exception.AdException;
import com.sunny.ad.vo.CreateUserRequest;
import com.sunny.ad.vo.CreateUserResponse;
import com.sunny.search.ad.exception.AdException;
import com.sunny.search.ad.vo.CreateUserRequest;
import com.sunny.search.ad.vo.CreateUserResponse;

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
