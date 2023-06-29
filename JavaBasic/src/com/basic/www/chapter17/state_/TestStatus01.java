package com.basic.www.chapter17.state_;

/**
 * @Auther : Summer
 * @Classname TestStatus01
 * @Description
 * @Date 2023/6/26 15:19
 * @Created by Summer
 * @Version: 1.0
 */
public class TestStatus01 {
    public static void main(String[] args) {
        T01 t01 = new T01();
        T01 t02 = new T01();
        t01.setName("子线程1");
        t02.setName("子线程2");
        t01.start();
        t02.start();
    }
}

class T01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
