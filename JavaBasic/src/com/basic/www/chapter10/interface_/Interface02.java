package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 14:48
 */
public class Interface02 {
    public static void main(String[] args) {
        
    }
}
interface AInterface02{
    //属性
    public int n1=10;

    //写方法
    //在接口中，抽象方法，可以省略abstract关键字
    public void hi();
    //在jdk8后 ，可以有默认实现方法,需要使用default关键字修饰
    default public void ok(){
        System.out.println("ok");
    }
    //也可以静态方法
    public static void say(){
        System.out.println("say hi hello");
    }
}
//1、如果一个类implements实现接口
//2、需要将该接口的所有抽象方法都实现
class A implements AInterface02{
    @Override
    public void hi() {
        System.out.println("hi");
    }
}
