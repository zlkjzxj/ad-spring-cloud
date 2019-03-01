package com.sunny.search.ad.persistence.unit_condition;

import com.sunny.ad.entity.unit_condition.AdUnitKeyword;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Qinyi.
 */
public interface AdUnitKeywordRepository extends
        JpaRepository<AdUnitKeyword, Long> {
}
