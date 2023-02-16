package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 16:01
 */
public class InterfaceExercise01 {
    public static void main(String[] args) {
        BB b = new BB();
        System.out.println(b.a);//23
        System.out.println(AA.a);//23
        System.out.println(BB.a);//23
    }
}
interface AA{
    int a =23;//public static final int a = 23;
}
class BB implements AA{
}