package com.basic.www.chapter10.single_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 9:56
 */
public class SingleTon02 {
    public static void main(String[] args) {
        //懒汉式
        //System.out.println(Cat.n1);
        Cat instance01 = Cat.getInstance();
        System.out.println(instance01);//Cat{name='火锅'}
        //再次调用getInstance()方法
        Cat instance02 = Cat.getInstance();
        System.out.println(instance02);//Cat{name='火锅'}
        System.out.println(instance01 == instance02);//true

    }
}

//只能创建一个Cat对象，使用单例模式
class Cat {
    private String name;
    public static int n1 = 999;
    //2、定义一个静态属性
    private static Cat cat;//默认为null

    //1、构造器私有化
    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    //3、提供给公共的static方法，可以返回一个Cat对象
    public static Cat getInstance() {
        if (cat == null) {
            //如果还没有创建猫
            cat = new Cat("火锅");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
