package com.basic.www.chapter08.poly_.detail_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-10 10:06
 */
public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();//向上转型
        System.out.println(base.count);//10  直接看编译类型
        Sub sub = new Sub();
        System.out.println(sub.count);//20
    }
}

class Base {//父类
    int count = 10;//属性
}

class Sub extends Base {//子类
    int count = 20;//属性
}
