package com.basic.www.chapter12.exception_;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-17 12:28
 */
public class ArithmaticException {
    public static void main(String[] args) {
        String name = "summer";
        //将String转换成int
        int i = Integer.parseInt(name);
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "summer"
        System.out.println(i);
    }
}
