package com.basic.www.chapter19.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-03-23 15:40
 */
public class FileInputStream_ {
    public static void main(String[] args) {
        //字节输入流，文件---->程序
    }


    /*
    * read（）单个字节的读取，效率比较低
    * 使用read(byte[] b)优化
    * */
    @Test
    public void readFile01() {
        String FilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\hello.txt";//要读取文件的路径
        int readData = 0;
        //扩大字符流的作用域
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，读取文件
            fileInputStream = new FileInputStream(FilePath);
            //从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止
            //如果返回-1 表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char)readData);//转成char类型
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();//捕获异常
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //使用read(byte[] b)优化
    @Test
    public void readFile02() {
        String FilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\hello.txt";//要读取文件的路径
        int readData = 0;
        //定义字节数组
        byte[] buf = new byte[8];//一次读取8个字节
        int readLengeh = 0;
        //扩大字符流的作用域
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，读取文件
            fileInputStream = new FileInputStream(FilePath);
            //从该输入流读取最多b.length字节的数据到字节数组。 此方法将阻塞，直到某些输入可用。
            //如果返回-1，表示读取完毕
            //如果读取正常，返回实际读取的字节数
            while ((readLengeh=fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf,0,readLengeh));//显示
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();//捕获异常
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
