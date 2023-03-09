package com.basic.www.chapter15.customizationgeneric;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-09 13:50
 */
public class CoustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

//自定义泛型接口
interface IUsb<U, R> {
    int n = 10;

    //U name;//不能这样使用
    //普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //在jdk8中，可以在接口中，使用默认方法
    default R method(U u) {
        return null;
    }
}

//在继承接口时， 指定泛型接口的类型
//当我们去实现IA接口时，IA在继承IUsb接口时，指定了U为String，R为Double
//在实现IUsb方法时，使用String替换U，Double替换R
interface IA extends IUsb<String, Double> {

}

class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

//实现接口时，直接指定泛型接口的类型
//给U 指定了Integer，R指定了Float
//当我们实现IUsb方法时，使用Integer替换U，Float替换R
class BB implements IUsb<Integer, Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}

//没有指定类型，默认为Object
class CC implements IUsb {//等价 class CC implements IUsb<Object,Object>{}

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}