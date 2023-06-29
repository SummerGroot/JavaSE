package com.basic.www.chapter25.jdbc.statement_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @Auther : Summer
 * @Classname Statement_
 * @Description
 * @Date 2023/6/29 17:26
 * @Created by Summer
 * @Version: 1.0
 */
public class Statement_ {
    public static void main(String[] args) throws SQLException, IOException {

        Scanner scanner = new Scanner(System.in);
        //用户输入
        System.out.println("请输入管理名的名字：");
        //让用户输入管理员名和密码
        String admin_name = scanner.nextLine();//希望看到sql注入，使用nextline()  next() 接收到空额或''表示接收
        //1' or
        System.out.println("请输入管理员密码：");
        String admin_pwd = scanner.nextLine();
        //or '1' = '1 万能密码


        //statement注入问题
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
        String sql = "select name,pwd from admin where name ='"
                + admin_name + "'  and pwd = '" + admin_pwd + "' ";
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            //如果查询到一条记录，则说明该管理员存储
            System.out.println("恭喜，登录成功");
        } else {
            System.out.println("登录失败！！！");
        }
        //关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
