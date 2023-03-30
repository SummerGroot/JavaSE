package com.basic.www.chapter19.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-03-30 15:24
 */
public class BuffereadWriter_ {
    public static void main(String[] args) {
        //文件地址
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\hello01.txt";
        BufferedWriter bufferedWriter = null;
        //创建一个BufferedWriter对象
        try {
            /*
             * 1、new FileWriter(filePath,true)以追加的方式写入
             * 2、new FileWriter(filePath)表示覆盖的方式写入*/
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            //写文件
            String line;
            bufferedWriter.write("hello,world!!!");
            //插入一个和系统相关的换行
            bufferedWriter.newLine();
            bufferedWriter.write("hello1,world!!!");
            bufferedWriter.newLine();
            bufferedWriter.write("hello2,world!!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                //关闭流
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
