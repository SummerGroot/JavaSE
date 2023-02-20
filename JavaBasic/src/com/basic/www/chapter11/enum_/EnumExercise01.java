package com.basic.www.chapter11.enum_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 13:23
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;
        Gender2 boy2 = Gender2.BOY;
        System.out.println(boy);//BOY
        System.out.println(boy2==boy);//true

    }
}


enum Gender2 {
    BOY, GIRL;
}