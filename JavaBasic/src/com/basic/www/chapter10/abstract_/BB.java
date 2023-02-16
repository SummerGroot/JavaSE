package com.basic.www.chapter10.abstract_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 14:04
 */
public class BB extends Template {

    public void job() {//重写了Template 的job方法
        long num = 0;
        for (long i = 1; i < 1000000; i++) {
            num *= i;
        }
    }
}
