package com.basic.www.chapter13.string_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 11:11
 */
public class StringMethod02 {
    public static void main(String[] args) {
        //toUpperCase()转换成大写
        String s1 = "hello world";
        System.out.println(s1.toUpperCase());
        //toLowerCase()转换成小写
        String s2 = "FXY";
        System.out.println(s2.toLowerCase());
        //concat()拼接字符串
        String s3 = "詹姆斯";
        s3 = s3.concat("历史得分王").concat("4个总冠军");
        System.out.println(s3);
        //replace()替换字符串中的字符
        String s4 = "hello world";
        System.out.println(s4.replace("hello", "hi"));
        //split()分割字符串，返回数组。对于某些分割字符，我们需要转移 比如 | \\等
        String shige = "莫等闲,白了少年头,空悲切";
        String[] split = shige.split(",");
        for(String s : split){
            System.out.println(s);
        }
        //toCharArray()转换成字符数组
        String s6 = "hello world";
        char[] chars = s6.toCharArray();
        for (char c : chars) {
            System.out.print(c + "\t");
        }
        System.out.println();
        //compareTo()比较两个字符串，
        //如果前者大，则返回正数，
        //后者大，则返回负数，
        //如果相等，返回0
        String s7 = "jack";
        String s8 = "jchn";
        System.out.println(s7.compareTo(s8));//返回值'a'-'c'=-2
        //format格式字符串
        /*
        * 占位符有
        * %s字符串 %c字符 %d整数 %.2f浮点数*/
        String name = "john";
        int age =10;
        double score = 98.3/3;
        char gender = '男';
        /*String info=
                "我的名字是："+name+"年龄是："+age+"成绩是"+score+"性别是"+gender;*/
        /*
        * 1、%s、%d、%.2f、%c为占位符
        * 2、这些占位符由后面变量来替换
        * 3、%s表示后面由字符串来替换
        * 4、%.2f表示使用小数来替换，替换后，只会保留小数点两位
        * */
        String info = String.format("我的名字是%s年龄是%d,成绩是%.2f性别是%c",name,age,score,gender);
        System.out.println(info);
    }
}
