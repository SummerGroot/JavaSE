package com.basic.www.chapter17.method;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-03-22 15:17
 */
public class ThreadMethod03 {
    public static void main(String[] args) {
        MyDaemonTread myDaemonTread = new MyDaemonTread();
        //希望当主线程结束后，子线程可以自动退出
        //把子线程设为守护线程
        //先设置为守护线程，再启动
        myDaemonTread.setDaemon(true);
        myDaemonTread.start();
        for (int i = 0; i < 10; i++) {//main主线程
            System.out.println("宝强不知青" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyDaemonTread extends Thread {
    @Override
    public void run() {
        for (; ; ) {//无限循环
            try {
                Thread.sleep(50);//休眠50毫秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("pgone&马蓉在开房");
        }
    }
}
