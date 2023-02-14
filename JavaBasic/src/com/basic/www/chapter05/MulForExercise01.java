package com.basic.www.chapter05;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-07 11:38
 */
public class MulForExercise01 {
    public static void main(String[] args) {
        //统计3个班成绩情况，每个班有5名同学，
        // 求出各个班的平均分和所有班级的平均分
        //成绩从键盘输入
        /*
         * 1、先计算一个班，5个学生的成绩，使用for
         * 1.1创建一个Scanner对象，接受用户输入
         * 1.2得到该班级的平均分，定义double count把5个学生成绩累计
         * 2、统计3个班平均分
         * 2.1定义一个变量，double totalScore累计所有学生成绩
         * 2.2当多重循环结束后，totalScore / (3*5)
         * 3、统计三个班及格人数
         * 3.1定义变量int passNum =0 ;当有学生成绩>=60，passNum++
         * 3.2如果>=60 passNum++*/

        Scanner input = new Scanner(System.in);
        double totalScore = 0;//累计所有学生成绩
        int passNum = 0;//累计 及格人数
        for (int i = 1; i <= 3; i++) {//i表示班级
            double count = 0;//当前班的总分
            for (int j = 1; j <= 5; j++) {//j表示学生
                System.out.println("请输入第" + i + "班，第" + j + "个学生的成绩");
                double score = input.nextDouble();
                //如果>=60 passNum++
                if (score >= 60) {
                    passNum++;
                }
                count += score;
                System.out.println("成绩为：" + score);
            }
            System.out.println("count=" + count + "平均分=" + (count / 5));
            //把count累计到totalScore
            totalScore += count;
        }
        System.out.println("三个班总分=" + totalScore + "平均分=" + totalScore / (3 * 5) + "及格人数=" + passNum);

    }
}
