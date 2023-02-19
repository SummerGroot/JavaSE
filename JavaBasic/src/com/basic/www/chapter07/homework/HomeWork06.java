package com.basic.www.chapter07.homework;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-19 15:43
 */
public class HomeWork06 {
    public static void main(String[] args) {
        //创建Cale计算类，在其中定义2个变量表示两个操作数，
        //定义四个方法实现和、差、乘、积（要求除数为0，要提示）并创建两个对象，分别测试。
        Cale cale = new Cale();
        cale.setN1(2);
        cale.setN2(3);
        System.out.println(cale.add());
    }
}

class Cale {
    private double n1;
    private double n2;

    public double add() {
        return n1 + n2;
    }

    public double sub() {
        return n1 - n2;
    }

    public double mul() {
        return n1 * n2;
    }

    public double div() {
        if (n1 == 0) {
            System.out.println("除数不能为0");
        }
        return n1 / n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
}