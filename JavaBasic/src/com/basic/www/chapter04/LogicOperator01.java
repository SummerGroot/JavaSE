package com.basic.www.chapter04;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-11-25 19:33
 */
public class LogicOperator01 {
    public static void main(String[] args) {
        /*
         * 演示逻辑运算符
         * &&和&案例演示*/
        int age = 20;
        if (age > 20 && ++age < 90) {
            System.out.println("ok1");
        }
        //&
        if (age > 20 & ++age < 90) {
            System.out.println("ok2");
        }
        System.out.println("age="+age);
        //区别
        int a = 4;
        int b = 9;
        //对于&&短路与而言，如果第一个条件为false，后面的条件不再判断
        //对于&逻辑与而言，如果第一个条件为false，后面的条件仍然会判断
        if (a < 1 & ++b < 50) {
            System.out.println("ok3");
        }
        System.out.println("a=" + a + "b=" + b);
    }
}
