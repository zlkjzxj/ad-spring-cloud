package com.sunny.search.ad.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author sunny
 * @Date 2019-03-01 15:49
 */
public class Test {
    public static void main(String[] args) {
        try {
            Class classz = Class.forName("com.sunny.ad.annotation.MyClass");
            Method[] methods = classz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(TestAnnotation.class)) {
                    TestAnnotation annotation = method.getAnnotation(TestAnnotation.class);
                    method.invoke(classz.newInstance(), annotation.value());
                }else{
                    method.invoke(classz.newInstance(),"fuck");
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
