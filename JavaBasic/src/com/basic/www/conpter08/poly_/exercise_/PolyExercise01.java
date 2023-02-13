package com.basic.www.conpter08.poly_.exercise_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-10 10:19
 */
public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l=(long)d;
        System.out.println(l);//13
        int in =5;
        //boolean b = (boolean)in;//X,boolean->int
        Object obj = "hello";//向上转型
        String objStr = (String)obj;//向下转型
        System.out.println(objStr);//hello

        Object objPri = new Integer(5);//向上转型
        //String str = (String)objPri;//X 指向Integer的父类引用转成String
        //ClasscaseException
        Integer str1 = (Integer)objPri;//向下转型
    }
}
