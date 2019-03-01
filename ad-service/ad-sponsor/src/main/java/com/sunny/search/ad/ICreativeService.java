package com.sunny.search.ad;


import com.sunny.ad.vo.CreativeRequest;
import com.sunny.ad.vo.CreativeResponse;
import com.sunny.search.ad.vo.CreativeRequest;
import com.sunny.search.ad.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
