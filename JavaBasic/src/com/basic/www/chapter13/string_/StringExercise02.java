package com.basic.www.chapter13.string_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 9:52
 */
public class StringExercise02 {
    public static void main(String[] args) {
        String a = "edu";//指向常量池的"edu"
        String b = new String("edu");//b指向堆中对象
        System.out.println(a.equals(b));//true
        System.out.println(a==b);//false
        //intern()  返回是常量池的地址
        //如果常量池中以存在"edu" ，则返回来自池的字符串。
        //否则，此String对象将添加到池中，并返回对此String对象的引用.
        System.out.println(a==b.intern());//true
        System.out.println(b==b.intern());//false
    }
}
