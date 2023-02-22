package com.basic.www.chapter13.stringbuffer_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 14:01
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        /*
        * 1、StringBuffer的直接父类是AbstractStringBuilder
        * 2、StringBuffer实现了Serializable ，StringBuffer的对象可以串行化
        * 3、在父类中AbstractStringBuilder有属性 char[] value ，不是final
        * 该value数组存放字符串内容，存放在堆中。
        * 4、StringBuffer是一个final类，不能被继承
        * 5、因为StringBuffer字符内容是存在char[] value ，所有在变化(增加/删除)
        * 不用每次都更换地址（即不是每次创建对象)，所以效率高于String*/
        StringBuffer sb = new StringBuffer();
    }
}
