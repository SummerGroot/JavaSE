package com.basic.www.chapter13.wrapper_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 14:18
 */
public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d = 100d;//自动装箱 Double.valueOf(100d);
        Float f = 1.5f;//自动装箱Float.valueOf(1.5f);
        Object obj1 = true ? new Integer(1) : new Double(2.0);//精度为double(是一个整体)
        System.out.println(obj1);//1.0
        Object obj2;
        if (true) {
            obj1 = new Integer(1);
        } else {
            obj2 = new Double(2.0);
        }

//分别计算,不会提升优先级!!!

    }
}
