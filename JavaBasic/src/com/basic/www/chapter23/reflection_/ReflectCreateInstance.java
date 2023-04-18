package com.basic.www.chapter23.reflection_;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-13 10:06
 */
public class ReflectCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
     //通过反射创建某类的对象，要求该类中必须有public的无参构造
        //1、获取User类的Class对象
        Class<?> usercls = Class.forName("com.basic.www.chapter23.reflection_.User");
        //2、通过public的无参构造器创建实例
        Object o = usercls.newInstance();
        System.out.println(o);
        //3、通过public的有参构造器创建实例
        /*
        constructor对象就是
        public User(String name){//public 有参构造器
            this.name = name;
        }*/
        /*
        * 1、先得到对应的构造器
        * 2、创建实例，并传入形参*/
        Constructor<?> constructor = usercls.getConstructor(String.class);
        Object o1 = constructor.newInstance("jack");
        System.out.println(o1);
        //4、通过private的有参构造器创建实例
        //得到private的构造器对象
        Constructor<?> constructor01 = usercls.getDeclaredConstructor(int.class, String.class);
        //创建实例
        constructor01.setAccessible(true);//爆破(暴力破解)，使用反射可以访问private构造器。
        Object o2 = constructor01.newInstance(99, "张三");
        System.out.println(o2);

    }
}
class User{//User类
    private int age =10;
    private String name= "summer";
    public User(){
        //无参构造器
    }
    public User(String name){//public 有参构造器
        this.name = name;
    }
    private User(int age, String name) {//private 有参构造器
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}