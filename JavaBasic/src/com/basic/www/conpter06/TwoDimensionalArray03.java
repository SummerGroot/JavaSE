package com.basic.www.conpter06;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-28 12:54
 */
public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        /* i=0:1
         * i=1:2 2
         * i=2:3 3 3
         * */
        //一个有三个一维数组，每一个数组的元素是不一样的
        int[][] arr = new int[3][];//创建 二维数组，但是只是确定一维数组的个数
        for (int i = 0; i < arr.length; i++) {//遍历arr每个一维数组
            //给每个一维数组开空间new
            //如果没有给一维数组new，那么arr[i]就是null
            arr[i] = new int[i + 1];

            //遍历一维数组，并给一维数组的每个元素赋值。
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;//赋值
            }
        }

        System.out.println("=====arr的元素情况=======");

        //遍历arr输出
        for (int i = 0; i < arr.length; i++) {
            //输出arr的每个一维数组
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
