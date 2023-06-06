package com.basic.www.chapter25.jdbc.myjdbc;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-09 16:22
 */
public interface JdbcInterface {
    //我们规定的jdbc接口(方法)
    //连接
    public Object getConnection();
    //crud
    public void crud();
    //关闭连接
    public void close();
}
