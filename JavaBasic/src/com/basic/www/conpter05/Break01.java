package com.basic.www.conpter05;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-09 14:22
 */
public class Break01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==3){
                break;
            }
            System.out.println("i="+i);
        }
        System.out.println("推出for循环!!!");
    }
}
