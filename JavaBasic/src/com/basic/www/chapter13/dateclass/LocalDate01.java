package com.basic.www.chapter13.dateclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 10:57
 */
public class LocalDate01 {
    public static void main(String[] args) {
        /*
         * 使用now()返回当前日期时间的对象*/
        LocalDateTime ldt = LocalDateTime.now();
        //LocalDate.now();
        //LocalTime.now();
        System.out.println(ldt);//2023-05-18T16:02:32.356

        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonthValue());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("小时=" + ldt.getHour());
        System.out.println("分钟=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());

        LocalDate ld = LocalDate.now();//获取年月日
        LocalTime lt = LocalTime.now();//获取时间


        //DateTimeFormatter对象来进行格式化
        /*
         * 创建DateTimeFormatter 对象*/
        LocalDateTime ldt2 = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String str = dtf.format(ldt2);
        System.out.println("格式化的日期=" + str);
    }
}
