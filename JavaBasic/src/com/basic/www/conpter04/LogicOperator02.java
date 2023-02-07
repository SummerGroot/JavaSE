package com.basic.www.conpter04;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-11-25 22:05
 */
public class LogicOperator02 {
    public static void main(String[] args) {
        /*
         * ||短路或
         * |逻辑或
         * */
        int age = 50;
        if (age > 20 || ++age < 30) {
            System.out.println("age1="+age);
        }
        if (age > 20 | ++age < 30) {
            System.out.println("age2="+age);
        }
    }
}
