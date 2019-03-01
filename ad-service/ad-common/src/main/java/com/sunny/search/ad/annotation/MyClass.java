package com.sunny.search.ad.annotation;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description TODO
 * @Author sunny
 * @Date 2019-03-01 15:48
 */

@Slf4j
public class MyClass {

    @TestAnnotation("This is Method 1")
    public void Method1(String s) {
        log.info(s);
    }

    public void Method2(String s) {
        log.info(s);
    }

    @TestAnnotation
    public void Method3(String s) {
        log.info(s);
    }
}
