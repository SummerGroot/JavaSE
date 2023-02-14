package com.basic.www.chapter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-02 10:59
 */
public class VarScope {
    public static void main(String[] args) {
        VarScopeCat vsc = new VarScopeCat();
        System.out.println(vsc.weight);
    }
}

class VarScopeCat {
    //全局变量：也就是属性，作用域为整个类体
    int age = 10;
    double weight;//默认值是0.0
    //属性在定义是，可以直接赋值
    {
        int num = 10;
    }

    public void sat() {
        //局部变量一般是指在成员方法中定义的变量
        int n = 10;
        //局部变量
        String name = "summer";
        //n name的作用域在car方法中
        System.out.println("在cry中使用属性：" + age);
    }

    public void eat() {
        System.out.println("在eat中使用属性：" + age);

    }
}
