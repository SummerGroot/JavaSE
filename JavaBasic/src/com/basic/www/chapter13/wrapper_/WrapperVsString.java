package com.basic.www.chapter13.wrapper_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 14:25
 */
public class WrapperVsString {
    public static void main(String[] args) {
        //包装类(Integer)-->String
        Integer i = 100;//自动装箱
        //方式1
        String str1 = i + "";//100+"="100"
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);
        //String-->Integer
        String str4 = "12345";
        //方式1
        Integer i1 = Integer.parseInt(str4);
        //使用自动装箱
        Integer i2 = new Integer(str4);//构造器
    }
}
