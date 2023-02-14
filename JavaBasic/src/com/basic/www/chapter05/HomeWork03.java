package com.basic.www.chapter05;
import java.util.Scanner;
/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-16 10:37
 */
public class HomeWork03 {
    public static void main(String[] args) {
        //水仙花数
        //判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，
        //其各个位上数字立方和等于其本身。
        //例如：153=1*1*1+3*3*3+5*5*5
        /*
        * 分析
        * 分别得到百位，十位，个位
        * 百位：i/100
        * 十位：i%100/10
        * 个位：i%10*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int i = scanner.nextInt();
        if(i==(i/100)*(i/100)*(i/100)+
                (i%100/10)*(i%100/10)*(i%100/10)+
                (i%10)*(i%10)*(i%10)){
            System.out.println(i+"该数是水仙花数");
        }else {
            System.out.println(i+"该数不是水仙花数");
        }
    }
}
