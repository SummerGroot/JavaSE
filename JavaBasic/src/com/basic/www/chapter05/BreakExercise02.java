package com.basic.www.chapter05;

import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-09 14:39
 */
public class BreakExercise02 {
    public static void main(String[] args) {
//实现登录验证，有3次机会，如果用户名为“summer”，密码“666”提示登陆成功，
// 否则作者提示还有几次机会，请使用for+break完成。
        //创建Scanner对象接收用户输入
        Scanner scanner = new Scanner(System.in);
        //定义String name String passwd 接收用户名和密码
        String name = "";
        String passwd = "";
        //定义 int chance记录还有几次登录机会  登录一次就少一次
        int chance = 3;
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入名字：");
            name = scanner.next();
            System.out.println("请输入密码:");
            passwd = scanner.next();
            //比较输入的名字和密码是否正确
            //补充说明字符串 的内容比较方法 equals-将此字符串与指定对象进行比较。
            /*将此字符串与指定对象进行比较。
             其结果是true当且仅当该参数不是null并且是String对象，
            表示相同的字符序列作为该对象。
            String name = "summer";
            System.out.println(name.equals("Summer");
            System.out.println("summer.equals(name);->推荐，可以避险空指针
            */
            if ("summer".equals(name) && "666".equals(passwd)) {
                System.out.println("恭喜你，登录成功");
                break;
            }
            //登录的机会就减少
            chance--;
            System.out.println("你还有" + chance + "次机会登录");
        }
    }
}
