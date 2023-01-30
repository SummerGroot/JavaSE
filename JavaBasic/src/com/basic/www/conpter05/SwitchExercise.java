package com.basic.www.conpter05;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-06 21:23
 */
public class SwitchExercise {
    public static void main(String[] args) {
        //小写转换为大写
        //输入字符
        System.out.println("请出入字符：");
        Scanner scanner = new Scanner(System.in);
        char c1 = scanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println((char) (c1 - 32));
                break;
            case 'b':
                System.out.println((char) (c1 - 32));
                break;
            case 'c':
                System.out.println((char) (c1 - 32));
                break;
            case 'd':
                System.out.println((char) (c1 - 32));
                break;
            case 'e':
                System.out.println((char) (c1 - 32));
                break;
            default:
                System.out.println("other");
        }
        //2、对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
        //（注：输入的成绩不能大于100），提示 成绩/60
        /*
         * 思路：
         * 1、如果成绩在[60，100]，(int)(成绩/60)=1
         * 2、如果成绩在[0,60)，(int)(成绩/60)=0*/
        double score = 88.5;
        switch ((int) (score / 60)) {
            case 0:
                System.out.println("不及格");
            case 1:
                System.out.println("及格");
        }
    }

}
