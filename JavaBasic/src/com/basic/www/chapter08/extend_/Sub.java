package com.basic.www.chapter08.extend_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-08 11:19
 */
//Sub继承Base
    //ctrl+h查看类的继承关系
public class Sub extends Base {//子类

    public Sub(String name, int age) {
        //1、想调用父类的无参构造器
        //super();//父类的无参构造器器；或者不写，默认调用super（）
        //2、想调用父类的Base(String name)构造器
        //super("fxy");
        //3、想调用父类的Base(String name, int age)构造器
        super("fxy",25);

        System.out.println("子类Sub(String name, int age) 构造器被调用");
    }

    public Sub() {//无参构造器
        //默认调用父类的无参构造器
        //super();
        super("james", 24);
        System.out.println("子类Sub()构造器被调用");
    }

    //当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        super("tom", 25);
        //do nothing
        System.out.println("子类的带参构造器被调用");

    }

    public void sayOk() {//方法
        //非私有的属性和方法可以在子类直接访问
        //但是私有属性和方法不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400();//错误
        //通过父类提供公共的方法去访问
        System.out.println("n4=" + getN4());
        callTest400();
    }
}
