package com.basic.www.chapter17.homework;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2023-03-22 20:05
 */
public class HomeWork01 {
    public static void main(String[] args) {
        /*
        1、在main方法中启动两个线程
        2、第一个线程循环打印100以内的整数
        3、直到第2个线程从键盘读取了"Q"命令
        */
        A01 a01 = new A01();
        B01 b01 = new B01(a01);//一定要注意
        a01.start();
        b01.start();

    }
}

class A01 extends Thread {
    //通知方式停止线程
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            //1-100整数
            System.out.println(Thread.currentThread().getName() + "\t" + (int) (Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("A线程退出");
    }
}

class B01 extends Thread {
    private A01 a01;
    Scanner scanner = new Scanner(System.in);

    public B01(A01 a01) {
        this.a01 = a01;
    }

    @Override
    public void run() {

        while (true) {
            //接收到用户输入
            System.out.println("请输入你指令(Q)表示退出:");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                //以通知的方式结束A线程
                a01.setLoop(false);
                System.out.println("B线程退出");
                break;
            }
        }
    }
}