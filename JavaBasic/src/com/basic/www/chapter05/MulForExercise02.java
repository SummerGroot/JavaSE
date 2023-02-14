package com.basic.www.chapter05;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-07 11:38
 */
public class MulForExercise02 {
    public static void main(String[] args) {
        //打印9*9乘法表
        for (int i = 1; i <= 9; i++) {//表示第一列
            for (int j = 1; j <= i; j++) {//表示第二列
                System.out.print(j + "\t" + "*" + "\t" + i + "\t=\t" + (j * i) + "\t\t");
            }
            System.out.println("\n");
        }
    }
}
