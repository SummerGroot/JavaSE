package com.basic.www.chapter19.buffered_;

import java.io.*;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-03-30 16:08
 */
public class BufferedCopyByte_ {
    public static void main(String[] args) {
        //可以完成二进制文件拷贝
        //源地址
        //String srcFilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo01\\b.jpg";
        //String srcFilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo01\\c.flv"";
        String srcFilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo01\\b.txt";
        //目的地址
        //String destFilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo02\\b.jpg";
        //String destFilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo02\\c.flv";
        String destFilePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo02\\d.txt";
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //创建BufferedInputStream/BufferedOutputStream对象
        try {
            //FileInputStream是InputStream的子类
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
            //读文件并写入
            byte[] buff = new byte[1024];
            int readLen = 0;
            //当返回-1，就表示文件读取完成
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff, 0, readLen);
            }
            System.out.println("文件拷贝完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
