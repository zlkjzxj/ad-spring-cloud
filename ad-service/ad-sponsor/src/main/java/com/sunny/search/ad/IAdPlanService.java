package com.sunny.search.ad;


import com.sunny.ad.entity.AdPlan;
import com.sunny.ad.exception.AdException;
import com.sunny.ad.vo.AdPlanGetRequest;
import com.sunny.ad.vo.AdPlanRequest;
import com.sunny.ad.vo.AdPlanResponse;
import com.sunny.search.ad.exception.AdException;
import com.sunny.search.ad.vo.AdPlanGetRequest;
import com.sunny.search.ad.vo.AdPlanRequest;
import com.sunny.search.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * Created by Qinyi.
 */
public interface IAdPlanService {

    /**
     * <h2>创建推广计划</h2>
     * */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>获取推广计划</h2>
     * */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>更新推广计划</h2>
     * */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>删除推广计划</h2>
     * */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
