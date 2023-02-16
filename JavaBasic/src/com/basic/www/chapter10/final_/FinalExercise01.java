package com.basic.www.chapter10.final_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 11:04
 */
public class FinalExercise01 {
    public static void main(String[] args) {
        //能够求圆形的面积。要求圆周率为3.14,赋值的位置3个方式都写
        Circle circle = new Circle(5.0);
        System.out.println(circle.getArea());
    }
}

class Circle {
    private double radius;
    private final double PI = 3.14;

    //构造器
    public Circle(double radius) {
        this.radius = radius;
        //PI = 3.14;
    }

    {
        //PI = 3.14;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
