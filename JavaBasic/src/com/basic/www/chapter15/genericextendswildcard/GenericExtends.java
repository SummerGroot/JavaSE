package com.basic.www.chapter15.genericextendswildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-09 14:40
 */
public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("hello");
        //泛型没有继承性
        //List<Object> list = new ArrayList<String>();
        //说明
        List<Object> list01 = new ArrayList<>();
        List<String> list02 = new ArrayList<>();
        List<AA> list03 = new ArrayList<>();
        List<BB> list04 = new ArrayList<>();
        List<CC> list05 = new ArrayList<>();
        //如果是 List<?> c 可以接收任意的泛型类型
        printCollection1(list01);
        printCollection1(list02);
        printCollection1(list03);
        printCollection1(list04);
        printCollection1(list05);
        //List<? extends AA> c
        //printCollection2(list01);//F
        //printCollection2(list02);//F
        printCollection2(list03);//T
        printCollection2(list04);//T
        printCollection2(list05);//T
        //List<? super AA> c
        printCollection3(list01);//T
        //printCollection3(list02);//F
        printCollection3(list03);//T
        //printCollection3(list04);//F
        //printCollection3(list05);//F
    }

    //编写方法
    //List<?>任意泛型类型都可以接收
    public static void printCollection1(List<?> c) {
        for (Object object : c) {
            //通配符，取出时，就是Object
            System.out.println(object);
        }
    }

    //? extends AA表示上限，可以接收AA或者AA子类
    public static void printCollection2(List<? extends AA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    //? super 子类类名AA :支持AA类以及AA类的父类，不限于直接父类，规定了泛型的下限
    public static void printCollection3(List<? super AA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

}

class AA {

}

class BB extends AA {

}

class CC extends BB {

}
