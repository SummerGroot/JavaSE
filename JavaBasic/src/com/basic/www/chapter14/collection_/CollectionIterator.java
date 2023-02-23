package com.basic.www.chapter14.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-23 15:13
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        //能够遍历col集合
        Iterator it = col.iterator();//通过col拿到迭代器
        while (it.hasNext()) {//判断是否还有数据
            //返回下一个元素，类型是Object
            Object obj = it.next();
            System.out.println("obj" + obj);
        }
        //while ===>itit回车
        //显示所有快捷键ctrl+j
        /*
         * 退出while循环后，这时iterator迭代器，指向最后的元素
         * iterator.next();
         * 再次遍历，需要重置迭代器*/
        it = col.iterator();
        System.out.println("再次遍历");
        while (it.hasNext()) {//判断是否还有数据
            //返回下一个元素，类型是Object
            Object obj = it.next();
            System.out.println("obj" + obj);
        }
        //System.out.println("col" + col);
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
