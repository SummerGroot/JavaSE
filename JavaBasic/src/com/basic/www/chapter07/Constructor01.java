package com.basic.www.chapter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-06 14:09
 */
public class Constructor01 {
    public static void main(String[] args) {
        //当我们new一个对象时，直接通过构造器名称和年龄
        PersonConstructor01 p1 = new PersonConstructor01("summer", 100);
        System.out.println("p1的信息");
        System.out.println("p1对象name=" + p1.name);//summer
        System.out.println("p1对象age=" + p1.age);//100
    }
}

//在创建人类对象时，就直接指定这个对象的年龄和姓名
class PersonConstructor01 {
    String name;
    int age;

    //构造器-alt+insert
    public PersonConstructor01(String pName, int pAge) {
        System.out.println("构造器被调用，完成对象属性的初始化！！");
        name = pName;
        age = pAge;
        /*
         * 1、构造器没有返回值，也不能写void
         * 2、构造器的名称和类名PersonConstructor01必须一致
         * 3、(String pName, int pAge)是构造器形参列表，规则和成员方法一样*/
    }
}
