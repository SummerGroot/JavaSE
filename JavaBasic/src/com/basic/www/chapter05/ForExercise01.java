package com.basic.www.chapter05;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-06 22:09
 */
public class ForExercise01 {
    public static void main(String[] args) {
        //1、打印1~100之间所有是9的倍数的整数，统计个数 及总和
        int count = 0;//统计总和
        int number = 0;//统计个数
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                System.out.println("i=" + i);
                number++;
                count += i;//累计
            }
        }
        System.out.println("9的倍数:" + number + "个" + "总计" + count);
    }
}
