package com.basic.www.conpter08.poly_.polyparameter_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-13 13:46
 */
public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("普通员工：" + getName() + "正在工作");
    }

    @Override
    public double getAnnual() {
        //因为普通员工没有其他收入，直接调用父类的方法
        return super.getAnnual();
    }
}
