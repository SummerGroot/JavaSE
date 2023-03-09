package com.basic.www.chapter15.customizationgeneric;

import java.util.Arrays;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-09 13:26
 */
public class CoustomGeneric {
    public static void main(String[] args) {
        //T=Double R=String M=Integer
        Tiger<Double, String, Integer> g = new Tiger("john");
        g.setT(10.9);//T
        //g.getT("yy");//F
        System.out.println(g);
        Tiger g2 = new Tiger("john~~");//默认给的Object
        g2.setT("yy");//T  T是Objcet “yy”是String 是Objcet的子类
        System.out.println("g2="+g2);
    }
}

//定义泛型类
/*
 * 1、Tiget后面泛型，所有把Tiger称为自定义泛型类
 * 2、T，R，M泛型标识符，一般是大写字母。
 * 3、泛型的标识符可以多个*/
class Tiger<T, R, M> {
    //普通成员可以使用泛型（属性、方法）
    String name;//属性使用到泛型
    R r;
    M m;
    T t;
    //使用泛型的数组，不能初始化
    //T[] ts = new T[8];
    //数组在new，不能确定T的类型，就无法在内存开空间
    T[] ts;//可以定义

    public Tiger(String name) {
        this.name = name;
    }

    public Tiger(R r, M m, T t) {//构造器使用泛型
        this.r = r;
        this.m = m;
        this.t = t;
    }
    //静态方法不能使用泛型
    //public static void f(M m){}
    //静态是和类相关的，在类加载时，对象还没创建。所以，静态方法和静态属性使用了泛型，JVM就无法完成初始化。

    //方法使用泛型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}