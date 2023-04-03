package com.basic.www.chapter19.transformation;

import java.io.*;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 15:58
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        //将字节流转成字符流
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\a.txt";
        /*
         * 1、把FileInputStream转成InputStreamReader
         * 2、指定编码gbk*/
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        //把InputStreamReader传入BufferReader
        BufferedReader br = new BufferedReader(isr);
        //上面两句合并
        /*BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath),"gbk"));*/
        //读取
        String s = br.readLine();
        System.out.println("读取内容：" + s);
        //关闭外层流
        br.close();
    }
}
