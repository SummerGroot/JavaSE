package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 15:39
 */
public class InterfaceDetail01 {
    public static void main(String[] args) {
        //IA ia = new IA();
    }
}
interface IA{
    //接口不能被实例化
    //接口中所有的方法是public方法，接口中抽象方法，可以不用abstract修饰
    void say();
    //一个普通类实现接口，就必须将该接口的所有方法都实现。
    void hi();

}
class Cat implements IA{
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
abstract class Tiger implements IA{}