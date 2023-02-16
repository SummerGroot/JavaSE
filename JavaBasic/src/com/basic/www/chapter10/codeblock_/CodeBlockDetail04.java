package com.basic.www.chapter10.codeblock_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 16:52
 */
public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B04();//创建对象
        /*
         * 1、类的加载
         * 1.1加载父类A04，1.2再加载B02
         * 2、创建对象
         * 2.1从子类的构造器开始*/
        new C04();
    }
}

class A04 {//父类
    private static int n1 = getN1();

    static {
        System.out.println("A04的第一个静态代码块");//2
    }

    {
        System.out.println("A04的第一个普通代码块");//5
    }

    public int n2 = getN2();

    public static int getN1() {
        System.out.println("getN1");//1
        return 10;
    }

    public int getN2() {
        /*
         * 隐藏
         * supoer()
         * 普通代码块*/
        System.out.println("getN2");//6
        return 20;
    }

    public A04() {
        System.out.println("A04的构造方法");//7
    }
}

class C04 {
    private int n1 = 100;
    private static int n2 = 200;

    public void m1() {
    }

    private static void m2() {
    }

    static {
        //静态代码块，只能调用静态成员
        System.out.println(n2);
        m2();
    }

    {
        //普通代码块，可以使用任意成员
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }
}

class B04 extends A04 {//B04继承了A04
    private static int n3 = getN3();

    static {
        System.out.println("B04的第一个静态代码块");//4
    }

    {
        System.out.println("B04的第一个普通代码块");//8
    }

    public static int getN3() {
        /*
         * 隐藏
         * super()
         * 普通代码块*/
        System.out.println("getN3");//3
        return 30;
    }

    public B04() {
        System.out.println("B04的构造器");//9
    }
}