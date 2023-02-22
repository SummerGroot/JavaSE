package com.basic.www.chapter13.string_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 10:10
 */
public class StringExercise04 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "jack";
        Person p2 = new Person();
        p2.name = "jack";
        System.out.println(p1.name.equals(p2.name));//T
        System.out.println(p1.name == p2.name);//T
        System.out.println(p1.name == "jack");//T
        String s1 = new String("edu");
        String s2 = new String("edu");
        System.out.println(s1 == s2);//F
    }
}

class Person {
    public String name;

}
