package com.basic.www.chapter19.printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 16:14
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        //字节打印流
        PrintStream out = System.out;
        //在默认情况下，PrintStream输出数据的位置是标准输出，即显示器
        out.print("join,hello");
        /*public void print(String s) {
            if (s == null) {
                s = "null";
            }
            write(s);
        }*/
        //因为print底层是write，所有可以直接调用write进行输出
        out.write("夏天来了".getBytes());
        //修改打印流输出的位置
        //修改到文件中G:\Notes\Java\JavaNotes\file_\test.txt
        System.setOut(new PrintStream("G:\\Notes\\Java\\JavaNotes\\file_\\test.txt"));
        System.out.println("夏天天气开始热了");
        out.close();
    }
}
