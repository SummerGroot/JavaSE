package com.basic.www.chapter25.transaction_;

import com.basic.www.chapter25.jdbcutils_.JDBC_Utils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Auther : Summer
 * @Classname Transacton_
 * @Description
 * @Date 2023/6/29 20:54
 * @Created by Summer
 * @Version: 1.0
 */
public class Transaction_ {
    @Test
    //没使用事务
    public void noTransaction() {
        //操作转账
        //得到连接
        Connection connection = null;
        //组织一个sql
        String sql01 = "update account set balance= balance-100 where id = 1 ";
        String sql02 = "update account set balance= balance+100 where id = 2 ";
        PreparedStatement preparedStatement = null;
        //创建ProparedStatement
        try {
            connection = JDBC_Utils.getConnection();//在默认情况下，connection对象默认自动提交
            preparedStatement = connection.prepareStatement(sql01);
            //执行
            preparedStatement.executeUpdate();

            int i = 1 / 0;//抛出异常
            preparedStatement = connection.prepareStatement(sql02);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭资源
            JDBC_Utils.close(null, preparedStatement, connection);
        }
    }

    @Test
    //使用事务
    public void useTransaction() {
        //操作转账
        //得到连接
        Connection connection = null;
        //组织一个sql
        String sql01 = "update account set balance= balance-100 where id = 1 ";
        String sql02 = "update account set balance= balance+100 where id = 2 ";
        PreparedStatement preparedStatement = null;
        //创建ProparedStatement
        try {
            connection = JDBC_Utils.getConnection();
            //将connection设置为不自动提交
            connection.setAutoCommit(false);//开启事务
            preparedStatement = connection.prepareStatement(sql01);
            //执行
            preparedStatement.executeUpdate();

            //int i = 1 / 0;//抛出异常
            preparedStatement = connection.prepareStatement(sql02);
            preparedStatement.executeUpdate();
            //这里提交
            connection.commit();
        } catch (SQLException e) {
            System.out.println("执行发生异常，撤销执行sql");
            try {
                //这里可以进行回滚，撤销执行的sql
                connection.rollback();//默认回滚事务开始状态
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            //关闭资源
            JDBC_Utils.close(null, preparedStatement, connection);
        }
    }

}
