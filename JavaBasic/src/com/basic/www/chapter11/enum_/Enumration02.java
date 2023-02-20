package com.basic.www.chapter11.enum_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 12:38
 */
public class Enumration02 {
    public static void main(String[] args) {
        System.out.println(Season02.AUTUMN);
        System.out.println(Season02.SUMMER);
    }
}

//自定义枚举
class Season02 {//类
    private String name;
    private String desc;//描述
    //定义了4个对象
    public static final Season02 SPRING = new Season02("春天", "温暖");
    public static final Season02 WINTER = new Season02("冬天", "寒冷");
    public static final Season02 SUMMER = new Season02("夏天", "炎热");
    public static final Season02 AUTUMN = new Season02("秋天", "凉爽");

    //1、将构造器私有化，防止直接被new
    //2、去掉setXxx方法，只能读取，不能修改。
    //3、在Season02内部，直接创建固定的对象(对外暴露对象)
    //4、可以加final修饰符(通过public static final修饰符)
    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}