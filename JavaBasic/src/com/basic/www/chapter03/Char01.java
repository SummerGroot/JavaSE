package com.basic.www.chapter03;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 19:52
 */
public class Char01 {
    //演示char的基本使用
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '夏';
        char c4 = 97;
        char c5 = '\u0000';
        //复制快捷键 ctrl+d
        //
        System.out.println(c1);//a
        System.out.println(c2);//制表位
        System.out.println(c3);//夏
        System.out.println(c4);//输出c4时候，会输出97表示的字符 a
        System.out.println(c5);
    }
}
