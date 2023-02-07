package com.basic.www.conpter08.modifier;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-07 15:48
 */
public class B {
    public void say(){
        A a = new A();
        //在同一个包下，可以访问public protected 和默认
        //不能访问private属性和方法
        System.out.println("n1="+a.n1
                +"\tn2="+a.n2
                +"\tn3="+a.n3);
    }
}
