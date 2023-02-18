package com.basic.www.chapter10.innerclass_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-17 13:42
 */
public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.t1();
        //外部其他类，使用成员内部类三种方式
        /*
         * 1、outer05.new Inner05() 相当于把new Inner05()当作是outer05的成员*/
        Outer05.Inner05 inner05 = outer05.new Inner05();
        /*2、在外部类中编写一个方法，可以返回 Inner05对象*/
        Outer05.Inner05 inner051 = outer05.getInner05();
        inner051.say();
    }
}

class Outer05 {//外部类
    private int n1 = 10;
    public String name = "summer";

    //成员内部类是定义在外部的成员位置上。
    //可以添加任意访问修饰符（public、protected、默认、private）,
    //因为它的地位就是一个成员。
    /*private*/ class Inner05 {
        private int n1 = 100;
        private int n2 = 20;

        public void say() {
            //可以访问外部类的所有成员
            System.out.println("Outer05 的 n1 =" + n1 + " outer05的name=" + name);
            hi();
            System.out.println("外部成员 n1=" + Outer05.this.n1);
        }
    }

    //方法
    public void t1() {
        //外部类使用内部类，创建内部类的对象，然后调用。
        Inner05 inner05 = new Inner05();
        inner05.say();
        System.out.println(inner05.n2);
    }

    private void hi() {
        System.out.println("hi");
    }

    //返回一个Inner05的实例
    public Inner05 getInner05() {
        return new Inner05();
    }
}
