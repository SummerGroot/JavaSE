package com.basic.www.chapter19.properties_;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Auther : Summer
 * @Classname Properties04
 * @Description
 * @Date 2023/6/28 16:55
 * @Created by Summer
 * @Version: 1.0
 */
public class Properties04 {
    public static void main(String[] args) {

    }

    @Test
    public void m1() throws IOException {
        //使用Properties类完成mysql.properties的读取，并修改某个key-value
        //创建Proterties对象
        Properties properties = new Properties();
        //加载配置文件
        properties.load(new FileReader("G:\\IDEA\\JavaStudy\\JavaSE\\JavaBasic\\src\\mysql.properties"));
        //将数据显示
        properties.list(System.out);
        //修改键值对
        properties.setProperty("user", "summer");
        System.out.println("用户名=" + properties.getProperty("user"));
    }
}
