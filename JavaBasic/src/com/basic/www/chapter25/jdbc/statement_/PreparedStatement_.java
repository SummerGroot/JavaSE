package com.basic.www.chapter25.jdbc.statement_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @Auther : Summer
 * @Classname PreparedStatement_
 * @Description
 * @Date 2023/6/29 17:45
 * @Created by Summer
 * @Version: 1.0
 */
public class PreparedStatement_ {
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
        String sql = "select name,pwd from admin where name =?  and pwd = ? ";

        //得到Preparedstatement对象 实现了PreparedStatement接口的实现类的对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //给? 赋值
        preparedStatement.setString(1, admin_name);
        preparedStatement.setString(2, admin_pwd);
        //执行select 语句使用executeQuery
        //如果执行dml 使用executeUpdate
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            //如果查询到一条记录，则说明该管理员存储
            System.out.println("恭喜，登录成功");
        } else {
            System.out.println("登录失败！！！");
        }


        //关闭连接
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
    @Test
    //数据查询
    public void query_(){
        //SQL语句
        String sql = "select name,pwd from where name = ? and pwd = ? ";

    }
    @Test
    //添加数据
    public void insert_(){

    }
    @Test
    //修改数据
    public void update_(){}

    @Test
    //删除数据
    public void detele_(){}
}
