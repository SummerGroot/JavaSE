package com.basic.www.chapter23.reflection_;

import com.basic.www.chapter23.reflection_.question.Cat;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-10 16:24
 */
public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        //测试反射调用的性能，和优化方案
        m1();
        m2();
        m3();
    }
    @Test
    //传统方法调用hi方法
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法调用hi方法消耗时间为=" + (end - start));//传统方法调用hi方法消耗时间为=2
    }
    @Test
    //反射机制调用hi方法
    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.basic.www.chapter23.reflection_.question.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("映射调用hi方法消耗时间为=" + (end - start));//映射调用hi方法消耗时间为=14
    }

    //反射调用优化+关闭检查
    public static void m3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.basic.www.chapter23.reflection_.question.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);//反射调用方法时，取消检查
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("映射优化后调用hi方法消耗时间为=" + (end - start));//映射优化后调用hi方法消耗时间为=14
    }

}
