package com.basic.www.chapter10.abstract_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 11:30
 */
public class AbstractDetial02 {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

//抽象类的本质还是类
abstract class D{
    public int n1 =10;
    public static String name = "summer";
    public void hi(){
        System.out.println("hi");
    }
    public abstract void show();
    public static void ok(){
        System.out.println("ok");
    }
}
abstract class E{
    public abstract void hi();
}
class F extends E {

    @Override
    public void hi() {

    }
}
