package com.sunny.ad.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\19 0019 16:13
 */
//可以作用在类和方法上，运行时retention
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface IgnoreResponseAdvice {
}
