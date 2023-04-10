package com.basic.www.chapter19.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 17:24
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        //创建Properties对象
        Properties properties = new Properties();
        //加载配置文件
        properties.load(new FileReader("G:\\IDEA\\JavaStudy\\JavaSE\\JavaBasic\\src\\mysql.properties"));
        //把键值对显示到控制台
        properties.list(System.out);
        //根据key获取val
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名=" + user);//用户名=root
        System.out.println("密码是=" + pwd);//密码是=12345
        String ip = properties.getProperty("ip");
        System.out.println("ip="+ip);//ip=192.168.100.100
    }
}
