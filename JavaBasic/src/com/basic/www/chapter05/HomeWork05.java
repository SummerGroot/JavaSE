package com.basic.www.chapter05;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-21 10:23
 */
public class HomeWork05 {
    public static void main(String[] args) {
        //6、输出小写的a-z以及大写的A-Z
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            System.out.print(c1 + "\t");
        }
        System.out.println("====================");
        for (char c2 = 'A'; c2 <= 'Z'; c2++) {
            System.out.print(c2 + "\t");
        }
    }
}
