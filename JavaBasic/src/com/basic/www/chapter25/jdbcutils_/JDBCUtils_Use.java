package com.basic.www.chapter25.jdbcutils_;

import org.junit.jupiter.api.Test;

import java.sql.*;

/**
 * @Auther : Summer
 * @Classname JdbcUtils_Use
 * @Description
 * @Date 2023/6/29 20:25
 * @Created by Summer
 * @Version: 1.0
 */
public class JDBCUtils_Use {
    @Test
    public void testDML() {
        // insert update delete
        //1、得到连接
        Connection connection = null;
        //2、组织一个sql 语句
        String sql = "update actor set name = ? where id = ?";
        PreparedStatement preparedStatement = null;
        //创建ProparedStatement
        try {
            connection = JDBC_Utils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //给占位符赋值
            preparedStatement.setString(1, "周星驰");
            preparedStatement.setInt(2, 1);
            //执行
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭资源
            JDBC_Utils.close(null, preparedStatement, connection);
        }
    }
    @Test
    public void testSelect() {
        System.out.println("使用JDBC方式完成");
        //1、得到连接
        Connection connection = null;
        //2、组织一个sql
        String sql = "select * from actor where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet set = null;
        //3、创建PreparedStatement对象
        try {
            connection = JDBC_Utils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 5);
            //执行
            set = preparedStatement.executeQuery();
            //遍历该结果集
            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndate + "\t" + phone);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭资源
            JDBC_Utils.close(set, preparedStatement, connection);
        }
    }
}
