package com.basic.www.chapter14.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-02 11:01
 */
public class HashSetExercise {
    public static void main(String[] args) {
        //创建3个Employee放入HashSet中
        HashSet hs = new HashSet();
        hs.add(new Employee("jack", 24));
        hs.add(new Employee("summer", 25));
        hs.add(new Employee("jack", 24));
        //当name和age的值相同时，认为是相同员工，不能添加到HashSet集合中
        System.out.println("hs=" + hs);
    }
}

class Employee {
    //两个私有属性
    private String name;
    private int age;

    public Employee(String name, int age) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //如果name和age的值相同，则放回相同的hash值

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
