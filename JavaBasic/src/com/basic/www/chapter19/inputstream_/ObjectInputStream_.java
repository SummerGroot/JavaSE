package com.basic.www.chapter19.inputstream_;

import java.io.*;

import com.basic.www.chapter19.outputstream_.Dog;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 14:38
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //指定反序列化的文件地址
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\data.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        //读取
        /*
         * 1、读取（反序列化）顺序需要和你保存数据（序列化）的顺序一致。
         * 2、否则会出现异常
         * */
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        //Dog的编译类型是Object，dog的运行类型是Dog
        Object dog = ois.readObject();
        System.out.println("运行类型" + dog.getClass());
        System.out.println("dog信息：" + dog);//底层 Object--->Dog
        /*
         * 重要的细节
         * 1、希望调用Dog的方法，需要向下转型
         * 2、需要将Dog类的定义放在到可以引用的位置*/
        Dog huoguo = (Dog) dog;
        System.out.println(huoguo.getName());
        //关闭流,关闭外层流即可 FileInputStream
        ois.close();
    }
}