package com.basic.www.chapter23.class_;

import com.basic.www.chapter23.reflection_.question.Cat;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-10 16:46
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
    //Class类对象不是new出来的，是系统创建的
        //传统new对象
        /*ClassLoader类
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            return loadClass(name, false);
        }*/
        //Cat cat = new Cat();
        //反射方式
        /*ClassLoader类，仍然是通过ClassLoader类加载Cat类的Class对象
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            return loadClass(name, false);
        }*/
        Class cls01 = Class.forName("com.basic.www.chapter23.reflection_.question.Cat");
        Class cls02 = Class.forName("com.basic.www.chapter23.reflection_.question.Cat");
        System.out.println(cls01.hashCode());//225534817
        System.out.println(cls02.hashCode());//225534817
        Class cls03 = Class.forName("com.basic.www.chapter23.class_.Dog");
        System.out.println(cls03.hashCode());//1878246837

    }
}
