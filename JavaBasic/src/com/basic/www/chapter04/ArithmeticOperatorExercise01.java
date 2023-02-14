package com.basic.www.chapter04;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-11-25 17:06
 */
public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        /*int i = 1;
        i = i++;//规则使用临时变量：(1)temp=i;(2)i=i+1;(3)i=temp;
        System.out.println(i);//1*/
        int i = 1;
        i = ++i;//规则使用临时变量：(1)i=i+1;(2)temp=i;(3)i=temp;
        System.out.println(i);

    }
}
