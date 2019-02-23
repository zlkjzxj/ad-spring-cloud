package com.sunny.ad.controller;

import com.alibaba.fastjson.JSON;
import com.sunny.ad.advice.CommonResponse;
import com.sunny.ad.annotation.IgnoreResponseAdvice;
import com.sunny.ad.client.SponsorClient;
import com.sunny.ad.client.vo.AdPlan;
import com.sunny.ad.client.vo.AdPlanGetRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by walle
 * 2019/2/23 16:32
 * good good study,day day up!
 */
@Slf4j
@RestController
public class SearchController {
    private final RestTemplate restTemplate;

    private final SponsorClient sponsorClient;

    @Autowired
    public SearchController(RestTemplate restTemplate, SponsorClient sponsorClient) {
        this.restTemplate = restTemplate;
        this.sponsorClient = sponsorClient;
    }

    @IgnoreResponseAdvice //不想使用統一響應
    @PostMapping("/getAdPlanByRibbon")
    public CommonResponse<List<AdPlan>> getAdplansByRibbon(@RequestBody AdPlanGetRequest request){
        log.info("getAdplansByRibbon:->{}"+ JSON.toJSONString(request));
        return restTemplate.postForEntity("http://eureka-client-ad-sponsor/ad-sponsor/adPlan",request,
                CommonResponse.class).getBody();
    }

    @IgnoreResponseAdvice
    @PostMapping("/getAdPlanByRibbon")
    public CommonResponse<List<AdPlan>> getAdplansByFegin(@RequestBody AdPlanGetRequest request){
        log.info("getAdplansByRibbon:->{}"+ JSON.toJSONString(request));
        return sponsorClient.getAdPlans(request);
    }
}
