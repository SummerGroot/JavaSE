package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 16:09
 */
public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("孙大圣");
        wukong.climbing();
        wukong.swimming();
        wukong.flying();
    }
}

//猴子
class Monkey {
    private String name;

    public void climbing() {
        System.out.println("猴子会爬树");
    }

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//接口
interface Fishable {
    void swimming();
}

interface Birdable {
    void flying();
}
/*
* 1、当子类继承了父类，就自动拥有父类的功能
* 2、如果子类需要扩展功能，可以通过实现接口的方式扩展
* 3、实现接口 是对java 单继承机制的补充。*/
//小猴子 继承了猴子
class LittleMonkey extends Monkey implements Fishable, Birdable {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "通过学习可以游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "通过学习可以飞翔");
    }
}
