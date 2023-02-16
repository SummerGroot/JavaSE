package com.basic.www.chapter03.string_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 21:18
 */
public class String_01 {
    public static void main(String[] args) {
        //String类的substring方法可以从一个较大的字符串提取一个子串.
        String str = "Hello World";
        //substring方法第二个参数是不想复制的第一个位置。
        //计算字串的长度：字符串str.substring(a,b);的长度位b-a。
        String s = str.substring(0,3);//从0位开始取3位
        System.out.println(s);//Hel
    }
}
