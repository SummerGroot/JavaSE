package com.basic.www.chapter25.datasource;

import com.basic.www.chapter25.jdbcutils_.JDBC_Utils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

/**
 * @Auther : Summer
 * @Classname ConQuestion
 * @Description
 * @Date 2023/6/29 22:11
 * @Created by Summer
 * @Version: 1.0
 */
public class ConQuestion {
    @Test
    //连接mysql 5k次
    public void testCon() {
        //5k关闭所用时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            //使用传统的jdbc方式
            Connection connection = JDBC_Utils.getConnection();
            //关闭
            JDBC_Utils.close(null, null, connection);
        }
        long end = System.currentTimeMillis();
        System.out.println("5k次关闭耗费时间为：" + (end - start));//22780
    }
}
