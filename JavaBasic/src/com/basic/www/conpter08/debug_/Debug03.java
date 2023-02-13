package com.basic.www.conpter08.debug_;

import java.util.Arrays;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-13 16:47
 */
public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 99, 45, -66};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
