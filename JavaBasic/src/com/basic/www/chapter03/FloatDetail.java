package com.basic.www.chapter03;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-11-18 17:07
 */
public class FloatDetail {
    public static void main(StringToBasicDetail[] args) {
        /*float num1 = 1.1F;
        double num2 = 1.1;
        double num3 = 2.1234567851;
        float num4 = 2.12345678F;
        System.out.println(num3);
        System.out.println(num4);*/
        double num = 2.7;
        double num1 =8.1/3;
        if (Math.abs(num - num1)<0.0000001) {
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
        //System.out.println(Math.abs(num-num1));
    }
}
