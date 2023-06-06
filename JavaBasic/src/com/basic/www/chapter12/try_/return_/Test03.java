package com.basic.www.chapter12.try_.return_;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-17 15:01
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println(m1());//112
    }

    public static int m1() {
        int i = 1;
        try {
            System.out.println(i);//1
            return i + 1;//2
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(i);//1
            return ++i;//2
        }
    }
}
