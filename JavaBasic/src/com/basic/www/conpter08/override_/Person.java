package com.basic.www.conpter08.override_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-09 11:46
 */
public class Person {
    //包括属性private（name、age），构造器、方法say（返回自我介绍的字符串）
    private String name;
    private int age;

    public Person(String name, int age) {
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

    public String say() {
        return "名字=" + name + " 年龄" + age;
    }
}
