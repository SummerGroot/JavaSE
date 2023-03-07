package com.basic.www.chapter14.map_;

import java.util.HashMap;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-07 11:37
 */
public class HashMapSource02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            //hashMap.put(new A(i), "hello");
            hashMap.put(i,"hello");
        }
        hashMap.put("aaa", "bbb");
        System.out.println("hashMap = " + hashMap);//12 k-v
    }
}

class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

/*    @Override
    //所有的A对象的hashCode都是100
    public int hashCode() {
        return 100;
    }*/

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}
