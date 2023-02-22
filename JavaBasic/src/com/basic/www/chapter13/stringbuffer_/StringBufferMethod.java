package com.basic.www.chapter13.stringbuffer_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 14:39
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        //增 append
        sb.append(",");
        sb.append("hello");
        sb.append("world");
        sb.append("james");
        System.out.println(sb);
        //java,helloworldjames
        //删 delete
        sb.delete(0, 3);
        System.out.println(sb);
        //a,helloworldjames
        //改 replace
        sb.replace(0, 1, "h");
        //h,helloworldjames
        System.out.println(sb);
        //查 indexOf
        System.out.println(sb.indexOf("a"));
        //13
        //查 insert
        sb.insert(0, "xy");
        System.out.println(sb);
        //xyh,helloworldjames
        //获取 length
        System.out.println(sb.length());
        //19
    }
}
