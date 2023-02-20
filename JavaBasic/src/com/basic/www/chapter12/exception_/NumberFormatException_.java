package com.basic.www.chapter12.exception_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 17:43
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name ="夏源";
        //将String转换为int
        /*
        * Exception in thread "main" java.lang.NumberFormatException: For input string: "夏源"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at com.basic.www.chapter12.exception_.NumberFormatException_.main(NumberFormatException_.java:12)*/
        int num = Integer.parseInt(name);
        System.out.println(num);
    }
}