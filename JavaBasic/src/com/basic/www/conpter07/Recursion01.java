package com.basic.www.conpter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-01 10:26
 */
public class Recursion01 {
    public static void main(String[] args) {
        T t1 = new T();
        //t1.test(4);
        int res = t1.factorial(5);
        System.out.println("res="+res);
    }
}

class T {
    public void test(int n) {
        //打印问题
        if (n > 2) {
            test(n - 1);
        } else {
            System.out.println("n=" + n);
        }
        //System.out.println("n=" + n);
    }

    public int factorial(int n) {
        //阶乘问题
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}