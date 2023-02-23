package com.basic.www.chapter13.bignum;

import java.math.BigInteger;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 9:07
 */
public class BigInteger01 {
    public static void main(String[] args) {
        /*
        * 需要处理很大的整数，long不够用
        * 可以使用BigInteger的类来搞定*/
        long l = 12321324253243123L;
        System.out.println(l);
        BigInteger bigInteger1 = new BigInteger("4324325435342653246235");
        BigInteger bigInteger2 = new BigInteger("10");
        System.out.println(bigInteger1);
        /*
        * 在对BigInteger进行加减乘除的时候，需要使用对应的方法，不能直接进行
        * 可以创建一个 要操作的BigInteger然后进行相应操作*/
        BigInteger add = bigInteger1.add(bigInteger2);//加法
        System.out.println(add);
        BigInteger subtract = bigInteger1.subtract(bigInteger2);//减
        System.out.println(subtract);
        BigInteger multiply = bigInteger1.multiply(bigInteger2);//乘
        System.out.println(multiply);
        BigInteger divide = bigInteger1.divide(bigInteger2);//除
        System.out.println(divide);
    }
}
