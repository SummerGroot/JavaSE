package com.basic.www.chapter15.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-08 16:38
 */
public class Generic01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //传统的方法
        list.add(new Dog("火锅", 3));
        list.add(new Dog("旺财", 2));
        list.add(new Dog("小黄", 5));

        //假如，添加了一只猫
        list.add(new Cat("招财", 1));//ClassCastException 类型转换异常

        //遍历
        for (Object obj : list) {
            //向下转型Object -->Dog
            Dog dog = (Dog) obj;
            System.out.println("名字：" + dog.getName() + "\t年纪： " + dog.getAge());
        }
    }
}

/*
 * 编写程序，在ArrayList中，添加3个Dog对象
 * Dog对象含有name和age，并输出name，和age（要求使用getXXX（））*/
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat {//Cat类
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}