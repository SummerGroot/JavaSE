package com.basic.www.chapter05;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-06 11:48
 */
public class If03 {
    public static void main(String[] args) {
        /*
         *输入夏源的芝麻信用分
         * 1、信用分为100时，输出信用极好；
         * 2、信用分为(80,99]时，输出信用优秀
         * 3、信用分为[60，80)时，输出信用一般
         * 4、其他情况，输出信用不及格
         * 5、请从键盘输入夏源的芝麻信用分，并加以判断*/
        //输入夏源的信用分
        System.out.println("请出入夏源的芝麻信用分:");
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        if (d == 100) {
            System.out.println("夏源信用极好");
        } else if (d > 80 && d <= 99) {
            System.out.println("夏源信用优秀");
        } else if (d >= 60 && d <= 80) {
            System.out.println("夏源信用一般");
        } else if (d < 60) {
            System.out.println("信用不及格");
        }
    }
}
