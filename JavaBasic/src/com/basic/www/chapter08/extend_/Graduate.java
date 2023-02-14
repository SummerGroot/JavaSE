package com.basic.www.chapter08.extend_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-08 10:29
 */
//大学生->模拟大学生考试情况
public class Graduate {
    public String name;
    public int age;
    private double score;//成绩

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("大学生 " + name + "正在考试");
    }

    public void showInfo() {
        System.out.println("大学生 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}

