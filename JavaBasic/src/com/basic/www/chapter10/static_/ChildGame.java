package com.basic.www.chapter10.static_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-14 10:13
 */
public class ChildGame {
    public static void main(String[] args) {
        //定义一个变量conut ,统计有多少小孩加入游戏
        int count = 0;
        Child child01 = new Child("小明");
        child01.join();
        //count++;
        child01.count++;
        Child child02 = new Child("小红");
        child02.join();
        //count++;
        child02.count++;
        Child child03 = new Child("小南");
        child03.join();
        //count++;
        child03.count++;
        //=====================
        //类变量，可以通过类名访问
        System.out.println("共有：" + Child.count + "小孩加入了游戏");
        System.out.println("child01.count=" + child01.count);
        System.out.println("child01.count=" + child02.count);
        System.out.println("child01.count=" + child03.count);
    }
}

class Child {
    private String name;
    //定义一个变量count。是一个类变量（静态变量）static静态
    //该变量最大的特点就是会被Child类的所有对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
    }
}
