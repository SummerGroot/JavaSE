package com.basic.www.chapter25.batch;

import com.basic.www.chapter25.jdbcutils_.JDBC_Utils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Auther : Summer
 * @Classname Batch01
 * @Description
 * @Date 2023/6/29 21:20
 * @Created by Summer
 * @Version: 1.0
 */
public class Batch01 {
    @Test
    //传统方法添加数据
    public void nobatch() throws SQLException {
        Connection connection = JDBC_Utils.getConnection();
        String sql = "insert into admin02 values (null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式花费时间为：" + (end - start) + "毫秒");//1536毫秒
        //关闭连接
        JDBC_Utils.close(null, preparedStatement, connection);
    }

    @Test
    //使用批量处理
    public void useBatch() throws SQLException {
        Connection connection = JDBC_Utils.getConnection();
        String sql = "insert into admin02 values (null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            //将sql语句加入到批处理包中

            preparedStatement.addBatch();
            //当有1000条记录时，再批量执行
            if ((i + 1) % 1000 == 0) {
                //满1000条就批量执行
                preparedStatement.executeBatch();
                //清空一把
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("批量处理耗时为：" + (end - start) + "毫秒");
        //关闭连接
        JDBC_Utils.close(null, preparedStatement, connection);
    }
}
