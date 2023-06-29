package com.basic.www.chapter17.threaduse;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-14 15:14
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //通过继承Tread类创建线程
        //创建Cat对象，可以当作线程使用
        Cat cat = new Cat();
        /*
        * 1、
        public synchronized void start() {
            start0();
        }
        2、
        * start0();是本地方法，是JVM调用，底层是C/C++实现
        * 真正实现多线程的效果，是start0（），而不是run()方法
        private native void start0();
         */
        cat.start();//启动线程---->最终会执行Cat的run方法

        //cat.run();//run方法就是一个普通方法，并没有真正的启动一个线程，就会把run方法执行完毕才向下执行
        //当main线程启动一个子线程 Thread-0，主线程不会阻塞，会继续执行。
        //这时，主线程和子线程是交替执行。
        System.out.println("主线程继续执行" + Thread.currentThread().getName());//名字main
        for (int i = 0; i < 60; i++) {
            System.out.println("主线程 i" + i);
            //让主线程休眠
            Thread.sleep(1000);
        }

    }
}
/*
* 1、当一个类继承了Thread类，该类就可以当作线程使用
* 2、会重写run方法，写上自己的业务代码
* 3、Thread类实现了Runnable接口的run方法
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
*/

class Cat extends Thread {
    @Override
    public void run() {//重写Thread的run方法，写上自己的业务逻辑

        int times = 0;
        while (true) {
            //开启一个线程，该线程每隔1秒。在控制台输出“喵喵，我是小猫咪”
            System.out.println("喵喵，我是小猫咪" + (++times) + "\t线程名=" + Thread.currentThread().getName());
            //让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80) {
                //当times 到80 就退出while循环，线程也就退出
                break;
            }
        }
    }
}