package com.basic.www.chapter10.abstract_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 11:13
 */
public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //eat方法无意义，父类方法不确定性问题
    //将该方法设计为抽象(abstract)方法
    //所谓抽象方法就是没有实现的方法，就是指没有方法体
    //当一个类中存在抽象方法时，需要将该类声明为抽象类
    //一般来说，抽象类会被继承，有气子类来实现抽象方法
    /*public void eat() {
        System.out.println("这是一个动物，但是不知道吃什么！！！");
    }*/
    public abstract void eat();
}
