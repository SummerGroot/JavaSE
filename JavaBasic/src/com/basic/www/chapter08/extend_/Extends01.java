package com.basic.www.chapter08.extend_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-08 10:25
 */
public class Extends01 {
    public static void main(String[] args) {
        Pupil p1 = new Pupil();
        p1.name = "james";
        p1.age = 8;
        p1.testing();
        p1.setScore(80);
        p1.showInfo();

        Graduate g1 = new Graduate();
        g1.name = "summer";
        g1.age=18;
        g1.testing();
        g1.setScore(89);
        g1.showInfo();

    }
}

