package com.basic.www.chapter23.reflection_;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-11 17:55
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }

    //第一组API
    public static void api_01(){


        //得到Class对象
        try {
            Class<?> cls = Class.forName("com.basic.www.chapter23.reflection_.Person");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


class Person {
    //属性
    public String name;
    protected int age;
    String job;
    private double sal;

    //方法
    public void m1() {
    }

    protected void m2() {
    }

    void m3() {
    }

    private void m4() {
    }
}