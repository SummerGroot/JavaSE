package com.basic.www.chapter08.object_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-13 14:50
 */
public class EqualsExercise01 {
    public static void main(String[] args) {
        //判断两个Person对象的内容是否相等，
        //如果两个Person对象的各个属性值都一样，
        //则返回true，否则false
        Person p1 = new Person("james", 37, '男');
        Person p2 = new Person("kobe", 37, '男');
        System.out.println(p1.equals(p2));//false
    }
}

class Person {  //extends Object
    private String name;
    private int age;
    private char gender;

    //重写Object 的 equals 方法
    public boolean equals(Object obj) {
        //如果比较的两个对象是同一个对象，则直接返回true
        if (this == obj) {
            return true;
        }
        //类型判断
        if (obj instanceof Person) {
            //是Person，我们才比较
            //进行向下转型,需要得到obj的 各个属性
            Person p = (Person) obj;//obj=new Person("kobe", 37, '男');
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        //如果不是Person，则直接返回false
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}