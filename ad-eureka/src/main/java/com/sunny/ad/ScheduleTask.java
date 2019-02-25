package com.sunny.ad;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 13:52
 */
@Component
public class ScheduleTask {
    @Scheduled(fixedRate = 3000)
    public  void xxx() {
        System.out.println("perfect is shit!");
    }
}
