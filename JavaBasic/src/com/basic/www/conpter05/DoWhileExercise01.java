package com.basic.www.conpter05;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-07 11:09
 */
public class DoWhileExercise01 {
    public static void main(String[] args) {
        //统计1-200之间能被5整除但不能被3整除的个数
        int i = 1;
        int num =0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                num++;
                System.out.println(i+"\t"+num);
            }
            i++;

        } while (i <= 200);
        System.out.println(num);
    }
}
