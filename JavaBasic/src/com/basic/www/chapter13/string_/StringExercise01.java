package com.basic.www.chapter13.string_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 9:48
 */
public class StringExercise01 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        //String equals()方法被重写
        System.out.println(a.equals(b));//true
        System.out.println(a == b);//true
    }
}
