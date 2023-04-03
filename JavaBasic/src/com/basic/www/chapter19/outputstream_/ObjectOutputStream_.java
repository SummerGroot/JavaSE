package com.basic.www.chapter19.outputstream_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 14:24
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) {
        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\data.txt";
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            //序列化数据到文件中
            oos.writeInt(100);//int  ->  Ingter(实现了 Serilizable接口
            oos.writeBoolean(true);
            oos.writeChar('a');
            oos.writeDouble(9.5);
            oos.writeUTF("summer");
            //保存一个Dog
            oos.writeObject(new Dog("旺财", 2,"中国成都","白色"));
            System.out.println("数据保存完毕（系列化形式)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}