package com.basic.www.chapter12.try_.return_;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-17 14:57
 */
public class Test01 {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        System.out.println("a+b=" + test01.add(9, 34));//2
    }
    /*
    * 1、先输出finally语句块
    * 2、执行try中的return
    * 3、最后拼接*/
    public int add(int a, int b) {
        try {
            return a + b;
        } catch (ArithmeticException e) {
            System.out.println("catch语句被执行");
        } finally {
            System.out.println("finally语句被执行");//1
        }
        return 0;
    }
}
