package com.basic.www.conpter04;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-02 11:32
 */
public class BitOperator02 {
    public static void main(String[] args) {
        int a = 1 >> 2;//1/2^2
        int c = 1 << 2;//1/2^2
        System.out.println(a);
        System.out.println(c);
        System.out.println(15 >> 2);
        System.out.println(-10.5 % 3);
        int i = 66;
        System.out.println(++i + i);//134
    }
}
