package com.basic.www.chapter25.jdbc.statement_;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @Auther : Summer
 * @Classname PreparedStatement_DML
 * @Description
 * @Date 2023/6/29 18:09
 * @Created by Summer
 * @Version: 1.0
 */
public class PreparedStatement_DML {
    public static void main(String[] args) throws IOException, SQLException {
        Scanner scanner = new Scanner(System.in);
        //用户输入
        System.out.println("请输入管理名的名字：");
        //让用户输入管理员名和密码
        String admin_name = scanner.nextLine();
        System.out.println("请输入管理员密码：");
        String admin_pwd = scanner.nextLine();
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
        //写sql语句
        //sql语句的?相当于占位符
        //数据添加
        String sql = "insert into admin values(?,?)";
        //数据修改
        String sql_update = "update admin set pwd = ? where name =?";
        //数据删除

        //得到Preparedstatement对象 实现了PreparedStatement接口的实现类的对象
        //PreparedStatement preparedStatement = connection.prepareStatement(sql);
        PreparedStatement preparedStatement = connection.prepareStatement(sql_update);
        //给? 赋值
        preparedStatement.setString(1, admin_pwd);
        preparedStatement.setString(2, admin_name);
        //执行dml语句
        int rows = preparedStatement.executeUpdate();

        System.out.println(rows>0?"执行成功":"执行失败！！");


        //关闭连接

        preparedStatement.close();
        connection.close();
    }
}
