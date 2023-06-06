package com.basic.www.chapter25.jdbc.myjdbc;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-09 16:26
 */
public class TestJdbc {
    public static void main(String[] args) {
        //完成对mysql操作
        JdbcInterface jdbcInterface = new MysqlJdbcImpl();
        jdbcInterface.getConnection();//通过接口调用实现类[动态绑定]
        jdbcInterface.crud();
        jdbcInterface.close();
        //对oracle操作
        System.out.println("================");
        JdbcInterface jif = new OracleJdbcImpl();
        jif.getConnection();
        jif.crud();
        jif.close();
    }
}
