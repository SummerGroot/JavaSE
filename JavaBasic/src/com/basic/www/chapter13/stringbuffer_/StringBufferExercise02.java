package com.basic.www.chapter13.stringbuffer_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 15:00
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        //输入商品名称和价格，要求打印效果示例；
        //商品名   商品价格
        //手机  123,654.59
        /*
         * 1、定义一个Scanner接收用户输入的价格(String)
         * 使用StringBuffer 的insert，需要将String转成StringBuffer*/
        /*Scanner scanner = new Scanner(System.in);*/
        String price = "897654.59";
        StringBuffer sb = new StringBuffer(price);

        //找到小数点索引，然后在该位置的前3位插入,即可
        /*int j = sb.lastIndexOf(".");
        sb = sb.insert(j - 3, ",");*/
        //循环处理
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i , ",");
        }
        System.out.println(sb);
    }
}
