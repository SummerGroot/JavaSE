package com.basic.www.conpter08.override_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-09 11:40
 */
class Dog extends Animal {
    //Dog是Animal的子类
    //Dog的cry方法和Animal的cry定义形式一样（名称、返回参数、参数）
    //这时就说Dog的cry方法重写了Animal的cry方法
    public void cry() {
        System.out.println("小狗汪汪叫。。。");
    }

    //子类方法的返回类型和父类方法返回类型一致，
    //或者是父类返回子类的子类。
    public String m1() {
        return null;
    }

    public void eat() {

    }
}
