package com.basic.www.chapter14.set_;

import java.util.HashSet;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-01 16:33
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        /*
         * 1、在执行add方法后，会返回一个boolean值
         * 2、如果添加成功，返回true，否则返回false
         * 3、通过remove指定删除对象
         * */
        System.out.println(hs.add("john"));//T
        System.out.println(hs.add("lucy"));//T
        System.out.println(hs.add("john"));//F
        System.out.println(hs.add("jack"));//T
        System.out.println(hs.add("rose"));//T
        hs.remove("john");
        System.out.println("hs=" + hs);

        hs = new HashSet();
        //System.out.println("hs=" + hs);//hs=[]
        //HashSet不能存放和添加相同的元素/对象
        hs.add("lucy");//添加成功
        hs.add("lucy");//加入不了
        hs.add(new Dog("tom"));//T
        hs.add(new Dog("tom"));//T
        System.out.println("hs=" + hs);

        //再加深，非常经典的面试题
        //看源码
        hs.add(new String("summer"));//T
        hs.add(new String("summer"));//加入不了
        System.out.println("hs=" + hs);

    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}