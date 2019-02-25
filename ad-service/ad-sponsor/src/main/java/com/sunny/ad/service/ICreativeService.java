package com.sunny.ad.service;


import com.sunny.ad.vo.CreativeRequest;
import com.sunny.ad.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
