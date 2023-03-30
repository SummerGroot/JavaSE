package com.basic.www.chapter19.buffered_;

import java.io.*;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-03-30 15:40
 */
public class BufferedCopy_ {
    public static void main(String[] args) {
        /*
        * 1、BufferedReader和BufferedWriter是按照字符操作
        * 2、不要操作二进制文件，可能会造成文件损坏*/
        //源文件地址
        String srcFilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo01\\b.txt";
        //目的文件地址
        String destFilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo02\\b.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            //读取，readline 读取一行内容，没有换行
            while ((line = br.readLine()) != null) {
                //每读取一行就写入
                bw.write(line);
                //插入换行
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
