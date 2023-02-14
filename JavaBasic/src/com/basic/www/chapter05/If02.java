package com.basic.www.chapter05;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-05 21:36
 */
public class If02 {
    public static void main(String[] args) {
        //编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁，
        // 则输出"你的年龄大于18，要对自己的行为负责，送入监狱"。
        // 否则，输出"你的年龄不大这次放过你"。
        System.out.println("请出入你的年龄:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("你年龄大于18，要对自己的行为负责，送入监狱");
        } else {
            System.out.println("你的年龄不大于这次放过你");
        }
    }
}
