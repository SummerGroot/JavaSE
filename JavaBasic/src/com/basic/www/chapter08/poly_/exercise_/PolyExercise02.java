package com.basic.www.chapter08.poly_.exercise_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-10 10:30
 */
public class PolyExercise02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;
        System.out.println(b == s);//true
        System.out.println(b.count);//20
        b.display();//20

    }
}

class Base {//父类
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {//子类
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}
