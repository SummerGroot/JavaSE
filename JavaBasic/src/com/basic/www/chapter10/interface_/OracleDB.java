package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 15:28
 */
public class OracleDB implements DBInterface {
    //连接Oracle
    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle");
    }
}
