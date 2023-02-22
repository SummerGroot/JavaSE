package com.basic.www.chapter13.string_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 10:04
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String s1 = "xyedu";//常量池中
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s2 == s3);//F
        System.out.println(s2 == s4);//T
        System.out.println(s2.equals(s3));//T
        System.out.println(s1 == s2);//F
    }
}
