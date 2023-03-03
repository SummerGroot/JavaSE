package com.basic.www.chapter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-07 10:51
 */
public class TestPerson {
    public static void main(String[] args) {
        PersonT p1 = new PersonT("summer", 24);
        PersonT p2 = new PersonT("james", 37);
        System.out.println("p1和p2比较的结果为：" + p1.compareTo(p2));//p1和p2比较的结果为：false

    }
}

/*
 * 定义Person类，里面有name、age属性，并提供compareTo比较方法，
 * 用于判断是否和另一个人相等，提供测试类TestPerson用于测试，
 * 名字和年龄完全一样，就返回true，否则返回false*/
class PersonT {
    String name;
    int age;

    //带惨构造器
    public PersonT(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //compareTo方法
    public boolean compareTo(PersonT p) {
        /*if (this.name.equals(p.name) && this.age == p.age) {
            return true;
        }
        return false;*/
        return this.name.equals(p.name) && this.age == p.age;
    }
}
