package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 14:33
 */
public class Interface01 {
    public static void main(String[] args) {
        //创建手机，相机
        Phone phone = new Phone();
        //Phone实现了UsbInteface
        Camera camera = new Camera();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);//把手机接入计算机
        System.out.println("============");
        computer.work(camera);//把手机接入计算机
    }
}
