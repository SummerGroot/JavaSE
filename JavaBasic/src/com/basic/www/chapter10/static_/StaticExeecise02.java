package com.basic.www.chapter10.static_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 12:12
 */
public class StaticExeecise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is:" + Person.getTotalPerson());//0
        Person p1 = new Person();//走构造器
        System.out.println("Number of total is:" + Person.getTotalPerson());//1
    }
}

class Person {
    private int id;
    private static int total = 0;

    public static int getTotalPerson() {
        //id++;//静态方法无法访问非静态属性
        return total;
    }

    public Person() {//构造器
        total++;//1
        id = total;
    }
}
