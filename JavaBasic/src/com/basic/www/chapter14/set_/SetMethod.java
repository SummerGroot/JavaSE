package com.basic.www.chapter14.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-01 13:53
 */
public class SetMethod {
    public static void main(String[] args) {
        /*
         * 1、以Set接口的实现类 HashSet来讲解Set接口的方法
         *2、set接口的实现类的对象，不能存放重复的元素，可以添加一个null
         *3、set对象存放数据是无序（即添加的顺序和取出的顺序不一致）
         * 4、注意：取出的顺序是固定的，虽然不是添加的顺序
         * */
        Set set = new HashSet();
        set.add("join");
        set.add("lucy");
        set.add("join");
        set.add("jack");
        set.add(null);
        set.add(null);
        System.out.println("set=" + set);
        //遍历
        //1、迭代器
        System.out.println("===迭代器===");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        //增强for
        System.out.println("===增强for===");
        for (Object obj : set) {
            System.out.println("obj=" + obj);
        }
        //set接口对象不能通过索引遍历
    }
}
