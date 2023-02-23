package com.basic.www.chapter14.collection_;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 14:02
 */
public class Collection_ {
    public static void main(String[] args) {
        //Collection
        //Map
        /*
         * 1、集合主要是两组（单列集合，双列集合）
         * 2、Collection接口有两个重要的子接口 list set，他们的实现子类都是单列集合
         * Map接口的实现子类 是双列集合，存放的K-V*/
        ArrayList arraylist = new ArrayList();
        arraylist.add("jack");
        arraylist.add("tom");
        HashMap hashmap = new HashMap();
        hashmap.put("no1","北京");
        hashmap.put("no2","上海");
    }
}
