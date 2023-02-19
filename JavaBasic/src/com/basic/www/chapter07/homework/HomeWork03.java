package com.basic.www.chapter07.homework;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-19 15:42
 */
public class HomeWork03 {
    public static void main(String[] args) {
        //编写Book类，定义方法updatePrice，
        //实现更改某本数的价格，具体：如果价格>150，则更改为150，
        //如果价格>100，更改为100，否则不变.
        Book book = new Book();
        System.out.println(book.updatePrice(151));
    }
}

class Book {
    public int updatePrice(int price) {
        return price > 150 ? 150 : price > 100 ? 100 : price;
        //从左--->右
    }
}
