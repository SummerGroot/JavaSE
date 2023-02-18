package com.basic.www.chapter10.innerclass_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-17 14:36
 */
public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        //outer06.m1();
        //外部其他类使用静态内部类
        /*1、因为静态内部类，是可以通过类名直接访问（前提是满足访问权限）*/
        Outer06.Inner06 inner06 = new Outer06.Inner06();
        inner06.say();
        /*2、编写一个方法。可以返回静态内部类的实例*/
        Outer06.Inner06 inner061 = outer06.getInner06();
        System.out.println("=========");
        inner061.say();
        Outer06.Inner06 inner06_ = Outer06.getInner06_();
        inner06_.say();
    }
}

class Outer06 {
    private static String name = "summer";
    private int n1 = 10;

    private static void f1() {
        System.out.println("外部类的静态方法f1()");
    }    //Inner06就是一个静态内部类

    //放在外部类的成员位置
    //使用static修饰
    //可以直接访问外部类的所有静态方法，包含私有，但不能直接访问非静态成员。
    //可以添加任意访问修饰符(public、protected、默认、private)，
    //因为它的位置就是一个成员。
    //作用域：同其他的成员，为整个类体。
    static class Inner06 {
        private static String name = "james";

        public void say() {
            System.out.println(name + "外部类的name=" + Outer06.name);
            f1();
        }
    }

    public void m1() {
        Inner06 inner06 = new Inner06();
        inner06.say();
    }

    public Inner06 getInner06() {
        return new Inner06();
    }

    public static Inner06 getInner06_() {
        return new Inner06();
    }
}