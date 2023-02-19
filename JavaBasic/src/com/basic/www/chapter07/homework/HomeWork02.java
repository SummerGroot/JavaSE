package com.basic.www.chapter07.homework;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-19 15:30
 */
public class HomeWork02 {
    public static void main(String[] args) {
        //编写A02类，定义方法find，
        //实现查找某字符串是否在字符串数组中，并返回索引，
        //如果找不到，返回-1.
        String[] arr = {"summer", "james", "夏源", "火锅", "num"};
        A02 a02 = new A02();
        System.out.println(a02.find(arr));
    }
}

class A02 {
    public int find(String[] arr) {
        int index = -1;
        String str = "nu";
        for (int i = 0; i < arr.length; i++) {
            if (str == arr[i]) {
                index = i;
                //return index;
            }
        }
        return index;
    }
}
