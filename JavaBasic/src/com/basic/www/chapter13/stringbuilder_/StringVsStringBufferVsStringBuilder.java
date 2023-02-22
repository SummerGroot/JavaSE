package com.basic.www.chapter13.stringbuilder_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 15:38
 */
public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        String text = "";
        long starttime = 0L;
        long endtime = 0L;
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
        starttime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endtime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间: " + (endtime - starttime));
        starttime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endtime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间: " + (endtime - starttime));
        starttime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text += i;
        }
        endtime = System.currentTimeMillis();
        System.out.println("String的执行时间: " + (endtime - starttime));
    }
}
