package com.basic.www.chapter10.static_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 12:08
 */
public class StaticExeecise01 {
    public static void main(String[] args) {
        new Test().count();//count=9
        new Test().count();//count=10
        System.out.println(Test.count);//11
    }
}

class Test {
    static int count = 9;

    public void count() {
        System.out.println("count=" + (count++));
    }
}
