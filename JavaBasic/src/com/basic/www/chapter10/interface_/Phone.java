package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 14:35
 */
    //类Phone类实现UsbInterface接口
    //即Phone类需要实现UsbInterface接口 规定ng/声明的方法
public class Phone implements UsbInteface{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
