package com.basic.www.chapter08.poly_.objectpoly_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-09 14:34
 */
public class PolyObject {
    public static void main(String[] args) {
        //对象多态特点

        //animal编译类型就是Animal，运行类型就Dog
        Animal animal = new Dog();
        //运行时，这时就执行到该行是，animal运行类型是Dog，所以cry就是Dog的cry
        animal.cry();//Dog cry()汪汪汪。。。
        //animal 编译类型 Animal ，运行类型是Cat
        animal = new Cat();
        animal.cry();//Cat cry（）喵喵喵。。。
    }
}
