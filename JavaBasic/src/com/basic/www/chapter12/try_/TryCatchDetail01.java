package com.basic.www.chapter12.try_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 18:25
 */
public class TryCatchDetail01 {
    public static void main(String[] args) {
        //如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch块。
        //如果异常没有发生，则顺序执行try的代码块，不会进入catch。
        try {
            //String str = "123";
            String str = "夏源";
            int a = Integer.parseInt(str);
            System.out.println("数字=" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("finally块被执行");
        }
        System.out.println("程序继续。。。。");
    }
}
