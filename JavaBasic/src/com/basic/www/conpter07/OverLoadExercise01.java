package com.basic.www.conpter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-02 10:06
 */
public class OverLoadExercise01 {
    public static void main(String[] args) {
        Methods mt = new Methods();
        mt.m(2);
        mt.m(4, 90);
        mt.m("summer");
        System.out.println("最大值为：" + mt.max(4, 5, 6));
    }
}


class Methods {
    /*
     * 编写程序，类Methods中定义三个重载方法并调用。方法名为m。
     * 三个方法分别接收一个int参数、两个int参数，一个字符串阐述。
     * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
     * 在主类main（）方法中分别用参数区别调用三个方法。*/
    public void m(int n) {
        System.out.println(n + "的平方=" + (n * n));
    }

    public void m(int n1, int n2) {
        System.out.println(n1 + "x" + n2 + "的结果=" + (n1 * n2));
    }

    public void m(String str) {
        System.out.println("传入的字符串为：" + str);
    }

    /*
     * 在Mthods类，定义三个重载方法max（）。
     * 第一个方法，返回两个int值中的最大值
     * 第二个方法，返回两个double值中的最大值。
     * 第三个方法，返回三个double值中的最大值，并分别调用三个方法
     * */
    public int max(int a, int b) {
        /*if (a < b) {
            return a;
        }else {
            return b;
        }*/
        return a > b ? a : b;
    }

    public double max(double a, double b) {
        /*if (a < b) {
            return a;
        }else {
            return b;
        }*/
        return a > b ? a : b;
    }

    public double max(double a, double b, double c) {
        double max = a > b ? a : b;
        return max > c ? max : c;
    }
}