package com.basic.www.chapter14.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 17:10
 */
public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List集合类中元素有序（即添加顺序和取出顺序一致）、且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("summer");
        list.add("xy");
        System.out.println("list=" + list);//list=[jack, tom, summer, xy]
        //1. List集合中的每个元素都有其对应的顺序索引，即支持索引。
        //2. 索引是从0开始的
        System.out.println(list.get(2));//summer
    }
}
