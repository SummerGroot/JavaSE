package com.basic.www.chapter05;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-06 15:55
 */
public class Switch01 {
    public static void main(String[] args) {
        //输入一个字符
        System.out.println("请输入:");
        Scanner scanner = new Scanner(System.in);
        //在java中，只要有值返回，就是一个表达式
        char c = scanner.next().charAt(0);
        switch (c) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入有错，请重新输入！！！");
        }
    }
}
