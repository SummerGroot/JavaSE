package com.basic.www.chapter06;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 15:14
 */
public class ArrayExercise02 {
    public static void main(String[] args) {
//2、请求出一个和数组int[]的最大值{4,-1,9,10,23}，
// 并得到对应的下标
        //定义一个数组
        int[] arr = {4, -1, 9, 10, 23};
        //临时存放变量
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {//遍历
            if (max < arr[i]) {//如果max<当前元素
                max = arr[i];//把max设置成当前元素
                maxIndex = i;
            }
        }
        System.out.println("最大值为：" + max + "最大值的下标为：" + maxIndex);

    }
}
