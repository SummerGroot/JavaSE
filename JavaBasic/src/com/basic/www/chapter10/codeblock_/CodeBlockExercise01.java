package com.basic.www.chapter10.codeblock_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 17:29
 */
public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total=" + Person01.total);//100
        System.out.println("total=" + Person01.total);//100
    }
}
class Person01{
    public static int total;//静态变量
    static {
        //静态代码块
        total =100;
        System.out.println("in static block");//1
    }
}
