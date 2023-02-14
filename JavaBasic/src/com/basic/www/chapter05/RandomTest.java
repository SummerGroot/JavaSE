package com.basic.www.chapter05;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-09 14:01
 */
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(Math.random() * 100));
            //Math.random(); 返回一个double值为正号，大于等于0.0 ，小于1.0 。 返回的值是从该范围（大约）均匀分布而伪随机选择的。
        }
    }
}
