package com.basic.www.conpter04;

import java.util.Scanner;//表示把java.util下的Scanner类导入

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-02 10:11
 */
public class Input {
    public static void main(String[] args) {
        //用户的输入
        //Scanner类 表示 简单的文本扫描器,在java.util包
        /*
         * 步骤
         * 1、引用Scanner类所在的包
         * 2、创建Scanner对象,new 创建一个对象
         * 3、接收用户的输入了，使用相关的方法*/
        Scanner myScanner = new Scanner(System.in);
        //System.out.println("请输入名字：");
        ////当程序执行到 next()方法时，会等待用户输入~~~
        //String name = myScanner.next();//接受用户输入字符串
        //System.out.println("清输入年龄：");
        //int age = myScanner.nextInt();//接受用户输入int
        //System.out.println("清输入薪水：");
        //double sal = myScanner.nextDouble();
        //System.out.println("名字："+name+"\n年龄："+age+"\n薪水："+sal);
        char c1 = myScanner.next().charAt(0);//a
        System.out.println(c1);//a
    }
}
