package com.basic.www.chapter14.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-24 10:40
 */
public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /*
         * 添加10个以上的元素(比如string "hello")，在2号位插入一个元素"xyedu"
         * ，获取第5个元素，删除第6个元素，修改第7个元素，在使用迭代器遍历集合，
         * 要求：使用List的实现类ArrayList完成*/
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list=" + list);
        //在2号位(下标为1）插入一个元素
        list.add(1, "xyedu");
        //获取第5个元素
        System.out.println("第5个元素为=" + list.get(5));
        //删除第6个元素
        list.remove(6);
        System.out.println("list=" + list);
        //修改第7个元素
        list.set(7, "have");
        System.out.println("list=" + list);
        Iterator iterator = list.iterator();//获取迭代器对象
        System.out.print("list=[");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.print(obj + ",");
        }
        System.out.print("]");

    }
}
