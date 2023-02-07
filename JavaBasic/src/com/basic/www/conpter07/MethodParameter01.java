package com.basic.www.conpter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-01-31 11:30
 */
public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //创建对象a3
        AA3 a3 = new AA3();
        a3.swap(a, b);//调用swap
        System.out.println("a=" + a + "\tb=" + b);
    }
}

class AA3 {
    public void swap(int a, int b) {
        System.out.println("a和b交换前a=" + a + "b=" + b);
        //a和b交换
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a=" + a + "\tb=" + b);
    }
}