package com.basic.www.chapter08.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-13 17:40
 */
/*
 * 该类完成零钱通的各个功能的类
 * 使用OOP
 * 将各个功能对应一个方法*/
public class SmallChangeSysOOP {
    //化繁为简
    //1、先完成显示菜单，并可以选择,给出对应提示
    //定义相关变量
    boolean loop = true;
    //定义输入
    Scanner scanner = new Scanner(System.in);
    String key = "";
    //2、完成零钱通明细
    /*
     * 1、可以把收入和消费，保持到数组
     * 2、可以使用对象
     * 3、使用String拼接*/
    String details = "--------零钱通明细--------";
    //3、完成收益入账
    /*
     * 1、定义新的变量*/
    double money = 0;
    double balance = 0;
    Date date = null;//date是java.util.Date类型,表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    //可以用于日期格式花的
    //4、消费
    /*
     * 1、定义新变量，保持消费的原因
     **/
    String note = "";

    //显示主菜单，并可以选择
    public void mainMenu() {
        do {
            System.out.println("--------零钱通菜单(OOP)--------");
            System.out.println("\t\t\t\t1、零钱通明细");
            System.out.println("\t\t\t\t2、收益入账");
            System.out.println("\t\t\t\t3、消费");
            System.out.println("\t\t\t\t4、退\t出");

            System.out.print("请选择(1-4):");
            key = scanner.next();
            //使用switch分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误！！！，请重现选择");
            }
        } while (loop);
    }

    //完成零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //收益入账
    public void income() {
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        //money 的值范围应该校验
        //找出不正确的金额条件，然后给出提示即可。就直接break
        if (money <= 0) {
            System.out.println("收益入账金额需要大于0");
            return;//退出方法，不再执行
        }
        balance += money;
        //拼接收益入账信息到details
        date = new Date();//获取当前的日期
        //System.out.println(sdf.format(date));
        details += "\n收益入账金额\t："
                + money + "\t"
                + sdf.format(date)
                + "\t" + "余额：" + balance;
    }

    //消费
    public void pay() {
        System.out.print("消费金额:");
        money = scanner.nextDouble();
        //money 的值范围应该校验
        if (money >= 0 || money > balance) {
            System.out.println("你的消费金额应该在0-" + balance);
            return;
        }
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        date = new Date();//获取当前时间
        //拼接收益入账信息到details
        details += "\n" + note + "\t：" +
                "-" + money + "\t" +
                sdf.format(date) + "\t" +
                "余额：" + balance;
    }

    //退出
    public void exit() {
        /*
         * 6、用户退出，给出提示”你确定要退出吗？y/b ，必须输入正确的y/n
         * 否则循环输入指令，直到输入y或者n
         * 定义新的变量String choice接收用户的输入
         * 使用while+break 来处理接收的是什么
         * 退出while后，再判断choice是y还是n，就可以决定是否退出*/
        String choice = "";
        while (true) {//要求用户必须输入y或n，否则一直循环
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        //当用户退出循环后
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
