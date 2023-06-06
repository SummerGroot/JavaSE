package com.basic.www.chapter12.exception_;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-17 12:31
 */
public class ClassCastException {
    public static void main(String[] args) {
        A b = new B();//向上转型
        B b1= (B)b;//ok
        C c1 = (C)b;
        //Exception in thread "main" java.lang.ClassCastException
    }
}
class A{}
class B extends A{}
class C extends A{}
