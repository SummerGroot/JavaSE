package com.basic.www.chapter08.encap_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-07 16:39
 */
class Account {
    /*
     * 1、Account类要求具有属性：姓名（长度为2位3位或4位）、余额（必须>20）
     * 密码（必须是6位），如果不满足，则给出提示信息，并给默认值。
     * 2、通过setXxx的方法给Account的属性赋值
     * 3、在AccountTest中测试*/
    //为了封装将，3个属性设置为private
    private String name;
    private double balance;
    private String pwd;
//提供两个构造器

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    //姓名（长度为2位3位或4位）
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名要求（长度为2位3位或4位）");
            this.name = "无名";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额>20 默认为0");
            this.balance = 0;
        }

    }

    public String getPwd() {
        return pwd;
    }

    //密码必须是6位
    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须是6位");
            this.pwd = "000000";
        }

    }

    //显示账号信息
    public void showInfo() {
        //可以增加权限的校验
        System.out.println("账号信息name=" + this.name + " 余额=" + this.balance + " 密码=" + this.pwd);
    }
}
