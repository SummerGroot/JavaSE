package com.basic.www.chapter13.string_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 15:26
 */
public class String01 {
    public static void main(String[] args) {
        //String对象用于保存字符串，也就是一组字符序列
        //"姓名"是字符串常量，双引号括起的字符序列
        /*
        1. String s1 = new String();
        2. String s2 = new String(String original);
        3. String s3= new String(char[] a);
        4. String s4 = new String(char[] a,int shartindex,int count);*/
        //String 是final类，不能被继承。
        //String 有属性  private final char value[];  用于存放字符串
        //value是final类型，不可以修改（地址不能修改）,单个字符的内容可以变化
        String name = "姓名";
        name = "summer";
        final char[] value = {'a', 'b', 'c'};
        char[] v2 = {'a', 'r', 'a'};
        value[1] = 'o';
        //value = v2;
    }
}
