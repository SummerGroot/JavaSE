package com.basic.www.chapter25.jdbcutils_;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
