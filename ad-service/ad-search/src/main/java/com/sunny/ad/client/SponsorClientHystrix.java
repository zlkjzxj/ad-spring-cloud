package com.sunny.ad.client;

import com.sunny.ad.client.vo.AdPlan;
import com.sunny.ad.client.vo.AdPlanGetRequest;
import com.sunny.search.ad.advice.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Qinyi.
 */
@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(
            AdPlanGetRequest request) {
        return new CommonResponse<>(-1,
                "eureka-client-ad-sponsor error");
    }
}
