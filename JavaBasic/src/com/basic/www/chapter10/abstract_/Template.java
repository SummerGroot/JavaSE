package com.basic.www.chapter10.abstract_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 14:20
 */
abstract public class Template {//模板
    public abstract void  job();//抽象方法
    public void calculateTime() {//调用了job方法
        //得到开始时间
        long start = System.currentTimeMillis();
        job();//动态绑定
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间=" + (end - start));
    }
}
