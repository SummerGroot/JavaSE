package com.basic.www.chapter23.reflection_.question;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-10 14:35
 */
public class Cat {
    private String name = "汤姆";
    public int age = 3;
    public void hi() {
        //System.out.println("hi=" + name);
    }

    public void cry() {
        //System.out.println(name + ":喵喵叫");
    }

    public Cat(String name) {
        this.name = name;
    }
    public Cat(){}//无参构造器
}
