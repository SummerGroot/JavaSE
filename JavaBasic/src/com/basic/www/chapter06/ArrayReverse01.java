package com.basic.www.chapter06;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 16:35
 */
public class ArrayReverse01 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {11, 22, 33, 44, 55, 66};
        /*
        * 1、把arr[0]和arr[5]交换{66,22,33,44,55,11}
        * 2、把arr[1]和arr[4]交换{66,55,33,44,22,11}
        * 3、把arr[1]和arr[4]交换{66,55,44,33,22,11}
        * 4、一共交换3次  =arr.length/2
          5、每次交换时，对应的下标是arr[i]和arr[arr.length-1-i]
         */
        int temp = 0;
        int len = arr.length;//计算数组的长度
        for (int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i];//保存
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println("=====反转后的数组=======");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+"\t");//66	55	44	33	22	11
        }
    }
}
