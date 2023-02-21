package com.basic.www.chapter12.custom_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 13:35
 */
public class CustomException01 {
    public static void main(String[] args)  /*throws AgeException*/{
        int age =130;
        //要求范围在18-120之间，否则抛出一个自定义异常
        if(!(age>=18 && age<=120)){
            //这里我们可以通过构造，设置信息
            throw new AgeException("年龄需要在18-120之间");
        }
        System.out.println("你的年龄范围正常！！");
    }
}
//自定义异常
/*
* 1、一般情况下自定义异常是继承RuntimeException
* 2、把自定义异常做成运行时异常，好处是，我们可以使用默认的处理机制
* 3、比较方便*/
class AgeException extends RuntimeException{
    public AgeException(String message) {
        //构造器
        super(message);
    }
}
