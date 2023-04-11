package com.basic.www.chapter23.class_;

import java.io.Serializable;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-11 16:51
 */
public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> cls01 = String.class;//外部类
        Class<Serializable> cls02 = Serializable.class;//接口
        Class<Integer[]> cls03 = Integer[].class;
        Class<float[][]> cls04 = float[][].class;
        Class<Deprecated> cls05 = Deprecated.class;
        Class<Thread.State> cls06 = Thread.State.class;
        Class<Void> cls07 = void.class;
        Class<Class> cls08 = Class.class;

        System.out.println(cls01);
        System.out.println(cls02);
        System.out.println(cls03);
        System.out.println(cls04);
        System.out.println(cls05);
        System.out.println(cls06);
        System.out.println(cls07);
        System.out.println(cls08);
    }
}
