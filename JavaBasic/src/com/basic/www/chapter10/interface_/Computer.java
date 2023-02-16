package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 14:38
 */
public class Computer {
    //编写一个方法
    //UsbInteface usbInteface形参是接口类型
    //接收实现了UsbInteface 接口的类的对象实例
    public void work(UsbInteface usbInteface) {
        //通过接口调用方法
        usbInteface.start();
        usbInteface.stop();
    }
}
