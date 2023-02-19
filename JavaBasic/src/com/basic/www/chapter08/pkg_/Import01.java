package com.basic.www.chapter08.pkg_;
/*
 * 我们需要使用到哪个类，就导入哪个类，不建议使用*导入
 * import java.util.Scanner 表示只会导入java.util包下的Scanner
 * import java.util.* 表示将java.util 包下的所有类都导入
 * */
import java.util.Arrays;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-07 14:58
 */
public class Import01 {
    public static void main(String[] args) {
        //使用系统提供Arrays完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        //比如对其排序
        //传统方法，自己编写排序（冒泡）
        //系统是提供了相关的类，可以方便完成
        Arrays.sort(arr);
        //输出排序结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
