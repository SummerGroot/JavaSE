package com.basic.www.chapter10.static_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 11:48
 */
public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();
        //非静态方法不能通过类名调用。
        D.hello();
    }
}

class D {
    private int n1 = 100;
    private static int n2 = 200;

    public void say() {
        //非静态方法
    }

    public static void hi() {
        //静态方法，类方法
        //类方法中不允许使用和对象有关的关键字，
        //比如this和super。普通方法（成员方法）可以。
        //System.out.println(this.n1);
    }

    //类方法（静态方法）中，只能访问静态变量或静态方法
    //静态方法只能访问静态成员
    public static void hello() {
        System.out.println(n2);
        System.out.println(D.n2);
        hi();
        //say();//错误
    }

    public void ok() {
        //访问非静态成员
        System.out.println(n1);
        say();
        //静态成员
        System.out.println(n2);
        hi();
        hello();

    }
}
