package com.basic.www.chapter07.homework;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-19 15:43
 */
public class HomeWork07 {
    public static void main(String[] args) {
        //设计一个Dog类，有名字、颜色和年龄属性，
        //定义输出方法show()显示其信息。
        //并创建对象，进行测试。
        Dog dog = new Dog("火锅", '白', 2);
        dog.show();
    }
}

class Dog {
    private String name;
    private char color;
    private int age;

    public Dog(String name, char color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println("名字：" + name + "\n颜色：" + color + "\n年龄：" + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}