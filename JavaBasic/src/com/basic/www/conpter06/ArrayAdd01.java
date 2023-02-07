package com.basic.www.conpter06;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-26 11:55
 */
public class ArrayAdd01 {
    public static void main(String[] args) {
        //定义一个数组。有效下标0~2
        int[] arr = {1, 2, 3};
        //定义一个新的数组
        int[] arrNew = new int[arr.length + 1];
        //遍历arr数组，依次将arr的元素拷贝到arrNew数组
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        //将4赋值给arrNew[arrNew.lenght-1]
        arrNew[arrNew.length - 1] = 4;
        arr = arrNew;
        System.out.println("===arr扩容后=====");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
