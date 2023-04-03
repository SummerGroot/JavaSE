package com.basic.www.chapter19.outputstream_;


import java.io.Serializable;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 15:03
 */
public class Dog implements Serializable {
    //如果需要系列化某个类的对象，实现Serializable
    private String name;
    private int age;
    //serialVersionUID序列化的版本号，可以提高兼容性
    private static final long serialVersionUID = 1L;
    private static String nation;
    private transient String color;
    private Master master = new Master();

    public Dog(String name, int age, String nation, String color) {
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}' + nation + "\t" + master;
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

