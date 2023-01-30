package com.basic.www.conpter05;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-06 11:17
 */
public class IfTest03 {
    public static void main(String[] args) {
        //3、定义两个变量int，判断二者之和，是否能被3又能被5整除，打印提示信息
        int a = 10;
        int b = 5;
        int sum = a + b;
        if (sum % 3 == 0 && sum % 5 == 0) {
            System.out.println("ok");
        }
    }
}
