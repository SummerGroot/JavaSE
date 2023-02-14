package com.basic.www.chapter08.encap_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-07 16:16
 */
public class Encapsulation01 {
    public static void main(String[] args) {
        /*
         * 不能随便参看人的年龄，工作等隐私，并对设置的年龄进行合理的验证。
         * 年龄合理就设置，否则给默认
         * 年龄必须在1-120，
         * 工资不能直接查看
         * name的长度在2-6字符之间*/
        Person p1 = new Person();
        p1.setName("avenger");
        p1.setAge(30);
        p1.setSalary(30000.0);
        System.out.println(p1.info());
        Person p2 = new Person("james", 231, 24000);
        System.out.println("=======p2的信息=======");
        System.out.println(p2.info());

    }
}

class Person {
    public String name;//名字公开
    private int age;//年龄私有化
    private double salary;//工资私有化

    //无参构造器
    Person(){

    }
    //带参构造器
    public Person(String name, int age, double salary) {
        /*this.name = name;
        this.age = age;
        this.salary = salary;*/
        //可以将set方法写在构造器中，仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //setXxx和getXxx快捷键----alt+insert(Getter and Setter)
    //根据要求完善代码
    public void setName(String name) {
        //加入对数据的校验
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else {
            System.out.println("名字的长度不对，需要2-6字符");
            this.name="summer";
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断
        if (age >=1&&age<=120) {
            this.age = age;
        }else {
            System.out.println("你设置的年龄有误，需要在1-120");
            //给一个默认年龄
            this.age = 18;
        }
    }

    public double getSalary() {
        //可以增加对当前对象权限的判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法。返回属性信息
    public String info() {
        return "信息为name=" + name + ",age=" + age + ",薪水=" + salary;
    }
}