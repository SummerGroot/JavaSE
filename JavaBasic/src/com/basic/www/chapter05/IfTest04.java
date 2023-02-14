package com.basic.www.chapter05;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-06 11:17
 */
public class IfTest04 {
    public static void main(String[] args) {
        //4、判断一个年份是否是闰年，闰年的条件是符合下面二者之一：
        // 年份能被4整除，但不能被100整除；能被400整除
        System.out.println("请输入年份:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
