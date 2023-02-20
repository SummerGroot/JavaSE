package com.basic.www.chapter10.static_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 10:58
 */
public class StaticMethod_ {
    public static void main(String[] args) {
        //创建2个学生对象，交学费
        Student tom = new Student("tom");
        //tom.payFee(100);
        Student.payFee(800);//对的
        Student james = new Student("james");
        james.payFee(200);
        //输出当前收到的总学费  类名.类方法名
        Student.showFee();
        System.out.println("9开平方=" + Math.sqrt(9));
        System.out.println(MyTools.sum(40, 30));
    }
}
//开发自己的工具类时，可以将方法做成静态的，方便调用
class MyTools{
    //求出两个数的和
    public static double sum(double n1,double n2){
        return n1+n2;
    }
}
class Student {
    private String name;//普通成员
    //定义一个静态变量，来累计学生的学费
    private static double fee = 0.0;

    public Student(String name) {
        this.name = name;
    }

    //1、当方法使用了static修饰后，该方法就是静态方法
    //2、静态方法就可以访问静态属性
    public static void payFee(double fee) {
        Student.fee += fee;//累计到静态fee
    }

    public static void showFee() {
        System.out.println("总学费有：" + Student.fee);
    }
}

