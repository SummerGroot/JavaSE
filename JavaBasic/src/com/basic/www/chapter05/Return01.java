package com.basic.www.chapter05;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-12 10:19
 */
public class Return01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("SummerStudy" + i);
                return;
                //continue;
                //break;
            }
            System.out.println("HelloWrold!!!");
        }
        System.out.println("go on...");
    }
}
