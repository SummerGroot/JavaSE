package com.basic.www.chapter11.enum_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 12:51
 */
public class Enumration03 {
    public static void main(String[] args) {
        System.out.println(Season03.AUTUMN);
    }
}
//使用enum关键字实现枚举类
enum Season03 {
    //如果使用enum来实现枚举类
    /*
    * 1、使用关键字enum替代class
    * 2、public static final Season02 SPRING = new Season02("春天", "温暖");
    *   SPRING("春天","温暖"); 常量名(实参列表);
    * 3、如果有多个常量(对象，使用逗号间隔。)
    * 4、如果使用enum来实现枚举，要求将定义常量对象写在最前面
    * */
    SPRING("春天","温暖"),
    SUMMER("夏天","白天"),
    AUTUMN("秋天","冬天"),
    WINTER("冬天","晚上"),
    /*WATE*///使用的无参构造器
    ;
    private String name;
    private String desc;//描述
    private Season03(){
        //无参构造器
    }
    private Season03(String name, String desc) {
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
        return "Season03{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}