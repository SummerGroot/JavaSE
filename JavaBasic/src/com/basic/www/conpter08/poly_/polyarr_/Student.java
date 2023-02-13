package com.basic.www.conpter08.poly_.polyarr_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-10 11:22
 */
public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //重写父类say方法
    @Override
    public String say() {
        return super.say() + " score=" + score;
    }

    public void study() {
        System.out.println("学生：" + getName() + "正在学java");
    }
}
