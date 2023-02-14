package com.basic.www.chapter06;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 16:23
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1={10,20,30};
        //创建一个新的数组arr2，开辟新的数据空间
        int[] arr2=new int[arr1.length];
        //遍历arr1，把每个元素拷贝到对应的位置
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
        arr2[0]=100;
        System.out.println("=====arr2======");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("=====arr1======");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
