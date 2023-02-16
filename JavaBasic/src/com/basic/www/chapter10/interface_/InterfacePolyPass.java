package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 16:39
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        //多态传递现象
        //接口类型的变量可以指向，实现了该接口的类的对象的实例
        IG ig = new Teacher();
        /*
        *如IG继承了IH接口，而Teacher类实现了IG接口
        *那么，实际上就相当于Teacher类也实现了IH接口
        * 这就是所谓的接口多态传递现象。 */
        IH ih = new Teacher();
    }
}

interface IH {

}

interface IG extends IH {
}

class Teacher implements IG {
}