package com.basic.www.chapter25.jdbc.myjdbc;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-09 16:23
 */
public class MysqlJdbcImpl implements  JdbcInterface {
    //mysql数据库实现了jdbc接口
    @Override
    public Object getConnection() {
        System.out.println("得到mysql的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成mysql的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql连接");
    }
}
