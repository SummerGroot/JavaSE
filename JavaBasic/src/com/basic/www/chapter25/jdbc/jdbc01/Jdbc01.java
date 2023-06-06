package com.basic.www.chapter25.jdbc.jdbc01;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-09 16:46
 */
public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        //完成简单操作
        //在项目中创建一个libs文件夹，把mysql.jar的驱动文件复制过去。记住还需要Add as Library
        //1、注册驱
        //new com.mysql.jdbc.Driver()
        Driver driver = new Driver(); //创建driver对象
        //2、得到连接
        /*
         * 1、jdbc:mysql  规定好的，表示协议，通过jdbc的方式连接mysql
         * 2、localhost 主机，可以是ip地址
         * 3、3306  表示mysql监听的端口
         * 4、fxy_db02 连接mysql dbms 的哪个数据库*/
        String url = "jdbc:mysql://localhost:3306/fxy_db02";
        //将用户名和密码放入到Properties() 对象
        Properties properties = new Properties();
        /*
         * suer 和 password 是规定好的，后面的值根据实际填写
         * */
        properties.setProperty("user", "root");//用户
        properties.setProperty("password", "123456");//密码

        Connection connect = driver.connect(url, properties);

        //3、执行sql
        //String sql = "insert into actor values(null,'刘德华','男','1970-11-11','123456789123')";
        // String sql = "update actor set name = '周星驰' where id = 1";
        String sql = "delete  from  actor where id = 1";
        //用于执行静态SQL语句并返回其生成的结果的对象。
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);//如果是dml语句，返回的就是影响的行数

        System.out.println(rows > 0 ? "成功" : "失败");

        //4、关闭连接
        statement.close();
        connect.close();
    }
}
