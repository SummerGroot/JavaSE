package com.basic.www.chapter25.jdbcutils_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @Auther : Summer
 * @Classname Jdbc_Utils
 * @Description
 * @Date 2023/6/29 18:20
 * @Created by Summer
 * @Version: 1.0
 */
public class JDBC_Utils {
    //定义相关的属性，因为只需要一份
    private static String user;//用户名
    private static String pwd;//密码
    private static String url;//url
    private static String driver;//driver

    //在static代码块去初始化
    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("G:\\IDEA\\JavaStudy\\JavaSE\\JavaBasic\\src\\com\\basic\\www\\chapter25\\jdbc\\myjdbc\\mysql.Properties"));
            //读取相关的属性值
            user = properties.getProperty("user");
            pwd = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            //在实际开发中,将编译异常转成运行异常
            //调用者可以捕获该异常，也可以选择默认处理该异常。
            throw new RuntimeException(e);
        }
    }

    //连接数据库，返回connection
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            //将编译异常转成运行异常
            throw new RuntimeException(e);
        }
    }

    //关闭相关资源
    //1、ResultSet结果集
    //2、Statement 或者 ProparedStatement
    //3、connection
    public static void close(ResultSet set, Statement statement, Connection connection) {
        //判断是否为空
        try {
            if (set != null) {
                set.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
