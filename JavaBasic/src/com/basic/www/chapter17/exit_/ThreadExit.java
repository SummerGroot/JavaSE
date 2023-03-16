package com.basic.www.chapter17.exit_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-16 15:27
 */
public class ThreadExit {
    public static void main(String[] args) {
        //启动一个线程t，要求在main线程中去停止线程t。
        T t1 = new T();
        t1.start();
        //希望mian线程去控制t1线程的终止，必须可以修改loop变量
        //让t1退出run方法，从而终止t1线程->通知方式
        //让main线程休眠10秒，再通知t1线程退出
        System.out.println("main线程休眠5秒");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t1.setLoop(false);
        System.out.println(Thread.currentThread().getName() + "线程退出");
    }
}

class T extends Thread {
    int count = 0;
    //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);//让线程休眠50毫秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "\t线程运行中" + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
