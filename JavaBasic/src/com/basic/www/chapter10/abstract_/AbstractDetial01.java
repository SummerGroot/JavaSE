package com.basic.www.chapter10.abstract_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 11:23
 */
public class AbstractDetial01 {
    public static void main(String[] args) {
        //抽象类不能被实例化
        //new A();

    }
}
//抽象类不一定要包含abstract方法。也就是说，抽象类可以没有abstract方法
abstract class A {
    public void hi(){
        System.out.println("say hi");
    }
}
abstract class B{
    public abstract void hi();
}

