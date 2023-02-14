package com.basic.www.chapter03;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-11-23 16:10
 */
public class ForceConvert {
    public static void main(StringToBasicDetail[] args) {
        int i = (int) 1.9;//精度损失
        System.out.println("n1=" + i);
        int i2 = 2000;
        byte b1 = (byte) i2;//-48 数据溢出
        System.out.println("b1=" + b1);
    }
}
