package com.basic.www.conpter06;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 12:43
 */
public class Array01 {
    public static void main(String[] args) {
        //一群鸡的体重分别为3kg、5kg、1kg、3.4kg、2kg、50kg。
        //请问这6只鸡的总体重是多少？平均体重是多少？
        //定义一个数组
        double[] hens = {3, 5, 1, 3.4, 2, 50};
        /*
         * 1、double[]表示是double类型的数组，数组名hens
         * 2、{3, 5, 1, 3.4, 2, 50};表示数组的值/元素，依次表示数组的第几个元素
         * */
        double totalWeight = 0;
        //for循环遍历,得到数组的所有元素的和
        for (int i = 0; i < 6; i++) {
            //数组名.length得到数组的大小/长度
            //System.out.println("第" + (i + 1) + "个元素=" +
            // hens[i] + "kg");
            totalWeight += hens[i];
        }
        System.out.println("总体重=" + totalWeight +
                "平均体重=" + (totalWeight / 6));
        /*
         * 1、可以通过hens[下标]来访问数组的元素
         * 下标是从0开始编号的
         * 比如：第一个元素就是hens[0]
         * 。。。。
         * 依次类推
         * 2、通过for循环就可以访问数组的元素/值
         * 3、使用一个变量将各个元素累计*/
    }
}
