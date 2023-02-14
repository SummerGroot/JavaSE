package com.basic.www.chapter05;
import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-16 10:32
 */
public class HomeWork02 {
    public static void main(String[] args) {
        //2、实现判断一个整数，属于哪个范围：大于0；小于0；等于0
        Scanner scanner = new Scanner(System.in);
        //输入一个整数
        System.out.println("请输入整数:");
        //接收整数
        int i = scanner.nextInt();
        //判断
        if(i<0){
            System.out.println(i+"该整数小于0");
        } else if (i==0) {
            System.out.println(i+"该整数等于0");
        }else {
            System.out.println(i+"该整数大于0");
        }
    }
}
