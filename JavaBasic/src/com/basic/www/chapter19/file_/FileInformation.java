package com.basic.www.chapter19.file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-03-23 13:37
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    //获取文件的信息
    public void info(){
        //创建文件对象
        File file = new File("G:\\Notes\\Java\\JavaNotes\\file_\\news01.txt");

        //调用相应的方法，得到对于信息
        //得到文件名
        System.out.println("文件名="+file.getName());//文件名=news01.txt
        //文件的绝对路径名
        System.out.println("文件绝对路径="+file.getAbsolutePath());//文件绝对路径名=G:\Notes\Java\JavaNotes\file_\news01.txt
        //得到文件父级目录
        System.out.println("文件父级目录="+file.getParent());//文件父级目录=G:\Notes\Java\JavaNotes\file_
        System.out.println("文件的大小（字节）="+file.length());//文件的大小（字节）=0  utf-8 一个汉字三个字节
        System.out.println("是否为文件="+file.isFile());//是否为文件=true
        System.out.println("是否问目录="+file.isDirectory());//是否问目录=false

    }
}
