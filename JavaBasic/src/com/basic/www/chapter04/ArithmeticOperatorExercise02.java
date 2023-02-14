package com.basic.www.chapter04;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-11-25 17:35
 */
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i=" + i);//10
        System.out.println("i2=" + i2);//20
        i = --i2;
        System.out.println("i=" + i);//19
        System.out.println("i2=" + i2);//19
    }
}
