package com.basic.www.chapter23.reflection_;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-11 17:55
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }

    @Test
    //第一组API
    public void api_01() throws ClassNotFoundException {
        //得到Class对象
        Class<?> cls = Class.forName("com.basic.www.chapter23.reflection_.Person");
        //getNanme：获取全类名
        System.out.println(cls.getName());//com.basic.www.chapter23.reflection_.Person
        //getSimpleName：获取简单类名
        System.out.println(cls.getSimpleName());//Person
        //getFields：获取所有public修饰的属性，包含本类以及父类的
        Field[] fields01 = cls.getFields();
        for (Field field : fields01) {//增强for循环
            System.out.println("本类即父类的public属=" + field.getName());
        }
        //getDeclaredFields()：获取本类中所有属性
        Field[] fields02 = cls.getDeclaredFields();
        //getMethods()：获取所有public修饰的方法，包含本类以及父类的
        //getDeclaredMethods()：获取本类中所有方法
        //getConstructors()：获取所有public修饰的构造器，包含本类以及父类的
        //getDeclaredConstructors()：获取本类中所有构造器
        //getPackage()：以Package形式返回包信息
        //getSuperClass()：以Class形式返回父类信息
        //getInterfaces()：以Class[]形式返回接口信息
        //getAnnotations()：以Annotation[]形式返回注解信息

    }

    @Test
    public void api_02() throws ClassNotFoundException {
        //得到Class对象
        Class<?> cls = Class.forName("com.basic.www.chapter23.reflection_.Person");
        Field[] fields01 = cls.getDeclaredFields();
        for (Field field : fields01) {
            System.out.println("本类属性名=" + field.getName()
                    + "\t该属性的修饰符值=" + field.getModifiers()
                    + "\t该属性的类型=" + field.getType());
        }
    }

    @Test
    public void api_03() throws ClassNotFoundException {
        //得到Class对象
        Class<?> cls = Class.forName("com.basic.www.chapter23.reflection_.Person");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("本类所有方法=" + method.getName()
                    + "\t方法的修饰符=" + method.getModifiers()
                    + "\t方法的返回值类型=" + method.getReturnType());
            //输出当前这个方法形参数组情况
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的形参类型=" + parameterType);
            }
        }


    }
}

class A {
    public String hobby;
}

interface IA {

}

interface IB {

}

@Deprecated
class Person extends A implements IA, IB {
    //属性
    public String name;
    protected int age;
    String job;
    private double sal;

    //方法
    public void m1(String name, int age, double sal) {
    }

    protected void m2() {
    }

    void m3() {
    }

    private void m4() {
    }
}
