package com.basic.www.chapter25.jdbc.myjdbc;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-09 16:29
 */
public class OracleJdbcImpl implements JdbcInterface {
    @Override
    public Object getConnection() {
        System.out.println("得到Oracle的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成Oracle增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle连接");
    }
}
