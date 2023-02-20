package com.basic.www.chapter11.enum_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 13:34
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season03枚举类
        Season03 autumn = Season03.AUTUMN;
        //输出枚举对象的名字
        System.out.println(autumn.name());//AUTUMN
        //ordinal()输出的是该枚举对象的次序/编号 ，从0开始编号的。
        System.out.println(autumn.ordinal());//2
        //从javap看出values方法，返回Season03[]
        //含有定义的所有枚举对象
        Season03[] values = Season03.values();
        //增强for循环
        for (Season03 season03 : values) {
            System.out.println(season03);
        }
        //增强for循环
        /*System.out.println("======增强for循环======");
        int[] arrs = {1,2,3,4,5};
        for(int i:arrs){
            //依次从arrs数组中取出数据，赋给i
            System.out.print(i);
        }*/
        //valueOf：将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常！
        /*
         * 1、根据你输入的"AUTUMN"到Season03的枚举对象去查找
         * 2、如果找到了，就返回，如果没有找到，就报错
         * */
        Season03 autumn03 = Season03.valueOf("AUTUMN");
        System.out.println(autumn03);
        System.out.println(autumn == autumn03);//true
        //conpareTo:比较两个枚举常量的位置号。
        System.out.println(Season03.AUTUMN.compareTo(Season03.SPRING));//2
        //AUTUMN的编号-SPRING的编号====>2-0=2

    }
}
