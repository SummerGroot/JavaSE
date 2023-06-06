package com.basic.www.chapter13.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 18:00
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 20};
        // bubbleSort01(arr);
        bubbleSort02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                //return i1 - i2;
                return i2 - i1;
            }
        });
        System.out.println("排序后的情况");
        System.out.println(Arrays.toString(arr));

    }

    //使用冒泡完成排序
    public static void bubbleSort01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //从小到大
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //集合冒泡+定制
    public static void bubbleSort02(int[] arr, Comparator c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //数组的排序由c.compare(arr[j], arr[j + 1])返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
