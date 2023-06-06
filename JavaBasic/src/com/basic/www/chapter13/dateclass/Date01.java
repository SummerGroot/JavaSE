package com.basic.www.chapter13.dateclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 9:35
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        /*这里Date类在java.util包
         * 默认输出日期格式是国外的，因此需要对格式进行转换*/
        Date d1 = new Date();//获取当前系统时间
        System.out.println("当前日期=" + d1);//当前日期=Thu Feb 23 09:47:38 CST 2023
        Date d2 = new Date(9234567);//通过指定毫秒数得到时间
        System.out.println("d2的时间" + d2);//获取某个时间对应的毫秒数
        /*
         * 创建SimpleDateFormat对象，可以指定相应的格式
         * 这里的格式使用的字母是规定好的*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日 HH:mm:ss");//格式化
        String format = sdf.format(d1);//format：将日期转换成指定格式的字符串
        System.out.println("当前日期=" + format);
        /*可以包格式化的String转成对应的Date*/
        String s = "1996年 01月 01日 10:20:30 星期一";
        Date parse_ = sdf.parse(s);
        System.out.println("parse=" + sdf.format(parse_));

    }
}
