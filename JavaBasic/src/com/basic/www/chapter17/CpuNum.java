package com.basic.www.chapter17;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-14 15:01
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑cpu数量
        int i = runtime.availableProcessors();
        System.out.println("当前电脑cpu数量：" + i);
    }
}
