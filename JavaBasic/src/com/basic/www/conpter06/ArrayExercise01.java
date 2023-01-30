package com.basic.www.conpter06;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 15:14
 */
public class ArrayExercise01 {
    public static void main(String[] args) {
        //1、创建一个char类型的26个元素的数组，
        // 分别放置'A'-'Z'。使用for循环访问所有元素并打印出来。
        char[] arr1=new char[26];
        char c='A';
        for (int i = 0; i <arr1.length; i++){
            arr1[i]=c;
            c++;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }
}