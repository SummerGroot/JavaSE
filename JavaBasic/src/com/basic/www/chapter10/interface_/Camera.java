package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 14:37
 */
public class Camera implements UsbInteface {//实现接口,把接口的方法实现

    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}
