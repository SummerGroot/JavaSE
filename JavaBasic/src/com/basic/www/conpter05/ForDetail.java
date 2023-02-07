package com.basic.www.conpter05;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-06 22:05
 */
public class ForDetail {
    public static void main(String[] args) {
        int count = 3;
        for (int i = 0, j = 0; i < count; i++, j += 2) {
            System.out.println("i=" + i + "j=" + j);
        }
    }
}
