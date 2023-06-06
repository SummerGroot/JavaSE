package com.basic.www.chapter12.try_.return_;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-17 15:01
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("test()=" + test1());//1132
        System.out.println("============");
        System.out.println("test()=" + test2());//122
    }

    //有异常
    /*
     * 1、*/
    public static int test1() {
        int temp = 1;
        try {
            System.out.println("temp=" + temp);//1
            int i = 1 / 0;
        } catch (Exception e) {
            System.out.println("temp=" + temp);//1
            return ++temp;//2
        } finally {
            ++temp;//3
            System.out.println("temp=" + temp);//3
        }
        return temp;
    }

    //无异常
    public static int test2() {
        int temp = 1;
        try {
            System.out.println("temp=" + temp);//temp=1
        } catch (Exception e) {
            System.out.println("temp=" + temp);
            return ++temp;
        } finally {
            ++temp;//2
            System.out.println("temp=" + temp);//temp=2
        }
        return temp;//2
    }
}
