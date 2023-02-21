package com.basic.www.chapter13.wrapper_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 15:01
 */
public class WrapperExercise03 {
    public static void main(String[] args) {
        //1
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//flase
        //2
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//false
        //3
        Integer i5 = 127;//底层Integer.valueOf(127)
        Integer i6 = 127;
        System.out.println(i5 == i6);//true
        //4
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);//false
        //5
        Integer i9 = 127;//底层Integer.valueOf(127) ,数组里面取出来的
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);//false
        //6
        Integer i11 = 127;
        int i12 = 127;
        //只要有基本数据类型，判断的是值是否相等。
        System.out.println(i11 == i12);//ture
        //7
        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13 == i14);//true

    }
}
