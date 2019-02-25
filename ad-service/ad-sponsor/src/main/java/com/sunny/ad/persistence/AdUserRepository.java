package com.sunny.ad.persistence;

import com.sunny.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 16:16
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {
    AdUser findAdUserByUsername(String userNme);
}
