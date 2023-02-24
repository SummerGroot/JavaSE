package com.basic.www.chapter14.list_;

import java.util.ArrayList;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-24 14:48
 */
public class ArrayListDetail {
    public static void main(String[] args) {
        //ArrayList 是线程不安全的，没有synchronized
        /*public boolean add(E e) {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }*/
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        System.out.println(arrayList);//[null, jack, null]
    }
}

