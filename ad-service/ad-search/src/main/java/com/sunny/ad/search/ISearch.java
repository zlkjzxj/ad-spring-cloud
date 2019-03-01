package com.sunny.ad.search;


import com.sunny.ad.search.vo.SearchRequest;
import com.sunny.ad.search.vo.SearchResponse;

/**
 * Created by Qinyi.
 */
public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
