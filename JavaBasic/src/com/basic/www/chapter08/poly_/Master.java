package com.basic.www.chapter08.poly_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-09 14:06
 */
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*//主人给小狗喂食-骨头
    public void feed(Dog dog, Bone bone) {
        System.out.println("主人：" + name + " 给 " + dog.getName() +
                " 吃 " + bone.getName());
    }

    //主人给猫喂鱼
    public void feed(Cat cat, Fish fish) {
        System.out.println("主人：" + name + " 给 " + cat.getName() +
                " 吃 " + fish.getName());
    }*/

    //如果动物很多，食物很多，不利于维护和管理
    //使用多态机制，统一管理主人喂食的问题
    //animal编译类型是Animal，可以指向（接收）Animal子类的对象
    //food编译类型是Food，可以指向（接收）Food子类的对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人：" + this.name + " 给 " + animal.getName() +
                " 吃 " + food.getName());
    }
}
