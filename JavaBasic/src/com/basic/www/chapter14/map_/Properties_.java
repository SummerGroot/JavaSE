package com.basic.www.chapter14.map_;

import java.util.Properties;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-07 12:28
 */
public class Properties_ {
    public static void main(String[] args) {
        /*
         * Properties 继承Hashtable
         * 可以通过k-v存放数据，k-v不能为null*/
        //增加
        Properties properties = new Properties();
        properties.put("john", 100);//K-V
        //properties.put(null,100);//抛出空指针异常
        //properties.put("john",null);//抛出空指针异常
        properties.put("lucy", 100);
        properties.put("james", 100);
        properties.put("james", 37);//替换
        System.out.println("properties" + properties);//properties{james=37, john=100, lucy=100}
        //通过key获取对应的值
        System.out.println(properties.get("james"));//37
        //tring getProperty(String key)：获取指定属性名的属性值，底层是通过Map的get(Object key)来实现
        System.out.println(properties.getProperty("james"));//null
        //删除
        properties.remove("lucy");
        System.out.println("properties" + properties);
        //修改
        properties.put("james", "詹姆斯");
        System.out.println("properties" + properties);

    }
}
