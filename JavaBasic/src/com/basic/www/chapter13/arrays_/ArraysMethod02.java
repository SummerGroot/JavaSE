package com.basic.www.chapter13.arrays_;

import java.util.Arrays;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 18:32
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        //binarySearch通过二分搜索法进行查找
        /*
         * 1、使用binarySearch 二叉查找
         * 2、要求数组时有序的，如果该数组时无序的，不能使用
         * 3、数组中不存在该元素，则返回-1*/
        System.out.println(Arrays.binarySearch(arr, 2));//1
        //copyOf
        /*
         * 1、从arr数组中拷贝arr.length这么多个到newArr数组中
         * 多的位置为0
         * 少则拷贝前部分
         * 如果拷贝长度<0就抛出异常  NegativeArraySizeException*/
        Integer[] newArr = Arrays.copyOf(arr, arr.length - 2);
        System.out.println("=====拷贝完后=====");
        System.out.println(Arrays.toString(newArr));
        //fill

    }
}
