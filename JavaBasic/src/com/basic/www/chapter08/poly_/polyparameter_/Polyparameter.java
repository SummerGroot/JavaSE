package com.basic.www.chapter08.poly_.polyparameter_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-13 13:40
 */
public class Polyparameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 6125.2);
        Manager jack = new Manager("jack", 10000, 20000);
        Polyparameter polyparameter = new Polyparameter();
        polyparameter.showEmpAnnual(tom);//73502.4
        polyparameter.showEmpAnnual(jack);//140000.0

        polyparameter.testWork(tom);//普通员工：tom正在工作
        polyparameter.testWork(jack);//经理：jack正在管理
    }

    //实现获取任何员工对象的年工资，并在main方法中调用该方法
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work(); //向下转型操作
        } else if (e instanceof Manager) {
            ((Manager) e).manage();//向下转型操作
        } else {
            System.out.println(("不支持的类型"));
        }
    }
}
