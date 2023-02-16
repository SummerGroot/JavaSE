package com.basic.www.chapter10.final_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 10:16
 */
public class Final01 {
    public static void main(String[] args) {
        E e = new E();
        //e.TAX_RATE=0.09;
        System.out.println(e.TAX_RATE);
        A a = new A();
    }
}

//如果要求A类不能被其他类继承，
//使用final修饰A类
final class A {
}

/*class B extends A {
}*/
class C {
    //如果我们要求hi不能被子类重写
    //使用final修饰hi方法
    //public final void hi(){}
}

class D extends C {
   /* @Override
    //重写了C类的hi方法
    public void hi() {
        super.hi();
    }*/
}

class E {
    public final double TAX_RATE = 0.08;
}
