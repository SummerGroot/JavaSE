package com.basic.www.chapter25.jdbc.resultset_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @Auther : Summer
 * @Classname ResultSet_
 * @Description
 * @Date 2023/6/29 16:40
 * @Created by Summer
 * @Version: 1.0
 */
public class ResultSet_ {
    //演示select语句返回Resultset
    public static void main(String[] args) throws IOException, SQLException {
        //通过Properties获取配置文件信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("G:\\IDEA\\JavaStudy\\JavaSE\\JavaBasic\\src\\com\\basic\\www\\chapter25\\jdbc\\myjdbc\\mysql.Properties"));
        // 获取URL user password
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        //注册驱动
        //Class.forName(driver);
        //得到连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //得到statement
        Statement statement = connection.createStatement();
        //写sql语句
        String sql = "select id,name,sex,borndate from actor";
        //执行给定的SQL语句，该语句返回单个 ResultSet对象
        /*
        +----+-----------+-----+---------------------+--------------+
        | id | name      | sex | borndate            | phone        |
        +----+-----------+-----+---------------------+--------------+
        |  1 | mary      | 女  | 1970-11-11 00:00:00 | 123456789123 |
        |  2 | 刘德华    | 男  | 1970-12-12 00:00:00 | 11111        |
        |  3 | jack      | 男  | 1990-11-11 00:00:00 | 22222        |
        +----+-----------+-----+---------------------+--------------+
        */
        ResultSet resultSet = statement.executeQuery(sql);
        //使用while循环取出数据
        while (resultSet.next()) {//让光标向后移动，如果没有，则返回false
            int id = resultSet.getInt(1);//获取该行的第1列数据
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }


        //关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
