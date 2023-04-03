package com.basic.www.chapter19.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 17:30
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //创建对象
        Properties properties = new Properties();
        //创建
        properties.setProperty("charSet", "utf8");
        properties.setProperty("user", "火锅");//中文是unicode码存储
        properties.setProperty("pwd", "abc123");
        //修改k-v，如果该文件没有k，就是创建，有了就是修改
        properties.setProperty("pwd","88888");
        //将k-v存储到文件中
        properties.store(new FileOutputStream
                ("G:\\IDEA\\JavaStudy\\JavaSE\\JavaBasic\\src\\mysql02.properties"), "mysql");//comments 注释
        System.out.println("配置文件保存成功");
        //修改k-v，如果该文件没有k，就是创建，有了就是修改
        properties.setProperty("pwd","88888");
    }
}
