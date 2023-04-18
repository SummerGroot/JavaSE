package com.basic.www.chapter23.reflection_;

import java.lang.reflect.Field;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-13 10:32
 */
public class ReflectAccessField {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1、得到Student类的Class对象
        Class<?> stucls = Class.forName("com.basic.www.chapter23.reflection_.Student");
        //2、创建对象
        Object o = stucls.newInstance();//o的运行类型是Student
        System.out.println(o.getClass());//Student
        //3、使用反射得到age属性对象
        Field age = stucls.getField("age");
        age.set(o, 88);//通过反射来操作属性
        System.out.println(o);
        System.out.println(age.get(o));//返回age属性的值
        //4、使用反射操作name属性

        Field name = stucls.getDeclaredField("name");
        //对name进行爆破,可以操作private属性
        name.setAccessible(true);
        name.set(o, "夏天");
        //name.set(null, "夏天");//name是static属性，因此o可以写成null
        System.out.println(o);
        System.out.println(name.get(o));//获取属性值
        System.out.println(name.get(null));//要求name是static
    }
}

class Student {
    public int age;
    private static String name;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                "\tname=" + name +
                '}';
    }
}
