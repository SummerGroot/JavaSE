package com.basic.www.chapter19.outputstream_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-03-23 16:32
 */
public class FileCopy_ {
    public static void main(String[] args) {
        //文件拷贝
        //G:\Notes\Java\JavaNotes\file_\demo01\a.jpg  拷贝到 G:\Notes\Java\JavaNotes\file_\demo02
        /*
         * 分析
         * 1、创建文件的输入流，将文件读入到程序
         * 2、创建文件的输出流，将读取到的文件数据，写入到指定的文件。
         * 3、读取部分数据，就写入到只当文件，这里使用循环
         * */
        String srcFilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo01\\a.jpg";//创建源文件路径
        String destFilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo02\\b.jpg";//创建目标文件路径
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            //定义一个字节数组，提高读取效率
            byte[] buf = new byte[1024];
            int readlen = 0;
            while ((readlen = fileInputStream.read(buf)) != -1) {
                //读取到后，就写入到文件，通过fileOutputStream
                //一边读，一边写
                fileOutputStream.write(buf, 0, readlen);//一定要使用这个方法
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                //关闭输出、输入流
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
