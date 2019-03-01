package com.sunny.search.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\19 0019 10:29
 */
@EnableEurekaServer
@SpringBootApplication
@EnableScheduling
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
