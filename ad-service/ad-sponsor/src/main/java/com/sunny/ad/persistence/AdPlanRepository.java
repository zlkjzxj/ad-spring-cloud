package com.sunny.ad.persistence;

import com.sunny.ad.entity.AdPlan;
import com.sunny.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 16:16
 */
public interface AdPlanRepository extends JpaRepository<AdPlan, Long> {

    AdPlan findAdUserByIdAndUserId(Long id, Long userId);

    List<AdPlan> findAllByIdAndUserId(List<Long> ids, Long UserId);

    AdPlan findAllByUserIdAndPlanName(Long userId, String planName);

    List<AdPlan> findAllByPlanStatus(Integer status);
}
