package com.basic.www.chapter13.system_;

import java.util.Arrays;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 8:48
 */
public class System01 {
    public static void main(String[] args) {
        //exit 退出当前程序
        System.out.println("ok1");
        /*
         * 1、exit（0）表示程序退出
         * 2、0表示一个状态，正常的状态*/
        // System.exit(0);
        System.out.println("ok2");

        int[] src = {1, 2, 3, 4, 5, 6, 7};
        int[] dest = new int[7];//dest 当前是{0,0,0,0,0,0,0}
        /*
         * 1、这5个参数的含义
         * 源数组
         *  @param src the source array.
         *  srcPos： 从源数组的哪个索引位置开始拷贝
         * @param srcPos starting position in the source array.
         *  dest : 目标数组，即把源数组的数据拷贝到哪个数组
         * @param dest the destination array.
         * destPos: 把源数组的数据拷贝到 目标数组的哪个索引
         * @param destPos starting position in the destination data.
         *  length: 从源数组拷贝多少个数据到目标数组
         * @param length the number of array elements to be copie*/
        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.println("dest=" + Arrays.toString(dest));
    }
}
