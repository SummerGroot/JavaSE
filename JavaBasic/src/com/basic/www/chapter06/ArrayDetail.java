package com.basic.www.chapter06;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 15:01
 */
public class ArrayDetail {
    public static void main(String[] args) {
        //数组是多个相同类型数据的组合，实现对这些数据的统一管理
        int[] arr1 = {1, 2, 3, 60};
        //int[] arr2 = {1, 2, 3, 60.1.1};//double->int
        //数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。
        String[] arr3={"成都","summer","avenger"};
        //数组创建后，如果没有赋值，有默认值
        short[] arr4=new short[3];
        System.out.println("=====数组arr4======");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        //数组下标必须在指定范围内使用，否则报：下标越界异常
        int[] arr5 = new int[5];
        //System.out.println(arr5[5]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        //	at com.basic.www.conpter04.ArrayDetail.main(ArrayDetail.java:24)
        //数组的下标 最小=0，最大=数组长度-1(4)
    }
}
