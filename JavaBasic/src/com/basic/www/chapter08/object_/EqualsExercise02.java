package com.basic.www.chapter08.object_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-13 15:10
 */
public class EqualsExercise02 {
    public static void main(String[] args) {
        Person02 p1 = new Person02();
        p1.name = "zhangsan";
        Person02 p2 = new Person02();
        p2.name = "zhangsan";
        System.out.println(p1 == p2);//false
        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.equals(p2));//false

        String str1 = new String("asdf");
        String str2 = new String("asdf");
        System.out.println(str1.equals(str2));//true
        System.out.println(str1 == str2);//false
    }
}
class Person02 {
    public String name;
}
