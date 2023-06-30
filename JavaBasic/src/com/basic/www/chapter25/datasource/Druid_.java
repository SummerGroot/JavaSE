package com.basic.www.chapter25.datasource;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @Auther : Summer
 * @Classname Druid_
 * @Description
 * @Date 2023/6/30 17:25
 * @Created by Summer
 * @Version: 1.0
 */
public class Druid_ {
    @Test
    //测试Druid使用
    public void testDruid() throws Exception {
        //加入Druid jar
        //加入配置文件，将该文件拷贝到项目的src目录下
        //创建Properties对象
        Properties properties = new Properties();
        properties.load(new FileInputStream("G:\\IDEA\\JavaStudy\\JavaSE\\JavaBasic\\src\\druid.properties"));
        //创建一个指定参数的数据库连接池 Druid连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5_000_000; i++) {
            //拿到连接
            Connection connection = dataSource.getConnection();
            //关闭连接
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("连接耗时" + (end - start) + "ms");//834ms

    }
}
