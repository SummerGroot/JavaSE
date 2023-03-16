package com.basic.www.chapter17.method;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-16 16:42
 */
public class ThreadMethod02 {
    public static void main(String[] args) {
        /*
         * mian线程创建一个子线程，每隔1秒输出hello，输出20次，主线程每隔1秒，输出hi，输出20次。
         * 要求：两个线程同时执行，当主线程输出5次后，就让子线程运行完毕，主线再执行*/
        T2 t2 = new T2();
        t2.start();
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "线程输出第" + i + "个\thi");
                if (i == 5) {
                    System.out.println("主线程让子线程先输出");
                    //join线程插队，一定成功
                    //t2.join();//相当于让t2线程先执行
                    Thread.yield(); //yield礼让，不一定成功
                    System.out.println("子线程输出完毕，主线程接着输出");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);//休眠1秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "线程输出第" + i + "个\thello");
        }
    }
}
