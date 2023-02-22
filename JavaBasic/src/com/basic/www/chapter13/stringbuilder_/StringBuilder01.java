package com.basic.www.chapter13.stringbuilder_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 15:19
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        /*
        * 1、StringBuilder继承了AbstractStringBuilder
        * 2、实现了Serializable,说明StringBuilder对象可以串行化（该对象可以网络传输，保存到文件）。
        * 3、StringBuilder 是final类，不能被继承
        * 4、StringBuilder对象在字符序列仍然存放在其父类 AbstractStringBuilder 的 char[] value;
        * 因此，字符序列是堆中
        * 5、StringBuilder 的方法，没有做互斥的处理,即没有 synchronized 关键字,因此在单线程的情况下使用
        * StringBuilder*/
        StringBuilder sb = new StringBuilder();
    }
}
