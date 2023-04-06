package com.basic.www.chapter19.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-03-23 13:10
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //创建文件
    //方式1：new File(String pathname)//根据路径创建一个File对象
    @Test
    public void create01(){
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\news01.txt";//设置绝对路径
        File file = new File(filePath);//路径导入
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式2：new File(File parent,String child)//根据父目录文件+子路径构建
    //G:\\Notes\\Java\\JavaNotes\\file_\\news02.txt
    @Test
    public void create02(){
        File parentFile = new File("G:\\Notes\\Java\\JavaNotes\\file_\\");
        String fileName = "news02.txt";
        //这里file对象，在java程序中，只是一个对象
        //只有执行了createNewFile方法，才会真正在磁盘创建该文件
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式3：new File(String parent,String child)//根据父目录+子路径构建
    @Test
    public void create03(){
        String parentPath = "G:\\Notes\\Java\\JavaNotes\\file_\\";
        String filePath = "news03.txt";
        File file = new File(parentPath, filePath);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
