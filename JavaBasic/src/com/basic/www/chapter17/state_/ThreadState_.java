package com.basic.www.chapter17.state_;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-03-22 16:16
 */
public class ThreadState_ {
    public static void main(String[] args) {
        T t = new T();
        t.setName("鲁班");
        System.out.println(t.getName() + "\t状态\t" + t.getState());
        t.start();
        while (Thread.State.TERMINATED != t.getState()) {//t线程没有终止就打印
            System.out.println(t.getName() + "\t状态\t" + t.getState());
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(t.getName() + "\t状态\t" + t.getState());
    }
}

//线程状态
class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\thi" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
        }
    }
}
