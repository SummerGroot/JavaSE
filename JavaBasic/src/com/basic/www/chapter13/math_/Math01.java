package com.basic.www.chapter13.math_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 15:59
 */
public class Math01 {
    public static void main(String[] args) {
        //abs绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);//9
        //pow求幂
        System.out.println(Math.pow(3, 2));//9.0
        //ceil向上取整
        System.out.println(Math.ceil(3.14));//4.0 (double)
        //floor 向下取整
        System.out.println(Math.floor(3.14)); //3.0 (double)
        //round四色五入
        System.out.println(Math.round(8.53));//8
        //sqrt 求开放
        System.out.println(Math.sqrt(9));//3.0
        //random 0.0~1.0随机谁
        System.out.println(Math.random());
    }
}
