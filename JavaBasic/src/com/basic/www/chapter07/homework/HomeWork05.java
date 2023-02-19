package com.basic.www.chapter07.homework;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-19 15:42
 */
public class HomeWork05 {
    public static void main(String[] args) {
        //定义一个圆类Circle，定义属性：半径，
        //提供显示圆周长功能的方法，
        //提供显示圆面积的方法。
        Circle circle = new Circle();
        circle.setRadius(9.9);
        System.out.println("圆形的周长为=" + circle.getWidth());
        System.out.println("圆形的面积为=" + circle.getArea());
    }
}

class Circle {
    private double radius ;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWidth(/*double radius*/) {
        return 2 * Math.PI * radius;
    }

    public double getArea(/*double radius*/) {
        return Math.PI * radius * radius;
    }
}
