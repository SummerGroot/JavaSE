package com.basic.www.chapter13.dateclass;

import java.util.Calendar;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 9:56
 */
public class Calendar01 {
    public static void main(String[] args) {
        /*
         * Calendar是一个抽象类，并且构造器是private
         * 可以通过 getInstance() 来获取实例
         * 提供大量的方法和字段提供给程序员
         *
         * Calendar没有提供对应的格式化类，需要自己组合来输出
         * 如果我们需要按照 24 小时进制来获取时间， Calendar.HOUR ==改成=> Calendar.HOUR_OF_DAY*/
        Calendar c = Calendar.getInstance();//创建日历类对象
        System.out.println("c" + c);
        //获取日历对象的某个日历字段
        System.out.println("年：" + c.get(Calendar.YEAR));
        //Calendar返回月时，是按照0开始编号的
        System.out.println("月：" + c.get(Calendar.MONTH) + 1);
        System.out.println("日：" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时：" + c.get(Calendar.HOUR));
        System.out.println("分钟：" + c.get(Calendar.MINUTE));
        System.out.println("秒：" + c.get(Calendar.SECOND));
        //Calendar没有专门的格式化方法，需要自己组合
        System.out.println(c.get(Calendar.YEAR) + "年" + c.get(Calendar.MONTH) + "月" + c.get(Calendar.DAY_OF_MONTH) + "日" + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
