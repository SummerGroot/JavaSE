package com.basic.www.chapter05;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-05 21:15
 */
public class If01 {
    public static void main(String[] args) {
        //编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，
        // 则输出"你的年龄大于18，要对自己的行为负责，送入监狱"
        System.out.println("请输入你的年龄:");
        //接受输入年龄，应该定义一个Scanner对象
        Scanner scanner = new Scanner(System.in);
        //把年龄保存到一个变量 int age
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("你年龄大于18，要对自己的行为负责，送入监狱");
        }
    }
}
