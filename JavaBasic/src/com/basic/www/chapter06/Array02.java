package com.basic.www.chapter06;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 14:13
 */
public class Array02 {
    public static void main(String[] args) {
        //循环输入5个成绩，保持到double数组，并输出
        Scanner scanner = new Scanner(System.in);
        //定义一个接收成绩的数组
        double[] score = new double[5];

        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i+1) + "个成绩:");
            double d = scanner.nextDouble();
            score[i] = d;
        }
        for (int i = 0; i < score.length; i++) {
            System.out.println("成绩分别为：" + score[i]);

        }


    }
}
