package com.basic.www.chapter07.homework;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-19 15:42
 */
public class HomeWork04 {
    public static void main(String[] args) {
        //编写A03类，实现数的复制功能copyArr，
        //输入旧数据，返回一个新数组,元素和旧数组一样。
        int arr[] = {1, 2, 3, 4, 5, 6};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}

class A03 {
    public int[] copyArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
