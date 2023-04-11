package com.basic.www.chapter23.class_;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-11 16:30
 */
public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        //演示得到Class对象的各种方式
        //Class.forName()
        String classfullPath = "com.basic.www.chapter23.class_.Car";//通过读取配置文件获取
        Class cls = Class.forName(classfullPath);
        System.out.println(cls);
        //类名.class  多用与参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);
        //对象.getClass()
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);
        //通过类加载器获取类的Class对象

        //通过类加载器（4种）来获取到类Class对象
        //1、先得到类加载器Car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //2、通过类加载器得到Class对象
        Class cls4 = classLoader.loadClass(classfullPath);
        System.out.println(cls4);
        //cls1-4是同一个对象

        //基本数据类型得到Class类对象
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);//int
        //基本数据类型的包装类
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);//int

        System.out.println(integerClass.hashCode());//225534817
        System.out.println(type.hashCode());//225534817
    }
}
