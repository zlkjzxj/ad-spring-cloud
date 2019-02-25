package com.sunny.ad.client;

import com.sunny.ad.advice.CommonResponse;
import com.sunny.ad.client.vo.AdPlan;
import com.sunny.ad.client.vo.AdPlanGetRequest;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walle
 * 2019/2/23 22:09
 * good good study,day day up!
 */
@Component
public class SponsorClientHystrix implements SponsorClient {
    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(AdPlanGetRequest request) {
        return new CommonResponse<>(-1,"eureka-client-ad-sponsor  error");
    }
}
