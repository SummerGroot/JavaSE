package com.basic.www.chapter10.final_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 10:46
 */
public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        new EE().cal();
    }
}

class AA {
    public final double TAX_RATE = 0.08;//定义时
    public final double TAX_RATE02;
    public final double TAX_RATE03;

    public AA() {
        TAX_RATE02 = 1.1;//构造器
    }

    {
        TAX_RATE03 = 9.9;//代码块
    }
}

class BB {
    public static final double B = 9.99;//定义时
    public static final double BBBB;

    static {
        BBBB = 9.98;//静态代码块中
    }
}
//final类不能继承，但是可以实例化对象
final class CC{

}
class DD {
    public final void cal(){
        System.out.println("cal方法");
    }
}
class EE extends DD{

}