package com.basic.www.chapter23.class_;

import java.lang.reflect.Field;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-11 16:09
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //Car类的全路径
        String classAllPath = "com.basic.www.chapter23.class_.Car";
        //获取到Car类的Class对象
        //<?>表示不确定的Java类型
        Class<?> cls = Class.forName(classAllPath);
        //输出cls
        System.out.println(cls);//显示cls，是哪个类的Class对象 com.basic.www.chapter23.class_.Car
        System.out.println(cls.getClass());//输出cls运行类型 java.lang.Class
        //得到包名
        System.out.println(cls.getPackage().getName());//com.basic.www.chapter23.class_
        //得到类名
        System.out.println(cls.getName());//com.basic.www.chapter23.class_.Car
        //通过cls创建对象实例
        Object o = cls.newInstance();
        Car car = (Car)o;
        System.out.println(car);//Car{brand='宝马', price=5500000, color='黑色'}
        //通过反射获取属性
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));//宝马
        //通过反射给属性赋值
        brand.set(car,"奔驰");
        System.out.println(brand.get(car));
        //遍历得到所有的属性
        Field[] fields = cls.getFields();
        for(Field f :fields){
            System.out.println(f.getName());//名称
        }
    }
}
