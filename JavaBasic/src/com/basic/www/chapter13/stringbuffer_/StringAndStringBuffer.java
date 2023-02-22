package com.basic.www.chapter13.stringbuffer_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 14:29
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String---->StringBuffer
        String str = "tom";
        //方式1
        //注意：返回的才是StringBuffer对象，对Str本身没有影响
        StringBuffer sb = new StringBuffer(str);
        //方式2  使用append方法
        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.append(str));//tom
        //StringBuffer---->String
        StringBuffer sb3 = new StringBuffer("xyedu");
        //方式1 使用StringBuffer提供的 toString方法
        String s = sb3.toString();
        //方式2 使用构造器
        String s1 = new String(sb3);
    }
}
