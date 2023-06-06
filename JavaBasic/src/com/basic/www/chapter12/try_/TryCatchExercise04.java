package com.basic.www.chapter12.try_;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 12:54
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
//如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止。
        /*
         * 1、创建Scanner对象
         * 2、无限循环，去接收一个输入
         * 3、然后将该输入的值，转成一个int
         * 4、如果在转换时，抛出异常，说明输入的内容不是一个可以转成int的内容
         * 5、如果没有抛出异常，则break*/
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {
            System.out.println("请输入一个整数:");
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr);//这里可能抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入不是一个整数！！");
            }
        }
        System.out.println("你输入的值是：" + num);
    }
    @Test
    public void f1(){
        String name = null;
        System.out.println(name.length());
    }
}
