package com.sunny.ad.persistence;

import com.sunny.ad.entity.AdPlan;
import com.sunny.ad.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 16:16
 */
public interface AdUnitRepository extends JpaRepository<AdUnit, Long> {

    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer status);
}
