package com.basic.www.chapter10.codeblock_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 16:43
 */
public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
        /*
        * AAA的普通代码块
        * AAA()被调用
          BBB的普通代码块
          BBB()被调用
          * */
    }
}

class AAA {
    {
        System.out.println("AAA的普通代码块");
    }

    public AAA() {
        //super();//隐藏
        //调用本类的普通代码块
        System.out.println("AAA()被调用");
    }
}

class BBB extends AAA {
    {
        System.out.println("BBB的普通代码块");
    }

    public BBB() {
        //super();//隐藏
        //调用本类的普通代码块
        System.out.println("BBB()被调用");
    }
}
