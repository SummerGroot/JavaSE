package com.basic.www.chapter10.innerclass_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-17 13:28
 */
public class InnerClassExercise02 {
    public static void main(String[] args) {
        //测试手机类的闹钟功能，通过匿名内部类（对象）作为参数，打印：懒猪起床了
        //再传入另外一个匿名内部类（对象），打印：小伙伴出门了
        Cellphone cellphone = new Cellphone();
        /*1、传递的是实现了Bell接口的匿名内部类
        * 2、重写了ring方法
        * 3、Bell bell = new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        }*/
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴出门了");
            }
        });
    }
}
//铃声接口Bell,里面有个ring方法
interface Bell {//接口
    void ring();
}
//手机类Cellphone，有闹钟功能alarmClock，参数是Bell类型
class Cellphone{//类
    public void alarmClock(Bell bell){//形参是接口类型
        System.out.println(bell.getClass());//InnerClassExercise02$2
        bell.ring();//动态绑定
    }
}

