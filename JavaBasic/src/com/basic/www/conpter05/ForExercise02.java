package com.basic.www.conpter05;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-07 10:31
 */
public class ForExercise02 {
    public static void main(String[] args) {
        /*
        打印下面的表达式输出
        * 0+5=5
        * 1+4=5
        * 2+3=5
        * 3+2=5
        * 4+1=5
        * 5+0=5*/
        for (int i = 0, j = 5; i <= 5; i++, j--) {
            System.out.println(i + "+" + j + "=" + (i + j));
        }
    }
}
