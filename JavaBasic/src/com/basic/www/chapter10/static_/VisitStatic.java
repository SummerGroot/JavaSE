package com.basic.www.chapter10.static_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-14 10:49
 */
public class VisitStatic {
    public static void main(String[] args) {
        //类名.类变量名
        //类变量是随着类的加载而创建，即使没有创建对象也可以访问
        System.out.println(A.name);
        //对象名.类变量名
        System.out.println(new A().name);
    }
}

class A {
    //类变量
    //必须遵守相关的访问权限
    public static String name = "summer";
    //普通属性或普通成员变量或非静态变量
    private int num = 7;
}
