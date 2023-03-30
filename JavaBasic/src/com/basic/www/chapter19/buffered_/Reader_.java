package com.basic.www.chapter19.buffered_;

import java.io.Reader;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-03-30 14:38
 */
public abstract class Reader_ {//抽象类

    public void readFile() {};
    public void readString() {};
    //在Reader_ 抽象类，使用read方法统一管理
    /*public abstract void read(){};*/
}

//节点流
class FileReader_ extends Reader_ {
    public void readFile() {
        System.out.println("对文件进行读取....");
    }
    /*public void read(){
    }*/
}

//节点流
class StringReader_ extends Reader_ {
    public void readString() {
        System.out.println("对字符串读取...");
    }
}

//处理流/包装流
class BufferedReader_ extends Reader_ {
    private Reader_ reader;
    //接受Reader_子类对象
    public BufferedReader_(Reader_ reader) {
        this.reader = reader;
    }
    public void readFile(){
        reader.readFile();
    }
    //让方法更加灵活，多次读取文件
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader.readFile();
        }
    }
    //扩展readString 批量处理字符串数据
    public void readStrings(int num){
        for (int i = 0; i < num; i++) {
            reader.readString();
        }
    }
}
class Test_{
    public static void main(String[] args) {
        BufferedReader_ bufferedReader1 = new BufferedReader_(new FileReader_());
        bufferedReader1.readFiles(10);
        bufferedReader1.readFile();
        //对字符串操作
        BufferedReader_ bufferedReader2 = new BufferedReader_(new StringReader_());
        bufferedReader2.readStrings(5);

    }
}