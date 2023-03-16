package com.basic.www.chapter17.threaduse;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-16 9:15
 */
public class Thread03 {
    public static void main(String[] args) {
        //main线程启动两个子线程
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);//第一个线程
        Thread thread2 = new Thread(t2);//第二个线程
        thread1.start();
        thread2.start();
    }
}

class T1 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            //每隔1秒钟输出“hello world”，输出10次
            System.out.println("hello world" + (++count) + "\t" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10) {
                break;
            }
        }
    }
}

class T2 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            //每隔1秒钟输出“hi”，输出5次
            System.out.println("hi" + (++count) + "\t" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 5) {
                break;
            }
        }
    }
}