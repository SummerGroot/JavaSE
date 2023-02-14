package com.basic.www.chapter08.extend_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-08 10:26
 */
//小学生->模拟小学生考试情况
public class Pupil {
    public String name;
    public int age;
    private double score;//成绩

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("小学生 " + name + "正在考试");
    }

    public void showInfo() {
        System.out.println("小学生 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
