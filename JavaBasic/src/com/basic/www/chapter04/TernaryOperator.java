package com.basic.www.chapter04;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-11-26 13:11
 */
public class TernaryOperator {
    public static void main(String[] args) {
        //三元运算符
        int a = 10;
        int b = 99;
        int result = a > b ? a++ : b--;
        /*
        * 1、a>b为false
        * 2、返回b--，先返回b--的值，b再-1
        * 3、返回的结果是99*/
        System.out.println("result="+result);//99
        System.out.println("a="+a);//10
        System.out.println("b="+b);//98
    }
}
