package com.basic.www.chapter08.encap_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-07 16:39
 */
public class AccountTest {
    public static void main(String[] args) {
        //创建Accout
        Account account = new Account();
        account.setName("summ");
        account.setBalance(1000);
        account.setPwd("123456");
        account.showInfo();
        //账号信息name=summ 余额=1000.0 密码=123456
        Account account1 = new Account("夏天",3000.2,"123456");
        account1.showInfo();
        //账号信息name=夏天 余额=3000.2 密码=123456
    }
}
