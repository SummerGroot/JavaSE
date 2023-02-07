package com.basic.www.conpter03;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-11-23 16:23
 */
public class ForceConvertDetail {
    public static void main(StringToBasicDetail[] args) {
        //int x =(int10*3.5+6*1.5;//double->int
        int x = (int) (10 * 3.5 + 6 * 1.5);
        System.out.println(x);
        char c1 = 100;//ok
        int m = 100;//ok
        //char c2 = m;//错误
        char c2 = (char) m;
        System.out.println(c2);




    }
}
