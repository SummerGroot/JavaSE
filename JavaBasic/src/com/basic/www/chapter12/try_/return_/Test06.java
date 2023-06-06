package com.basic.www.chapter12.try_.return_;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-17 15:01
 */
public class Test06 {
    public static void main(String[] args) {
        System.out.println(m1());//122
        System.out.println("============");
        System.out.println(m2());//1122
    }

    //无异常
    public static int m1() {
        int temp = 1;
        try {
            System.out.println(temp);//1
            return ++temp;//2
        } catch (Exception e) {
            System.out.println(temp);
            return ++temp;
        } finally {
            System.out.println(temp);//2
        }
    }

    //有异常
    public static int m2() {
        int temp = 1;
        try {
            System.out.println(temp);//1
            int i = 1 / 0;
            return ++temp;
        } catch (Exception e) {
            System.out.println(temp);//1
            return ++temp;//2
        } finally {
            System.out.println(temp);//2
        }
    }
}
