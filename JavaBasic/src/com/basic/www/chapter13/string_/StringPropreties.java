package com.basic.www.chapter13.string_;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-18 13:26
 */
public class StringPropreties {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println("修改前s1的hashcode = " + s1.hashCode());//99162322
        s1 = "hhh";
        System.out.println("修改后s1的hashcode = " + s1.hashCode());//103272
        //创建了2个对象
    }
}
