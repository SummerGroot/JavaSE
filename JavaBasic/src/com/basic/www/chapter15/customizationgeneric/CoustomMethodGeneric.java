package com.basic.www.chapter15.customizationgeneric;

import java.util.ArrayList;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-09 14:07
 */
public class CoustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马", 100);
        System.out.println("================================");
        car.fly(1, 1.1);//当调用方法时，传入参数，编译器，就会确定类型
        System.out.println("================================");
        //T--->String R--->ArrayList
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.11F);

    }
}

//泛型方法，可以定义在普通类中，也可以定义在泛型类中。
class Car {//普通类

    public void run() {
        //普通方法
    }

    /*
     *1、<T,R>就是泛型
     * 2、是提供fly使用的
     * */
    public <T, R> void fly(T t, R r) {
        //泛型方法
        System.out.println(t.getClass());//class java.lang.String
        System.out.println(r.getClass());//class java.lang.Integer
    }
}

class Fish<T, R> {
    //泛型类
    public void run() {
        //普通方法
    }

    public <U, M> void eat(U u, M m) {
        //泛型方法
    }
    //hi（）不是泛型方法，hi方法使用了类声明的泛型
    public void hi(T t){

    }
    //泛型方法可以使用类声明的泛型，也可以使用自己声明的泛型
    public<K> void hello(R r,K k){
        System.out.println(r.getClass());//class java.util.ArrayList
        System.out.println(k.getClass());//class java.lang.Float
    }
}