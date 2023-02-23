package com.basic.www.chapter14.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 15:39
 */
public class CollectionExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //创建3个Dog{name,age }对象，放入到ArrayList中，赋给List引用
        //用迭代器和增强for循环两种方式来遍历
        //重写Dog的toString方法，输出name和age
        List list = new ArrayList();
        list.add(new Dog("Tom", 2));
        list.add(new Dog("Jerry", 3));
        list.add(new Dog("Jack", 4));
        //iterator遍历
        Iterator iterator = list.iterator();//通过list拿到迭代器
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println("dog" + dog);
        }
        //增强for
        for (Object dog : list) {
            System.out.println("dog" + dog);
        }

    }
}

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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
