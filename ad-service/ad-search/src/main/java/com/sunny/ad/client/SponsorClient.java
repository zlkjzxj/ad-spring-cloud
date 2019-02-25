package com.sunny.ad.client;

import com.sunny.ad.advice.CommonResponse;
import com.sunny.ad.client.vo.AdPlan;
import com.sunny.ad.client.vo.AdPlanGetRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by walle
 * 2019/2/23 21:44
 * good good study,day day up!
 */
@FeignClient(value = "eureka-client-ad-sponsor/ad-sponsor",fallback = SponsorClientHystrix.class)
public interface SponsorClient {
    @PostMapping("/ad-sponsor/adPlan")
    CommonResponse<List<AdPlan>> getAdPlans(@RequestBody AdPlanGetRequest request);
}
