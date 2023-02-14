package com.basic.www.chapter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-02 10:43
 */
public class VarParameterExercise {
    public static void main(String[] args) {
        HepMethod01 hm = new HepMethod01();
        System.out.println(hm.showScore("summer" ,98.7,95.2));
    }
}

/*
 * 有三个方法：
 * 分别实现返回姓名和两门课成绩（总分），
 * 返回姓名和三门课成绩（总分）
 * 返回姓名和五门课成绩（总分）。封装成一个可变参数的方法*/
class HepMethod01 {
    //方法名：showScore，形参（String，double...）,返回String
    public String showScore(String name, double... score) {
        double totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        return name + "的总分为：" + totalScore;
    }

   /* public void showScore() {

    }

    public void showScore() {

    }*/
}
