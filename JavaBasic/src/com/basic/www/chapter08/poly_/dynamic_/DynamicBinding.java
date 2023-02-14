package com.basic.www.chapter08.poly_.dynamic_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-10 10:50
 */
public class DynamicBinding {
    public static void main(String[] args) {
        //a的编译类型A，运行类型B
        A a = new B();//向上转型
        System.out.println(a.sum());
        //40 从B类开始查找sum方法
        //注销子类的sum
        //30
        System.out.println(a.sum1());
        //30 从B类开始查找sum方法
        //注销子类sum1
        //20
    }
}

class A {//父类
    public int i = 10;

    /*
     *动态绑定机制
     * 1、当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
     * 2、当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用。
     * */
    public int sum() {
        return geti() + 10;//20+10
    }

    public int sum1() {//父类sum1
        return i + 10;
    }

    public int geti() {//父类geti
        return i;
    }
}

class B extends A {//子类
    public int i = 20;

    /*@Override
    public int sum() {
        return i + 20;
    }*/
    @Override
    public int geti() {//子类geti
        return i;
    }

    /*@Override
    public int sum1() {
        return i + 10;
    }*/
}