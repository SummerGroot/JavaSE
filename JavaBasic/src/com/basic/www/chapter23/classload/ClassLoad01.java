package com.basic.www.chapter23.classload;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-12 10:00
 */
public class ClassLoad01 {
    public static void main(String[] args) {
        //类加载链接阶段的准备

    }
}
class A{
    //属性-成员变量-字段
    /*
    * 属性是如何出来
    * 1、n1是实例属性，不是静态属性，因此在准备阶段不会分配内存
    * 2、n2是静态变量，分配内存 n2 是默认初始化0，而不是20
    * 3、n3是static final是常量，和类变量不一样，因为赋值就不变了，n3=30
    * */
    public int n1 =10;
    public static int n2 =20;
    public static final int n3 = 30;
}
