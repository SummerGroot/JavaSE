package com.basic.www.chapter10.static_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-14 10:57
 */
public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.n1);
        System.out.println(B.n2);
        System.out.println(C.address);
    }
}
class B{
    public int n1 =100;
    public static int n2 =200;
}
class C{
    public static String address = "成都";
}

