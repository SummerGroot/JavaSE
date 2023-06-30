package com.basic.www.chapter25.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Auther : Summer
 * @Classname C3p0_
 * @Description
 * @Date 2023/6/30 15:55
 * @Created by Summer
 * @Version: 1.0
 */
public class C3P0_ {
    @Test
    //演示C3p0使用
    //方式1：相关参数，在程序中指定user,url,password
    public void testC3P0_01() throws IOException, PropertyVetoException, SQLException {
        //创建数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //通过配置文件获取相关信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("G:\\IDEA\\JavaStudy\\JavaSE\\JavaBasic\\src\\com\\basic\\www\\chapter25\\jdbc\\myjdbc\\mysql.Properties"));
        //读取相关的属性值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        //给数据源 comboPooledDataSource设置相关的参数
        //连接管理是由 comboPooledDataSource来管理
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(pwd);
        //设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        //最大连接数
        comboPooledDataSource.setMaxPoolSize(50);
        //测试连接池的效率
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();//这个方法就是从DataSource接口实现
            //System.out.println("");
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用连接池的时间为 ：" + (end - start) + "ms");//629ms

    }

    //方式2：使用配置文件模板操作
    //将c3p0配置文件c3p0-config.xml拷贝到src目录下
    //该文件指定了连接数据库和连接池的相关参数
    @Test
    public void testC3P0_02() throws SQLException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("fxy_edu");
        Connection connection = null;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5_000_000; i++) {
            connection = comboPooledDataSource.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("连接耗费时间为：" + (end - start) + "ms");//连接5k次耗费时间为：590ms
    }

}
