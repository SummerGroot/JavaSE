package com.basic.www.chapter19.standard;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 15:25
 */
public class InputAndOutput {
    public static void main(String[] args) {
        //System类的 public final static InputStream in = null;
        //System.in编译类型InputStream
        //System.in运行类型BufferedInputStream
        //标准输入  键盘
        System.out.println(System.in);//java.io.BufferedInputStream@d716361
        //public final static PrintStream out = null;
        //System.out 编译类型  PrintStream
        //System.out 运行类型  PrintStream
        //标准输出 显示器
        System.out.println(System.out);//java.io.PrintStream@6ff3c5b5


        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容：");
        String next = scanner.next();
        System.out.println("next：" + next);

    }
}
