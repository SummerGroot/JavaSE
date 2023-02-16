package com.basic.www.chapter10.main_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 14:16
 */
public class Main01 {
    //静态的变量
    private static String name = "summersdu";
    //非静态属性
    private int n1 = 10000;

    //静态方法
    public static void hi() {
        System.out.println("Main01的hi方法");
    }

    //非静态方法
    public void say() {
        System.out.println("非静态方法的say方法");
    }

    public static void main(String[] args) {
        //静态方法可以访问本类的静态成员
        System.out.println("name" + Main01.name);
        hi();
        //静态方法mian无法访问本类的非静态
        Main01 main01 = new Main01();
        System.out.println("n1=" + main01.n1);
        main01.say();

    }
}
