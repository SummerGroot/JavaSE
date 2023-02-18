package com.basic.www.chapter06;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-27 15:42
 */
public class SeqSearch {
    public static void main(String[] args) {
        //定义一个字符串数组
        String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        //接收用户输入
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入名字:");
        String findName = scanner.next();
        //遍历数组，逐一比较，如果有，就提示
        //编程思想,一个金典的方法
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            //字符串比较equals
            if (findName.equals(names[i])) {
                System.out.println("恭喜您找到：" + findName);
                System.out.println("下标为：" + i);
                //把i保存到index
                index = i;
                break;//退出
            }
        }
        if (index == -1) {//没有找到
            System.out.println("非常遗憾没有找到：" + findName);
        }
    }
}
