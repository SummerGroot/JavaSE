package com.basic.www.chapter08.override_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-09 11:47
 */
/*
 * 继承Person类，增加id、score属性/private，以及构造器，
 * 定义say方法（返回自我介绍的信息）
 * */
public class Student extends Person {
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);//自动调用父类构造器
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //say方法
    public String say() {//体现super的好处
        return super.say() + " id=" + id + " score=" + score;
    }
}
