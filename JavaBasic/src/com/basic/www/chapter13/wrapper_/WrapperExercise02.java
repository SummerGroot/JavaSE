package com.basic.www.chapter13.wrapper_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 14:39
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        method01();
    }

    public static void method01() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false 不是同一个对象
        /*
        public static Integer valueOf(int i) {
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }
        */
        //这里主要看范围-128~127就是直接返回
        //如果不在-128~127就创建数组
        Integer m = 1;//底层 Integer.valueOf(1);--->看源码
        Integer n = 1;//底层 Integer.valueOf(1);
        System.out.println(m == n);//true
        //这里主要看范围-128~127就是直接返回
        //否则就new 一个Integer(xx);
        Integer x = 128;//底层 Integer.valueOf(1);
        Integer y = 128;
        System.out.println(x == y);//F
    }
}
