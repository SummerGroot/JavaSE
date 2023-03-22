package com.basic.www.chapter17.method;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-16 16:57
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        /*
         * 1、主线程每隔1秒，输出hi，一共10次
         * 2、当输出到hi 5时，启动子线程（要求实现Runnable），每隔1秒输出hello，等该线程输出10次hello后，退出
         * 3、主线程继续输出hi，直到主线程退出
         */
        //创建子线程
        Thread t3 = new Thread(new T3());
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i + "\t次hi");
            Thread.sleep(1000);
            if (i == 5) {
                //主线程输出了5次hi，让子线程输出
                System.out.println("主线程让子线程输出");
                t3.start();//启动子线程 输出hello
                t3.join();//立即t3子线程插入到主线程，让t3先执行
                System.out.println("子线程输出完毕");
            }
        }
    }
}

class T3 implements Runnable {
    @Override
    public void run() {
        //子线程输出10次hello
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i + "\t次hello");
            //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
