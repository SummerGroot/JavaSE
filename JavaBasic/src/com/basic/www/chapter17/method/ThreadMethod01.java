package com.basic.www.chapter17.method;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-16 16:19
 */
public class ThreadMethod01 {
    public static void main(String[] args) {
        //测试相关方法
        T t = new T();
        t.setName("summer");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();//启动子线程

        //main线程打印5个hi，然后就中断子线程的休眠
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);//休眠1秒
                System.out.println("hi" + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(t.getName() + "\t线程优先级=" + t.getPriority());//summer	线程优先级=1
        t.interrupt();//当执行到这里时就会中断t线程的休眠
    }
}

class T extends Thread {//自定义的线程类 继承了Thread

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                //Thread.currentThread().getName()获取当前线程的名称
                System.out.println(Thread.currentThread().getName() + "吃包子~~~~" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中~~~~");
                Thread.sleep(20000);//休眠20秒
            } catch (InterruptedException e) {
                //当线程执行到一个interrupt方法时，就会catch一个异常，可以加入自己的业务代码
                //InterruptedException是铺货一个中断异常
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }
        }
    }
}
