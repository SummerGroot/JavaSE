package com.basic.www.chapter10.abstract_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 14:04
 */
public class AA extends Template{

    //计算任务
    //1+...+10000
    public void job() {//实现了Template的抽象方法
        long num = 0;
        for (long i = 1; i < 1000000; i++) {
            num += i;
        }
    }
}
