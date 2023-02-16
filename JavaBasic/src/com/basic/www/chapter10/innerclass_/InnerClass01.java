package com.basic.www.chapter10.innerclass_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 17:18
 */
public class InnerClass01 {//外部其他类

    public static void main(String[] args) {

    }
}

class Outer {//外部类
    //属性
    private int n1 = 10;

    //构造器
    public Outer(int n1) {
        this.n1 = n1;
    }

    //方法
    public void m1() {
        System.out.println("m1()");
    }

    {
        //代码块
        System.out.println("代码块");
    }


    class Inner {//内部类

    }
}