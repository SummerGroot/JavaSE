package com.basic.www.chapter08.object_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-13 15:24
 */
public class HashCode_ {
    public static void main(String[] args) {
        AA aa1 = new AA();
        AA aa2 = new AA();
        AA aa3 = aa1;
        System.out.println("aa1.hashCode()" + aa1.hashCode());
        //aa1.hashCode()460141958
        System.out.println("aa2.hashCode()" + aa2.hashCode());
        //aa2.hashCode()1163157884
        System.out.println("aa3.hashCode()" + aa3.hashCode());
        //aa3.hashCode()460141958
    }
}

class AA {
}
