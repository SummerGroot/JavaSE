package com.basic.www.chapter19.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 16:14
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("G:\\Notes\\Java\\JavaNotes\\file_\\f1.txt"));
        printWriter.print("hi,成都");
        printWriter.close();//flush+关闭流，才会将数据写入到文件
    }
}

