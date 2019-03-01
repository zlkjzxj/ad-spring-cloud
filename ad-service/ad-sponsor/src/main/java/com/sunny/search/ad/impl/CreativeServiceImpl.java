package com.sunny.search.ad.impl;

import com.sunny.ad.ICreativeService;
import com.sunny.ad.entity.Creative;
import com.sunny.ad.persistence.CreativeRepository;
import com.sunny.ad.vo.CreativeRequest;
import com.sunny.ad.vo.CreativeResponse;
import com.sunny.search.ad.ICreativeService;
import com.sunny.search.ad.entity.Creative;
import com.sunny.search.ad.vo.CreativeRequest;
import com.sunny.search.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Qinyi.
 */
@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
