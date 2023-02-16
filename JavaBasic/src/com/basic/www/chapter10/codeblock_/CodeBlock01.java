package com.basic.www.chapter10.codeblock_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 14:47
 */
public class CodeBlock01 {
    public static void main(String[] args) {
        //Moive moive = new Moive("你好，李焕英");
        Moive moive01 = new Moive("流浪地球2", 101);
    }
}

class Moive {
    private String name;
    private double price;
    private String director;

    //构造器->重载
    /*
     * 1、下面的构造器有相同的语句
     * 2、这样代码比较冗余
     * 3、把相同的语句放在代码块中
     * 4、当我们不管调用哪个构造器，创建对象，都会先调用代码块
     * 5、代码块调用的顺序优先于构造器*/
    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影正式开始");
    }

    public Moive(String name) {
        System.out.println("Moive(String name)构造器被调用");
        this.name = name;
    }

    public Moive(String name, double price) {
        System.out.println("(String name, double price)构造器被调用");
        this.name = name;
        this.price = price;
    }

    public Moive(String name, double price, String director) {
        System.out.println("(String name, double price, String director)构造器被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
