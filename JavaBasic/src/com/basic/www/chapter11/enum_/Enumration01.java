package com.basic.www.chapter11.enum_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-20 12:25
 */
public class Enumration01 {
    public static void main(String[] args) {
        //使用
        Season01 spring = new Season01("春天", "温暖");
        Season01 winter = new Season01("冬天", "寒冷");
        Season01 summer = new Season01("夏天", "炎热");
        Season01 autumn = new Season01("秋天", "凉爽");
        /*autumn.setName("XXX");
        autumn.setDesc("非常冷");*/
        //对于季节而言，它的对象是固定的4个，不会有更多。
        //枚举类[枚：一个一个 举：例举，即把具体的对象一个一个例举出来的类---枚举]
        Season01 other = new Season01("```1```", "2");
    }
}

class Season01 {//类
    private String name;
    private String desc;//描述

    public Season01(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
