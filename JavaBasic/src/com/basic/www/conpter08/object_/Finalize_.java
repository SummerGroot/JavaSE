package com.basic.www.conpter08.object_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-13 16:18
 */
//演示finalize使用
public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw = null;
        //car对象就是一个垃圾，垃圾回收器就会回收（销毁）。
        //在销毁对象前，会调用该对象的finalize()方法
        //可以在finalize写业务逻辑代码（比如释放资源：数据库连接，打开文件。。。）
        //如果不重写finalize方法，那么就会调用Object类的finalize()方法。即默认处理
        //如果重写了finalize方法，就可以实现自己的逻辑
        System.gc();
        //主动调用垃圾回收器
        System.out.println("程序退出了.....");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    //重写finalize
    protected void finalize() throws Throwable {
        System.out.println("我们销毁汽车" + name);
        System.out.println("释放了某些资源");
    }
}
