package com.basic.www.conpter04;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-11-25 23:18
 */
public class AssignOperator {
    public static void main(String[] args) {
        //1、赋值基本案例 int num1 = 10;
        //2、+=的使用案例
        int num1 = 10;
        num1 += 4;//num1=num1+4;
        System.out.println(num1);//14
        num1 /= 3;
        System.out.println(num1);//4
        //复合赋值运算符会进行类型转换。
        byte b=3;
        b+=2;//b=(byte)(b+2);
        b++;//b=(byte)(b+1);
        System.out.println(b);
    }
}
