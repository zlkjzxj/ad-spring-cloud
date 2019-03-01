package com.sunny.search.kafka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @Description TODO
 * @Author sunny
 * @Date 2019-03-01 14:09
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("1");
        list.remove("1");
        System.out.println(list);
        List list1 = Collections.singletonList("1");
        list1.add("2");
        System.out.println(list1);
    }
}
