package com.basic.www.conpter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-02 10:38
 */
public class VarParameterDetail {
    public static void main(String[] args) {
        //可变参数的实参可以时数组
        int[] arr = {1,2,3};
        D d = new D();
        d.f1(arr);
        d.f2("summer",1.1,2.2,3.3);
    }
}
class D{
    public void f1(int... nums){
        System.out.println(nums.length);
    }
    //可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
    public void f2(String str,double... nums){}
}
