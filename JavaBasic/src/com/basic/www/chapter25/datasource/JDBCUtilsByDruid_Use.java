package com.basic.www.chapter25.datasource;

import org.junit.jupiter.api.Test;

import java.sql.*;

/**
 * @Auther : Summer
 * @Classname JDBCUtilsByDruid_Use
 * @Description
 * @Date 2023/7/6 14:57
 * @Created by Summer
 * @Version: 1.0
 */
public class JDBCUtilsByDruid_Use {
    @Test
    public void testSelect() {
        System.out.println("使用Druid方式完成");
        //1、得到连接
        Connection connection = null;
        //2、组织一个sql
        String sql = "select * from actor where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet set = null;
        //3、创建PreparedStatement对象
        try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 5);
            //执行，得到结果集
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
            JDBCUtilsByDruid.close(set, preparedStatement, connection);
        }
    }
}
