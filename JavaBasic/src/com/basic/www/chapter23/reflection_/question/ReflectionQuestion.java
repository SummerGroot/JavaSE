package com.basic.www.chapter23.reflection_.question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-07 16:13
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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
        System.out.println("o的运行类型是=" + o.getClass());
        //通过cls得到加载的类com.basic.www.chapter23.reflection_.question.Cat的methodName"hi"的方法对象
        //即：在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = cls.getMethod(method);
        //通过method1调用方法,即通过方法对象调用方法
        method1.invoke(o);//invoke---调用
        //传统方法对象.方法(),反射机制 方法.invoke(对象);
    }
}
