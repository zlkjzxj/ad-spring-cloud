package com.sunny.ad.persistence;

import com.sunny.ad.entity.AdUnit;
import com.sunny.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 16:16
 */
public interface CreativeRepository extends JpaRepository<Creative, Long> {

}
