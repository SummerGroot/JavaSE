package com.basic.www.chapter08.object_;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-13 14:12
 */
public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);//?true
        System.out.println(b == c);//?true
        B bObj = a;
        System.out.println(bObj == c);//?true
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);//基本数据类型

        //equals方法，源码怎么查看
        //"hello".equals("123");
        /*
        JDK String类的equals方法 源码
        把Object的equals方法重写了，变成了比较两个字符串的值是否相等
        public boolean equals(Object anObject) {
        if (this == anObject) {//如果是同一个对象
            return true;//返回true
        }
        if (anObject instanceof String) {//判断类型
            String anotherString = (String)anObject;//向下转型
            int n = value.length;
            if (n == anotherString.value.length) {//如果长度相同
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {//一个一个比较字符
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;//如果两个字符串都相等，则返回true
            }
        }
        return false;
        }*/
        //Object类的equals方法
        /*
        默认比较对象地址是否相同
        也就是判断两个对象的是不是同一个对象
        public boolean equals(Object obj) {
            return (this == obj);
        }
        */
        /*
        Integer 也重写了equals方法，判断两个值是否相等
        public boolean equals(Object obj) {
            if (obj instanceof Integer) {
                return value == ((Integer)obj).intValue();
            }
            return false;
        }
        */
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);
        System.out.println((i1 == i2));//false
        System.out.println(i1.equals(i2));//true


    }
}

class B {
}

class A extends B {

}
