package com.basic.www.chapter19.file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-03-23 14:30
 */
public class Directory_ {
    public static void main(String[] args) {
        //
    }

    //判断G:\Notes\Java\JavaNotes\file_\news01.txt是否存在，如果存在就删除
    @Test
    public void m1() {
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\news01.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该文件不存在");
        }
    }

    //判断G:\Notes\Java\JavaNotes\file_\demo01目录是否存在，存在就删除，否则就提示
    //在java中，目录也被当作文件
    @Test
    public void m2() {
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo01";
        ;
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该目录不存在");
        }
    }

    //判断G:\Notes\Java\JavaNotes\file_\demo02目录是否存在，如果存在就提示已经存在，否则就创建
    @Test
    public void m3() {
        String directoryPath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo01\\demo02\\demo03";
        ;
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "目录已存在");
        } else {
            if (file.mkdirs()){//创建1级目录使用mkdir
                System.out.println(directoryPath + "目录创建成功");
            }else{
                System.out.println(directoryPath + "创建失败");
            }
        }
    }

}
