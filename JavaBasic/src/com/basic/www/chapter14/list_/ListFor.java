package com.basic.www.chapter14.list_;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-24 14:16
 */
public class ListFor {
    public static void main(String[] args) {
        //List接口的实现子类Vector LinkedList
        //List list = new ArrayList();
        //List list = new Vector();
        List list = new LinkedList();
        list.add("jack");
        list.add("tom");
        list.add("夏源");
        list.add("冒菜");
        //遍历
        //iterator
        System.out.println("====迭代器=====");
        Iterator iterator = list.iterator();//获取迭代器方法
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
        //增强for
        System.out.println("====增强for=====");
        for (Object o : list) {
            System.out.println("o=" + o);
        }
        //普通for循环
        System.out.println("====普通for循环=====");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象=" + list.get(i));
        }
    }
}
