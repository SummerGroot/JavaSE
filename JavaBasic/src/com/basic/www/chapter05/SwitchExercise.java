package com.basic.www.chapter05;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-06 21:23
 */
public class SwitchExercise {
    public static void main(String[] args) {
        //m1();
        //m2();
        m3();
    }

    public static void m1() {
        //小写转换为大写
        //输入字符
        //创建canner对象
        Scanner scan = new Scanner(System.in);
        System.out.println("请出入字符：");
        char c1 = scan.next().charAt(0);
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
    }

    public static void m2() {
        //2、对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
        //（注：输入的成绩不能大于100），提示 成绩/60
        /*
         * 思路：
         * 1、如果成绩在[60，100]，(int)(成绩/60)=1
         * 2、如果成绩在[0,60)，(int)(成绩/60)=0*/
        //有待完善
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score = scan.nextInt();
        switch ((int) (score / 60)) {
            case 1:
                System.out.println("成绩合格");
                break;
            case 0:
                System.out.println("成绩不合格");
                break;
            default:
                System.out.println("您输入的成绩有误，请重新输入！！！");
                break;
        }
    }

    public static void m3() {
        //根据用于指定月份，打印该月份所属的季节。
        //3，4，5春季6，7，8夏季9，10，11秋季12，1，2冬季
        //创建scanner对象
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月份:");
        int Month = scan.nextInt();
        switch (Month) {
            case 3:
            case 4:
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
            case 12:
            case 1:
            case 2:
                System.out.println("这是冬季");
                break;
            default:
                System.out.println("您输入的月份有误，请检查");
        }
    }
}