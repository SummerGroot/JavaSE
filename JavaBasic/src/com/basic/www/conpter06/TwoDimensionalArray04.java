package com.basic.www.conpter06;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-01-19 22:27
 */
public class TwoDimensionalArray04 {
    public static void main(String[] args) {
        //int arr[][]={{4,6},{1,4,5,7},{-2}};
        // 遍历该二维数组，并得到和
        int arr[][]={{4,6},{1,4,5,7},{-2}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                sum += arr[i][j];//累加和
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
