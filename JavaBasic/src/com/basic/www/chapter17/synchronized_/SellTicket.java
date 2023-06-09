package com.basic.www.chapter17.synchronized_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-16 10:35
 */
public class SellTicket {
    public static void main(String[] args) {
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();//第1个线程
        new Thread(sellTicket03).start();//第2个线程
        new Thread(sellTicket03).start();//第3个线程

    }
}

//实现接口的方式,使用synchronized实现线程同步
class SellTicket03 implements Runnable {
    private int ticketNum = 100;//让多个线程共享ticketNum
    private boolean loop = true;//控制run方法变量
    Object obj = new Object();

    //同步方法是静态的
    /*
    * 1、public synchronized static void m(){} 锁是加在SellTicket03.class
    * 2、如果在静态方法中，实现一个同步代码块*/
    public synchronized static void m(){

    }
    public static void m2(){
        synchronized (SellTicket03.class){}
    }
    /*
     * 1、public synchronized void sell() {}就是一个同步方法
     * 2、这时锁在this对象
     * 3、也可以在代码块上写synchronized 同步代码块，互斥锁还是在this对象*/
    public /*synchronized*/ void sell() {//同步方法，在同一个时刻只能一个线程来执行sell方法
        synchronized (/*this*/obj) {
            if (ticketNum <= 0) {
                System.out.println("票已售罄,欢迎下次再来！！！");
                loop = false;
                return;
            }
            //休眠50毫秒
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口\t" + Thread.currentThread().getName() + "售出一张票" + "\t剩余票数" + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();//sell方法是一个同步方法
        }
    }
}



