package com.basic.www.chapter03;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 20:00
 */
public class Final_ {
    public static void main(String[] args) {
        final int A = 1;
        new A().m1();

    }
}
class A{
    public static final int AA =500;

    public A() {
    }
    public void m1(){
        System.out.println(A.AA);
    }
}