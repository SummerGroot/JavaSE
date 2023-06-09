package com.basic.www.chapter17.threaduse;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-14 17:42
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start();
        //这里不能调用start
        //创建Thread对象，把dog对象（实现Runnable），放入Thread
        Thread thread = new Thread(dog);
        thread.start();


        Tiger tiget = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiget);
        threadProxy.start();

    }
}

class Animal {
}

class Tiger extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("老虎叫。。。");
    }
}

//线程代理类，模拟了一个极简的Thread类
class ThreadProxy implements Runnable {//可以把Proxy类当作ThreadProxy
    private Runnable target = null;//属性，类型是Runnable

    @Override
    public void run() {
        if (target != null) {
            target.run();//动态绑定（运行类型Tiger）
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();//这个方法是真正实现多线程的方法
    }

    public void start0() {
        run();
    }
}

//通过实现接口Runnable来开发线程
class Dog implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("火锅在叫。。。" + (++count) + Thread.currentThread().getName());

            //休眠1秒
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
