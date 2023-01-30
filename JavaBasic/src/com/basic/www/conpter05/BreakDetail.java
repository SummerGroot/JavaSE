package com.basic.www.conpter05;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-09 14:31
 */
public class BreakDetail {
    public static void main(String[] args) {
        lable1:
        for (int j = 0; j < 4; j++) {//外层for
            lable2:
            for (int i = 0; i < 10; i++) {//内层for
                if (i == 2) {
                    //break;//等价break lable2
                    break lable1;
                }
                System.out.println("i=" + i);
            }
        }
    }
}
