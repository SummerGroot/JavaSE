package com.basic.www.chapter08.poly_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-09 14:01
 */
//polymorphic 多态的
public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("summer");
        Dog dog01 = new Dog("火锅~");
        Bone bone = new Bone("大棒骨~");
        tom.feed(dog01, bone);

        Cat tom01 = new Cat("tom~");
        Fish fish01 = new Fish("小黄鱼~");
        tom.feed(tom01, fish01);
        //添加 给小猪喂米饭
        Pig pig01 = new Pig("小花猪");
        Rice rice = new Rice("剩饭");
        tom.feed(pig01, rice);
    }
}
