package com.basic.www.conpter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-02 9:49
 */
public class OverLoad01 {
    public static void main(String[] args) {
        /*System.out.println(100);
        System.out.println("helloworld");
        System.out.println('h');
        System.out.println(1.1);
        System.out.println(true);*/
        MyCalculator mc = new MyCalculator();
        System.out.println(mc.calculate(1,2));
        System.out.println(mc.calculate(1.1,3));
        System.out.println(mc.calculate(3,5.3));
        System.out.println(mc.calculate(2,3,4));
    }
}

class MyCalculator {
    //下面的四个，calculate方法构成了重载
    //两个整数的和
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }
    //一个整数，一个double的和
    public double calculate(int n1, double n2) {
        return n1 + n2;
    }
    //一个double，一个整数的和
    public double calculate(double n1, int n2) {
        return n1 + n2;
    }
    //3个int的和
    public int calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
