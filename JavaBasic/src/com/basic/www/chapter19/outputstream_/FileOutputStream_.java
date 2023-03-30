package com.basic.www.chapter19.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-03-23 16:15
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }
    @Test
    /*
    * 使用FileOutputStream将数据写到文件中
    * 如果文件不存在，则创建该文件*/
    public void writeFile(){
        //创建FileOutputStream对象
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到FileOutputStream对象
            /*
            * 1、new FileOutputStream(filePath)创建方式，写入内容是覆盖
            * 2、new FileOutputStream(filePath,true)创建方式，当写入内容是追加，不是覆盖*/
            fileOutputStream = new FileOutputStream(filePath,true);
            //写入一个字节
            //fileOutputStream.write('F');//char自动转成int
            //写入字符串
            String str = "hello,word!";
            //str.getBytes()可以把 字符串--->字节数组
            //fileOutputStream.write(str.getBytes());
            //write(byte[] b,  int off, int len) 将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。
            fileOutputStream.write(str.getBytes(),0,3);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
