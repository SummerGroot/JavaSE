package com.basic.www.chapter14.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 15:33
 */
public class CollectionFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        //增强for
        /*
        * 增强for，底层仍然是迭代器*/
        for(Object book: col) {
            System.out.println("book = " + book);
        }
    }
}
