package com.basic.www.conpter08.poly_.polyarr_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-10 11:26
 */
public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    //从写父类say方法
    public String say() {
        return super.say() + " salary=" + salary;
    }

    //特有的方法
    public void teach() {
        System.out.println("老师：" + super.getName() + "正在授课");
    }
}
