package com.basic.www.conpter08.modifier;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-07 15:43
 */
public class A {
    //四个属性，分别使用不同的访问修饰符来修饰
    public int n1 = 10;
    protected int n2 = 20;
    int n3 = 30;
    private int n4 = 40;

    public void m1() {
        //该方法可以访问 四个属性
        System.out.println("n1=" + n1
                + "\tn2=" + n2
                + "\tn3=" + n3
                + "\tn4=" + n4);
    }
}
