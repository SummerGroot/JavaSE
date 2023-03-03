package com.basic.www.chapter14.set_;

import java.util.HashSet;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-02 11:14
 */
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        /*for (int i = 0; i <= 100; i++) {
            hs.add(i);
        }*/
        for (int i = 0; i <= 12; i++) {
            hs.add(new A(i));
        }
        //当向hs增加一个元素->Node->加入table，就算是增加了一个
        System.out.println("hs=" + hs);
    }

}

class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
