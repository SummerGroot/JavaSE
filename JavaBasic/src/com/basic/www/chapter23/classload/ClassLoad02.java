package com.basic.www.chapter23.classload;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-12 10:29
 */
public class ClassLoad02 {
    public static void main(String[] args) throws ClassNotFoundException {
        //类加载的初始化阶段
        /*
        * 1、加载B类，并生成B的class对象
        * 2、连接 num=0
        * 3、初始化
        * clinit(){
        * System.out.println("B的静态代码块被执行");
          //num=300;
        * num =100;
        * }  合并
        *
        * 4、输出构造器*/
        //new B();//类加载
        System.out.println(B.num);//10，如果直接使用类的静态属性，也会导致类的加载
        //加载类的时候，是有同步机制控制
        Class<?> b = Class.forName("com.basic.www.chapter23.classload.B");
    }
}
class B{
    static{
        System.out.println("B的静态代码块被执行");
        num=300;
    }
    static int num =100;
    public B(){
        System.out.println("B的无参构造器被执行");
    }
}
