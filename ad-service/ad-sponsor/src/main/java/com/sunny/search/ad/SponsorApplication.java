package com.sunny.search.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 14:47
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableEurekaClient
public class SponsorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SponsorApplication.class, args);
    }
}
