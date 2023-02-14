package com.basic.www.chapter08.extend_.exercise;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-08 15:30
 */
public class ExtendsExercise02 {
    public static void main(String[] args) {
        C02 c02 = new C02();
    }
}

class A02 {
    public A02() {
        System.out.println("我是A类");
    }
}

class B02 extends A02 {
    public B02() {
        System.out.println("我是B类无参构造器");
    }

    public B02(String name) {
        System.out.println(name + "我是B类有参构造器");
    }
}

class C02 extends B02 {
    public C02() {
        this("hello");
        System.out.println("我是C类无参构造器");
    }

    public C02(String name) {
        super("summer");
        System.out.println("我是C类的带参构造器");
    }
}

