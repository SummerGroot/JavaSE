package com.basic.www.chapter07.homework;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-19 15:43
 */
public class HomeWork08 {
    public static void main(String[] args) {
        new Test().count1();//count1=10
        Test t1 = new Test();
        t1.count2();//count1=9
        t1.count2();//count1=10
    }
}

class Test {
    int count = 9;//属性

    public void count1() {
        //成员方法
        count = 10;
        System.out.println("count1=" + count);
    }

    public void count2() {
        System.out.println("count2=" + count++);
    }
}