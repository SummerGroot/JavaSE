package com.basic.www.chapter14.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-01 16:29
 */
public class HashSet_ {
    public static void main(String[] args) {
        /*
        * 1、
        * public HashSet() {
            map = new HashMap<>();
        }
        * 2、HashSet可以存放空值，但是只能有一个null，元素不能重复。
        * */
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);

        System.out.println("hashSet = " + hashSet);//hashSet = [null]
    }
}
