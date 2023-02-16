package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 15:51
 */
public class InterfaceDetail02 {
    public static void main(String[] args) {
        //接口中属性是public static final
        System.out.println(IB.n1);//说明n1是static
        //IB.n1=1000;
        //说明n1是final
    }
}
interface IB{
    //接口中的属性，只能是final的，而且是public static final修饰符。
    int n1 =100;//等价 public static final int n1 = 100;
    void say();
}
interface IC{
    void hi();
}
//一个接口不能继承其他的类，但是可以继承多个别的接口。
interface ID extends IC,IB{

}
//接口的修饰符只能是public和默认，这点和类的修饰符是一样的.
interface IE{}
class Pig implements IB,IC{
    //一个类同时可以实现多个接口。
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
