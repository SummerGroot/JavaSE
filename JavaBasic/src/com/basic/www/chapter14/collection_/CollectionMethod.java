package com.basic.www.chapter14.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 14:34
 */
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //创建ArrayList
        List list = new ArrayList();
        //add 添加单个元素
        list.add("jack");
        list.add(10);//自动装箱 listadd(new Integer(10))
        list.add(true);
        System.out.println("list=" + list);//list=[jack, 10, true]
        //remove：删除指定元素
        //list.remove(0);//删除第一个元素
        list.remove("jack");//删除指定元素
        System.out.println("list=" + list);//list=[10, true]
        //contains:查找元素是否存在
        System.out.println(list.contains("jack"));//F
        //size：获取元素个数
        System.out.println(list.size());//2
        //isEmpty：判断是否为空
        System.out.println(list.isEmpty());//F
        //clear：清空
        list.clear();
        //addAll：添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演绎");
        list.addAll(list2);
        System.out.println("list=" + list);
        //containsAll：查找多个元素是否都存在
        System.out.println(list.containsAll(list2));//T
        //removeAll：删除多个元素
        list.add("聊斋");
        list.removeAll(list2);
        System.out.println("list=" + list);//list=[聊斋]
    }
}
