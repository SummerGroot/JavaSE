package com.basic.www.chapter17.ticket;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-16 10:35
 */
public class SellTicket {
    public static void main(String[] args) {
        //测试
        /*SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();
        sellTicket01.start();//启动售票线程
        sellTicket02.start();
        sellTicket03.start();*/
        System.out.println("===使用接口的方式来售票===");
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();//第1个线程
        new Thread(sellTicket02).start();//第2个线程
        new Thread(sellTicket02).start();//第3个线程


    }
}

//使用Thread方式
class SellTicket01 extends Thread {
    //模拟三个售票窗口100，分别使用Thread和实现Runnable方式
    //使用多线程，模拟三个窗口同时售票100张
    private static int ticketNum = 100;//让多个线程共享ticketNum

    @Override
    public void run() {
        while (true) {
            //三个线程同时进入就会出现超卖
            if (ticketNum <= 0) {
                System.out.println("票已售罄");
                break;
            }
            //休眠50毫秒,模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口\t" + Thread.currentThread().getName() + "售出一张票" + "\t剩余票数" + (--ticketNum));
        }
    }
}

//实现接口的方式
class SellTicket02 implements Runnable {
    private int ticketNum = 100;//让多个线程共享ticketNum

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("票已售罄,欢迎下次再来！！！");
                break;
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
}

