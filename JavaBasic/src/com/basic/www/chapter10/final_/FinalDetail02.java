package com.basic.www.chapter10.final_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 10:57
 */
public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBBB.num);
        //包装类，String是final类，不能被继承

    }
}
//final和static往往搭配使用，效率更高，不会导致类加载。底层编译器做了优化处理。
class BBBB{
    public final static int num =10000;
    static{
        System.out.println("BBB静态代码块被执行");
    }
}
final class AAA{
    public void cry(){}
}