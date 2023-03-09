package com.basic.www.chapter15.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-09 10:55
 */
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        //创建3个对象
        employees.add(new Employee("tom", 10000, new MyDate(2020, 6, 10)));
        employees.add(new Employee("jack", 12000, new MyDate(2001, 12, 12)));
        employees.add(new Employee("tom", 10000, new MyDate(2020, 10, 10)));
        System.out.println(employees);
        //排序方式：调用AyyayList的sort方法，传入Comparator对象（使用泛型），
        System.out.println("===对员工进行排序===");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp01, Employee emp02) {
                //先按照name排序，如果name相同，则按照生日日期的先后排序
                //先对传入的参数验证
                if (!(emp01 instanceof Employee && emp02 instanceof Employee)) {
                    System.out.println("类型不匹配");
                    return 0;
                }
                //比较name
                int i = emp01.getName().compareTo(emp02.getName());
                if (i != 0) {
                    return i;
                }
                //下面是在borthday比较
                //如果name相同，就比较birthday----year
                /*int yearMinus = emp01.getBirthday().getYear() - emp02.getBirthday().getYear();
                if (yearMinus != 0) {
                    return yearMinus;
                }
                //如果year相同，就比较---month
                int monthMinus = emp01.getBirthday().getMonth() - emp02.getBirthday().getMonth();
                if(monthMinus!= 0){
                    return monthMinus;
                }
                //如果month相同，就比较---day
                return emp01.getBirthday().getDay() - emp02.getBirthday().getDay();*/
                return emp01.getBirthday().compareTo(emp02.getBirthday());
            }
        });
        System.out.println("===排序后的结果===");
        System.out.println(employees);
    }
}

//定义Employee类
class Employee {
    //private 成员变量name sal，birthday，其中birthday为MyDate类的对象
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    //为每个属性定义getter setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    //重写toString方法，输出name，sal，birthday

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    //private 成员变量 month，day，year
    private int year;
    private int month;
    private int day;

    //为每个属性定义getter setter方法


    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {//把对year-month-day比较放这里
        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        //如果year相同，就比较---month
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        //如果month相同，就比较---day
        return day - o.getDay();
    }
}
