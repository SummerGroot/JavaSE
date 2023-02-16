package com.basic.www.chapter10.codeblock_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 17:33
 */
public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test test = new Test();
        /*
        * 静态成员sam初始化
          static块被执行
          sam1成员初始化
          Test默认构造器被调用*/
    }
}

class Sample {
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("sample默认构造器被调用");
    }
}

class Test {
    Sample sam1 = new Sample("sam1成员初始化");
    static Sample sam2 = new Sample("静态成员sam初始化");

    static {
        System.out.println("static块被执行");
        if (sam2 == null) {
            System.out.println("sam is null");
        }
    }

    public Test() {
        System.out.println("Test默认构造器被调用");
    }
}
