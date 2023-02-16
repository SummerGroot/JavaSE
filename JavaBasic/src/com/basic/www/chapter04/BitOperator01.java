package com.basic.www.chapter04;

/**
 * @version: java version 1.8
 * @Author: Summer
 * @description:
 * @date: 2022-12-02 11:13
 */
public class BitOperator01 {
    public static void main(String[] args) {
        //先得到2的补码=> 2的原码
        System.out.println(2&3);//2
        System.out.println(~-2);
        /*
        * 1、得到2的补码 00000000 00000000 00000000 00000010
        * 2、~2的操作   11111111 11111111 11111111 11111101 运算后的补码
        * 3、运算后的反码11111111 11111111 11111111 11111100
        * 4、运算后的原码10000000 00000000 00000000 00000011=>-3*/
        System.out.println(~2);
    }
}
