package com.basic.www.chapter12.exception_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 15:57
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        /*
         * 1、num1 / num2===>10/0
         * 2、当执行到num1 / num2 因为num2 =0 程序就会抛出异常 ArithmeticException
         * 3、当抛出异常，程序就会崩溃。下面的代码就不再执行了*/
        /*int res = num1 / num2;
        System.out.println("程序继续....");*/
        //可以使用try-catch异常处理机制来解决
        //将代码块选中，输入快捷键 ctrl+alt+t->try-catch
        //如果进行了异常处理，即使出现了异常，程序可以继续执行。
        try {
            int res = num1 / num2;
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());//输出异常信息
        }
        System.out.println("程序继续....");
    }
}
