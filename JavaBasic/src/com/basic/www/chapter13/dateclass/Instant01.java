package com.basic.www.chapter13.dateclass;

import java.time.Instant;
import java.util.Date;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 11:15
 */
public class Instant01 {
    public static void main(String[] args) {
        /*
        * 通过静态方法now()获取当前时间戳的对象*/
        Instant now = Instant.now();
        System.out.println(now);//2023-05-18T08:04:58.884Z
        /*
         *通过from可以把Instant转成Date */
        Date date = Date.from(now);
        //通过date的toInstant()可以把date转成Instant对象
        Instant instant = date.toInstant();
    }
}
