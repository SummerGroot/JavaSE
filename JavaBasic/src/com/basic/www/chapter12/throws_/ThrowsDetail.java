package com.basic.www.chapter12.throws_;

import java.io.FileNotFoundException;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 13:15
 */
public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }

    public static void f2() /*throws ArithmeticException*/ {
        /*
         * 1、对于编译异常，程序中必须处理，比如`try-catch`或者`throws`。
         * 2、对于运行时异常，程序中如果没有抛出，默认就是`throws`的方式处理。
         *
         * 4、在`throws`过程中，如果有方法`try-catch`，
         * 就相当于处理异常，就可以不必`throws`。
         * */
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }

    public static void f1() /*throws FileNotFoundException */ {
        /*
         * f3()方法抛出的是一个编译异常
         * 这时，f1()必须处理这个编译异常*/
        try {
            f3();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void f3() throws FileNotFoundException {
        //FileInputStream fis = new FileInputStream();
    }

    public static void f4() {
        /*
         * f4()中调用f5()没问题
         * f5()抛出的是运行异常，有默认处理机制
         * java中并不要求程序员显示处理*/
        //f5();
    }
    //public static void f5() throws ArithmeticException  {}
}

class Father {
    //public void method() throws RuntimeException  {}
}

class Son extends Father {
    /*
     * 3、子类重写父类的方法时，对抛出异常的规定：
     * 子类重写的方法，所抛出的异常类型要么和父类抛出的异常一致，
     * 要么为父类抛出的异常的类型的子类型。*/
    //@Override
    //public void method() throws NullPointerException {}
}