package com.basic.www.chapter12.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 13:06
 */
public class Throws01 {
    public static void main(String[] args) {
        //
    }

    public void f1() throws FileNotFoundException,NullPointerException {
        //创建一个文件流对象
        /*
         * 这里的异常是一个FileNotFoundException编译异常
         * 使用try-catch
         * throws，抛出异常,让调用f1方法的调用者（方法）处理
         * throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类
         * throws关键字后也可以是 异常列表，可以抛出多个异常*/
        FileInputStream fileInputStream = new FileInputStream("dsadsa");
    }
}
