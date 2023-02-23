package com.basic.www.chapter14.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 17:39
 */
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        //1. void add(int index,Object ele)：在index位置插入ele元素。
        list.add("张三丰");
        list.add("贾宝玉");
        //在index=1的位置插入一个对象
        list.add(1,"summer");
        System.out.println("list" + list);
        //2. boolean addAll(int iondex,Collection eles)：从index位置开始将eles中的所有元素添加进来。
        //3. Object get(int index)：获取指定index位置的元素。
        //4. int indexOf(Object obj)：返回obj在当前集合中首次出现的位置。
        //5. int lastIndexOf(Object obj)：返回obj在当前集合中末次出现的位置。
        //6. Object remove(int index)：移除指定index位置的元素，并返回此元素。
        //7. Object set(int index,Object ele)：设置指定index位置的元素为ele，相当于是替换。
        //8. List subList(int fromIndex,int toIndex)：返回从fromIndex到toIndex位置的子集合。
    }
}
