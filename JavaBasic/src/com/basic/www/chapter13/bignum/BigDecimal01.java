package com.basic.www.chapter13.bignum;

import java.math.BigDecimal;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 9:15
 */
public class BigDecimal01 {
    public static void main(String[] args) {
        double d = 1999.11111124343253245311d;
        System.out.println(d);
        /*
        * 需要保存一个精度很高的数，用BigDecimal*/
        BigDecimal bigDecimal1 = new BigDecimal("1999.11111124343253245312");
        System.out.println(bigDecimal1);
        //运算用相应的方法
        BigDecimal bigDecimal2 = new BigDecimal("1.1");
        System.out.println(bigDecimal1.add(bigDecimal2));//加
        System.out.println(bigDecimal1.subtract(bigDecimal2));//减
        System.out.println(bigDecimal1.multiply(bigDecimal2));//乘
        /*
        * 在调用divide方法时，指定精度
        * 如果有无限循环小数，就会保留分子的精度*/
        System.out.println(bigDecimal1.divide(bigDecimal2,BigDecimal.ROUND_CEILING));//除  除不尽抛出异常  ArithmeticException
    }
}
