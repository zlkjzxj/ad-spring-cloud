package com.sunny.search.ad.advice;

import com.sunny.search.ad.exception.AdException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\19 0019 16:27
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handleAdException(HttpServletRequest request, AdException adExceipton) {
        CommonResponse<String> response = new CommonResponse<>(-1, "bussiness error");
        response.setData(adExceipton.getMessage());
        return response;
    }
}
