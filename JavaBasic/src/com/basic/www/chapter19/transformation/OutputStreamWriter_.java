package com.basic.www.chapter19.transformation;

import java.io.*;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 16:05
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        //FileOutputStream  字节流转成字符流 OutputStreamWriter
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\edu.txt";
        String charSet = "utf8";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("hi，夏天");
        osw.close();
        System.out.println("按照" + charSet + "保存文件成功！！");
    }
}
