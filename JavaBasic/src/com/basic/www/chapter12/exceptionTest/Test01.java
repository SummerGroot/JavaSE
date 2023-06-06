package com.basic.www.chapter12.exceptionTest;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-17 14:08
 */
public class Test01 {
    public static void main(String[] args) {
        ExceptionTest ex = new ExceptionTest();
        try {
            ex.m1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ex.m2();
    }
}

class ExceptionTest {
    public void m1() {
        try {
            System.out.println("运行m1方法");//1
            throw new RuntimeException("m1方法手动抛出运行时异常");//3
        } finally {
            System.out.println("m1方法的finally");//2
        }
    }

    public void m2() {
        try {

            System.out.println("进入m2方法");//4

            return;

        } finally {

            System.out.println("用m2方法的finally");//5

        }

    }
}
