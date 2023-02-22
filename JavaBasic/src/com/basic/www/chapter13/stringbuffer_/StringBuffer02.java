package com.basic.www.chapter13.stringbuffer_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 14:21
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        //构造器使用
        /*
         * 1、 创建一个大小为16的char[] ，用于存放字符内容*/
        StringBuffer sb = new StringBuffer();

        //通过构造器指定char[] 大小
        StringBuffer sb2 = new StringBuffer(100);
        //通过给一个String创建Stringbuffer
        //str.length() + 16 把传入的字符长度加上16传给capacity
        StringBuffer sb3 = new StringBuffer("hello");
    }
}
