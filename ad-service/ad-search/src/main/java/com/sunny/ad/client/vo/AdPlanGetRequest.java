package com.sunny.ad.client.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by walle
 * 2019/2/23 16:26
 * good good study,day day up!
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanGetRequest {
    private Long userId;
    private List<Long> ids;
}
