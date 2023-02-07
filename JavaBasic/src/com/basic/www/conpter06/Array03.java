package com.basic.www.conpter06;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 14:47
 */
public class Array03 {
    public static void main(String[] args) {
        //方式2
        //先声明
        double a[];
        //创建数组
        a = new double[4];//分配了内存空间，可以存放数据
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第" + (i+1) + "个成绩:");
            double d = scanner.nextDouble();
            a[i] = d;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("成绩分别为：" + a[i]);

        }
    }
}
