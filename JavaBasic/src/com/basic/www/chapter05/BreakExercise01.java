package com.basic.www.chapter05;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-09 14:39
 */
public class BreakExercise01 {
    public static void main(String[] args) {
        //1-100内的数求和，求出当和第一次大于20的当前数（for+break）
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum+=i;
            if(sum>20){
                System.out.println("当前数为："+i);
                break;//和第一次大于20就跳出当前循环
            }
        }
    }
}
