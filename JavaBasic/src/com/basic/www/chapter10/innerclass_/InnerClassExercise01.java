package com.basic.www.chapter10.innerclass_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-17 13:15
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {
        //匿名内部类当作实参直接传递。
        f1(new IC(){
            @Override
            public void show() {
                System.out.println("匿名内部类当作实参直接传递");
            }
        });
        //传统方式
        //f1(new ID());
    }

    //静态方法，形参时接口类型
    public static void f1(IC ic) {
        ic.show();
    }
}
//接口
interface IC {
    void show();
}

//类实现IB
class ID implements IC {
    @Override
    public void show() {
        System.out.println("传统方式");
    }
}
