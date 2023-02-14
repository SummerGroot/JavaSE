package com.basic.www.chapter08.poly_.detail_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-09 15:10
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {//猫特有方法
        System.out.println("猫抓老鼠");
    }
}
