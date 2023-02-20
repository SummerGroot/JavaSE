package com.basic.www.chapter11.annotation_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 15:33
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}

/*
 * 1、@Deprecated修饰某个元素，表示该元素已经过时
 * 2、即不再推荐使用，但是仍然可以使用。
 * @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
    public @interface Deprecated {
    }*/
@Deprecated//以弃用
class A {
    public int n1 = 10;

    public void hi() {

    }
}
