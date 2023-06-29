package com.basic.www.chapter19.reader_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-03-30 15:10
 */
public class BufferedReader_ {
    public static void main(String[] args) {
        //使用BufferedReader读取文本文件，并显示在控制台
        //文件路径
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\b.txt";
        BufferedReader bufferedReader = null;
        //创建BufferedReader对象
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            //读取
            String line;//按行读取
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            /*
             * 1、bufferedReader.readLine();按行读取文件
             * 2、当返回null时，表示文件读取完毕*/
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流,只需要关闭BufferedReader，因为底层会自动去关闭  节点流
            try {
                bufferedReader.close();
               /* public void close() throws IOException {
                    synchronized (lock) {
                        if (in == null)
                            return;
                        try {
                            in.close();//in就是传入的new FileReader(filePath)，关闭了
                        } finally {
                            in = null;
                            cb = null;
                        }
                    }
                }*/
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
