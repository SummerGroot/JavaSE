package com.basic.www.chapter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-01-31 16:24
 */
public class MethodParameter02 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        int[] arr = {1, 2, 3, 4, 5};
        aaa.test100(arr);//调用方法
        //遍历数组
        System.out.println("这是main的arr数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        Person03 p03 = new Person03();
        p03.name = "summer";
        p03.age = 10;
        aaa.test200(p03);
        System.out.println("main的p.age=" + p03.age);//1000
    }
}

class Person03 {
    String name;
    int age;
}

class AAA {
    //编写一个方法test100,可以接收一个数组，在方法中修改数组，
    // 看看原数组是否变化？
    public void test100(int[] arr) {
        arr[0] = 200;//修改元素
        //遍历数组
        System.out.println("是test100的arr数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    //编写一个方法test200，可以接收一个Person(age.sal)对象
    //在方法中修改对象属性，看看原来的对象是否改变？
    public void test200(Person03 p03) {
        //p03.age=10000;//修改
        p03 = null;
        p03 = new Person03();
    }
}

