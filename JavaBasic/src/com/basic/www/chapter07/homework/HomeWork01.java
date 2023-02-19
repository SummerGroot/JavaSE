package com.basic.www.chapter07.homework;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-19 15:24
 */
public class HomeWork01 {
    public static void main(String[] args) {
        //编写A01类，定义方法max，实现求某个double数组的最大值，并返回。
        double[] arr = {2.9, 1.3, 0.4, 4.5};
        A01 a01 = new A01();
        System.out.println(a01.max(arr));
    }
}

class A01 {
    public double max(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                max = arr[i];//数大的给max
            }
        }
        return max;
    }
}
