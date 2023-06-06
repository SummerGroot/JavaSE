package com.basic.www.chapter12.throw_;

import java.io.FileNotFoundException;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-17 13:51
 */
public class Throw01 {
    public static void main(String[] args) {
        Throw01 throw01 = new Throw01();
        try {
            throw01.f2(-5);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void f1(int age){
        if(age<0){
            //手动抛出运行时异常
            throw new NullPointerException("输入的年龄小于0！！！，请重新输入");
            //运行时异常可以不用处理
        }
    }
    //手动抛出编译时异常
    public void f2(int age) throws FileNotFoundException {
       if(age<0){
           throw new FileNotFoundException("输入的年龄小于0");
           /*
           * 方法手动抛出了编译时异常
           * 编译时异常需要被处理
           * 这里采用了throws这个异常，也就是说方法并没有处理这个异常，而是将异常抛给了调用者
           * 这样调用了这个方法的人必须处理这个异常才可以
           *
           * 注意：
           * 这里并不用自己使用try-catch处理这个异常
           * 自己在方法李抛出异常，方法再给自己处理没有任何作用
           * 所以方法中的异常要抛给调用者去处理。
           * */
       }
    }
}
