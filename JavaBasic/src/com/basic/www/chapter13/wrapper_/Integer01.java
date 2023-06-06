package com.basic.www.chapter13.wrapper_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 14:10
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示int<-->Integer 的装箱和拆箱
        /*jdk5之前手动装箱int->Integer*/
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        /*
        public static Integer valueOf(int i) {
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }
        */
        //手动拆箱
        //Integer->int
        int i = integer.intValue();
        /*
        public int intValue() {
            return value;
        }
        */
        //jdk5后，就可以自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱 int->Integer
        Integer integer2 = n2;
        //底层使用的是Integer.valueOf(n2)
        //自动拆箱Integer->int
        int n3 = integer2;
        //底层使用的是intValue()方法
    }
}
