package com.basic.www.chapter10.codeblock_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 15:22
 */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
        /*getN1被调用
          A 静态代码块01
          getN2被调用
          A 普通代码块01
          A无参构造器被调用
         */
    }
}

class A {
    //普通属性
    private int n2 = getN2();

    //静态属性的初始化
    private static int n1 = getN1();

    static {
        //静态代码块
        System.out.println("A 静态代码块01");
    }

    {
        //普通代码块
        System.out.println("A 普通代码块01");
    }


    public static int getN1() {
        System.out.println("getN1被调用");
        return 100;
    }

    public int getN2() {
        //普通方法
        System.out.println("getN2被调用");
        return 100;
    }

    //无参构造器
    public A() {
        System.out.println("A无参构造器被调用");
    }
}
