package com.basic.www.chapter19.transformation;

import java.io.*;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 15:35
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //中文乱码问题
        //读取G:\Notes\Java\JavaNotes\file_\a.txt文件
        //创建字符流输入流BufferedReader(处理流)
        //使用Buffereder对象读取a.txt
        //默认情况下是UTF-8

        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String s = br.readLine();
        System.out.println("读取到的内容：" + s);//读取到的内容：helhel  ����Դ
        br.close();
    }
}
