package com.basic.www.chapter23.reflection_;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-10 16:14
 */
public class Reflection01 {
    public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //使用Propeties类，读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("G:\\IDEA\\JavaStudy\\JavaSE\\JavaBasic\\src\\re.properties"));
        String classfullpath = properties.getProperty("classfullpath");
        String method = properties.getProperty("method");
        //System.out.println(classfullpath);
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + method);
        //反射机制
        //加载类，返回Class类型的对象cls
        Class cls = Class.forName(classfullpath);
        //通过cls得到你加载的类 com.basic.www.chapter23.reflection_.question.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o="+o);
        //注：newInstance()方法内部实际上嗲用了无参构造器，必须包装无参构造器的存在才可以。
        System.out.println("o的运行类型是=" + o.getClass());
        //通过cls得到加载的类com.basic.www.chapter23.reflection_.question.Cat的methodName"hi"的方法对象
        //即：在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = cls.getMethod(method);
        //通过method1调用方法,即通过方法对象调用方法
        method1.invoke(o);//invoke---调用
        //传统方法对象.方法(),反射机制 方法.invoke(对象);
        //Field，得到Name字段
        //getField不能得到私有的属性
        Field age = cls.getField("age");
        System.out.println("age="+age.get(o));//反射成员变量对象.get(对象)
        Constructor constructor = cls.getConstructor();//()中可以指定构造器参数类型，返回的是无参构造器
        System.out.println(constructor);//public com.basic.www.chapter23.reflection_.question.Cat()
        Constructor constructor1 = cls.getConstructor(String.class);//传入的是String.class就是String的class对象
        System.out.println(constructor1);//public com.basic.www.chapter23.reflection_.question.Cat(java.lang.String)

    }
}
