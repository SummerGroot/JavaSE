package com.basic.www.chapter12.exception_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 17:37
 */
public class ArrayIndexOutOfBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i </*=*/ arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
