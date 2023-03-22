package com.basic.www.chapter17.synchronized_;

import sun.font.TrueTypeFont;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-03-22 17:32
 */
public class DeadLock_ {
    public static void main(String[] args) {
        //死锁
        DeadLockDemo A = new DeadLockDemo(true);
        A.setName("A线程");
        DeadLockDemo B = new DeadLockDemo(false);
        B.setName("B线程");
        A.start();
        B.start();
    }
}

class DeadLockDemo extends Thread {
    static Object o1 = new Object();//保证多线程，共享一个对象，这里使用static
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {//构造器
        this.flag = flag;
    }

    @Override
    /*
     * 1、如果flag为T，线程A就会先得到o1对象锁，然后尝试获取o2对象锁
     * 2、如果线程A得不到o2对象锁，就会Bloacked
     * 3、如果flag为F，线程B 就会得到o2对象锁，然后尝试获取o1对象锁
     * 4、如果线程B得不到o1对象锁，就会Bloacked*/
    public void run() {
        if (flag) {
            synchronized (o1) {//对象互斥锁，下面就是同步代码
                System.out.println(Thread.currentThread().getName() + "\t进入1");
            }
            synchronized (o2) {//这里获得li对象的监视权
                System.out.println(Thread.currentThread().getName() + "\t进入2");
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "\t进入3");
            }
            synchronized (o1) {//这里获得li对象的监视权
                System.out.println(Thread.currentThread().getName() + "\t进入4");
            }
        }
    }
}
