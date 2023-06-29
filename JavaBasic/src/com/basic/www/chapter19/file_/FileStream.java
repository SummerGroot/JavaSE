package com.basic.www.chapter19.file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @Auther : Summer
 * @Classname FileStream
 * @Description
 * @Date 2023/6/28 15:47
 * @Created by Summer
 * @Version: 1.0
 */
public class FileStream {
    public static void main(String[] args) {

    }
    @Test
    public void reader(){
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_";
        File reader = new File(filePath, "Reader");
        if(reader.exists()){
            System.out.println("创建目录失败，目录以存在！！！");
        }else {
            reader.mkdir();
            System.out.println("创建目录成功");
        }
    }
    @Test
    public void writer(){
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_";
        File writer = new File(filePath, "Writer");
        if(writer.exists()){
            System.out.println("创建目录失败，目录已存在！！！");
        }else {
            writer.mkdir();
            System.out.println("目录创建成功");
        }
    }
}
