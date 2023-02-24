package com.basic.www.chapter14.list_;

import java.util.ArrayList;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-24 16:50
 */
public class ArrayListSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //使用无参构造器创建ArrayList对象
        ArrayList al = new ArrayList();
        //使用for循环给al集合添加1-10数据
        for (int i = 0; i <= 10; i++) {
            al.add(i);
        }
        //使用for循环给al集合添加1-15数据
        for (int i = 0; i <= 15; i++) {
            al.add(i);
        }
        al.add(100);
        al.add(200);
        al.add(null);
        for (Object obj : al) {
            System.out.println(obj);
        }

    }
}
