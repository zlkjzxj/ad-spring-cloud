package com.sunny.ad.persistence;

import com.sunny.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Qinyi.
 */
public interface CreativeRepository extends JpaRepository<Creative, Long> {
}
