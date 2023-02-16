package com.basic.www.chapter10.abstract_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 11:37
 */
public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager m1 = new Manager("summer", 01, 1000.9);
        m1.setBonus(8000);
        m1.work();
        CommonEmployee james = new CommonEmployee("james", 02, 9000);
        james.work();


    }
}

abstract class Employee {
    //三个属性
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    //奖金属性
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
        this.bonus = bonus;

    }

    @Override
    void work() {
        System.out.println("经理：" + getName() + "正在工作");
    }
}

class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void work() {
        System.out.println("普通员工：" + getName() + "正在工作");
    }
}

