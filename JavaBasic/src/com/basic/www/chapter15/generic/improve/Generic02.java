package com.basic.www.chapter15.generic.improve;

import java.util.ArrayList;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-08 16:57
 */
public class Generic02 {
    public static void main(String[] args) {
        //泛型解决
        /*
         *1、当我们 ArrayList<Dog> 表示存放ArrayList集合中的元素是Dog类型
         * 2、如果编译器发现添加的类型，不满足要求，就会报错
         * 3、在遍历的时候，可以直接取出Dog类型而不是Object
         * 4、public class ArrayList<E>{} E称为泛型，那么Dog->E */
        ArrayList<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("火锅", 3));
        list.add(new Dog("旺财", 2));
        list.add(new Dog("小黄", 5));

        //假如，添加了一只猫
        //list.add(new Cat("招财", 1));//ClassCastException 类型转换异常
        //遍历
        System.out.println("===使用泛型===");
        for (Dog dog : list) {
            System.out.println("名字：" + dog.getName() + "\t年纪： " + dog.getAge());
        }
    }
}

//泛型
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