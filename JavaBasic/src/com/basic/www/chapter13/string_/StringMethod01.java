package com.basic.www.chapter13.string_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 11:00
 */
public class StringMethod01 {
    public static void main(String[] args) {
        //equalsignorecase() 忽略大小写的判断内容是否相等
        if ("join".equalsIgnoreCase("JOIN")) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }
        //length() 获取字符的个数，字符串的长度
        System.out.println("夏源edu".length());//5
        //indexOf()获取字符在字符串对象中第一次出现的索引，索引从0开始，如果找不到，返回-1
        String str1 = "wer@terwe@g";
        int index = str1.indexOf("@");
        System.out.println(index);//3
        //lastIndexOf()获取字符在字符串对象中最后一次出现的索引，索引从0开始，如果找不到，返回-1.
        String str2 = "wer@terwe@g@";
        int index2 = str2.lastIndexOf("@");
        System.out.println(index2);//11
        //substring 截取指定范围的子集
        String str3 = "wer@terwe@g";
        //从索引3开始截取后面所有的字符
        System.out.println(str3.substring(3));//@terwe@g
        //从索引0开始截取，截取到(5-1)个字符
        System.out.println(str3.substring(0, 3));//wer
    }
}
