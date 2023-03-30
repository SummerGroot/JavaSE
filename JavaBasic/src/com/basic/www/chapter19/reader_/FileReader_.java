package com.basic.www.chapter19.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;


public class FileReader_ {
    public static void main(String[] args) {
    }
    @Test
    //单个字符读取文件
    public void readerFile01(){
        //文件路径
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\story.txt";
        FileReader fileReader = null;
        int data = ' ';
        //1、创建一个FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 单个字符读取read
            while ((data = fileReader.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    @Test
    //字符数组读取文件
    public void readerFile02(){
        //文件路径
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\story.txt";
        FileReader fileReader = null;
        int readlen = 0;
        char[] buf = new char[8];
        //1、创建一个FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 read(buf),返回的是实际读取到的字符数。
            //如果返回-1，说明文件读完
            while ((readlen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf,0,readlen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
