package com.basic.www.chapter23.reflection_;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-13 10:48
 */
public class ReflectAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //得到Boss类对应的Class对象
        Class<?> cls = Class.forName("com.basic.www.chapter23.reflection_.Boss");
        //创建对象
        Object o = cls.newInstance();
        //调用public的hi方法
        Method hi = cls.getDeclaredMethod("hi", String.class);
        //调用
        hi.invoke(o, "夏天");
        //调用private static方法
        //得到say方法对象
        Method say = cls.getDeclaredMethod("say", int.class, String.class, char.class);
        //因为say方法是private，需要爆破
        say.setAccessible(true);
        System.out.println(say.invoke(o, 100, "张三", 'm'));
        //因为say方法是static
        System.out.println(say.invoke(null, 20, "李四", 'm'));
        //在反射中，如果方法有返回值，统一返回Object
        Object reVal = say.invoke(null, 300, "王五", 'm');
        System.out.println("reVal的运行类型=" + reVal.getClass());//String
    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + "\t" + s + "\t" + c + "\t";
    }

    public void hi(String s) {
        System.out.println("hi" + s);
    }
}
