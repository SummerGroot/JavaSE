package com.basic.www.chapter15.generic;

import java.util.*;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-09 9:57
 */
public class GenericExercise {
    public static void main(String[] args) {
        //使用泛型方式给HashSet放入3个学生对象
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack", 18));
        students.add(new Student("summer", 24));
        students.add(new Student("luka", 26));
        for (Student sdt : students) {
            //System.out.println(sdt);
        }
        //使用泛型方式给HashMap放入3个学生对象
        HashMap<String, Student> hm = new HashMap<String, Student>();
        /*
        public class HashMap<K,V>{}
        */
        hm.put("1", new Student("jack", 18));
        hm.put("2", new Student("summer", 24));
        hm.put("3", new Student("luka", 26));
        //迭代器遍历  EntrySet
        /*public Set<Map.Entry<K,V>> entrySet() {
            Set<Map.Entry<K,V>> es;
            return (es = entrySet) == null ? (entrySet = new HashMap.EntrySet()) : es;
        }*/
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        /*public final Iterator<Map.Entry<K,V>> iterator() {
            return new HashMap.EntryIterator();
        }*/
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> student = iterator.next();
            System.out.println(student.getKey() + "-" + student.getValue());
        }
    }
}

/*
 * 1、创建3个学生对象
 * 2、放入到HashSet中学生对象
 * 3、放入到HashMap中，要求K是String name，V是学生对象
 * 4、使用两种方式遍历*/
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
