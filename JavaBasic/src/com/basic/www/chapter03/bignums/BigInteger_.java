package com.basic.www.chapter03.bignums;

import java.math.BigInteger;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 22:14
 */
public class BigInteger_ {
    public static void main(String[] args) {
        //使用静态的valueOf()方法可以将普通的数值转换为大数.
        BigInteger a = BigInteger.valueOf(100);
        System.out.println(a);
        BigInteger b = BigInteger.valueOf(9);//109
        //add=+
        System.out.println(a.add(b));
        //multiply = *
        System.out.println(a.multiply(b));//900
    }
}
