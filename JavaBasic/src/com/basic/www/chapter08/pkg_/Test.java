package com.basic.www.chapter08.pkg_;

import com.basic.www.chapter08.modifier_.A;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-07 15:53
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下，可以访问public修饰的属性和方法
        //但不能访问 protected private 默认修饰的属性和方法
        System.out.println(a.n1);
    }
}
