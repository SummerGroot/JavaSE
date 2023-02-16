package com.basic.www.chapter10.interface_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 16:48
 */
public class InterfaceExercise02 {
    public static void main(String[] args) {

    }
}

interface AE02 { // 1min 看看
    int x = 0;
} //想到 等价 public static final int x = 0;

class BE02 {
    int x = 1;
} //普通属性

class CE02 extends BE02 implements AE02 {
    public void pX() {
//System.out.println(x); //错误，原因不明确 x
        //可以明确的指定 x
        //访问接口的 x 就使用 A.x
        //访问父类的 x 就使用 super.x
        System.out.println(AE02.x + " " + super.x);
    }

    public static void main(String[] args) {
        new CE02().pX();
    }
}
