package com.basic.www.chapter06;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 15:14
 */
public class ArrayExercise03 {
    public static void main(String[] args) {
        //3、请求出一个数组的和，和平均值
        int[] arr1 = {2, 4, 6, 8, 10, 12};
        //累加
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("最大值为：" + sum + "平均值为：" + (sum / arr1.length));
    }
}
