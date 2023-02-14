package com.basic.www.chapter08.super_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-08 16:10
 */
public class superDetail {
    public static void main(String[] args) {
        B01 b01 = new B01();
        b01.test();
    }
}

class A01 {
    public void say() {
        System.out.println("A say~~");
    }

}

class B01 extends A01 {
    public void test() {
        //say();
        //this.say();
        super.say();
    }
}
