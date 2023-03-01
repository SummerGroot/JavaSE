package com.basic.www.chapter14.list_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-01 9:54
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node summer = new Node("夏天");
        //连接三个节点，形成双向链表
        //jacl->tom->summer
        jack.next = tom;
        tom.next = summer;
        //summer->tom->jack
        summer.prev = tom;
        tom.prev = jack;
        //让first引用指向jack，就是双向链表的头节点
        Node first = jack;
        //让last引用指向summer，尾节点
        Node last = summer;

        //从头到尾遍历
        System.out.println("====从头到尾遍历====");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;//first.next == jack.next
        }
        //从尾到头的遍历
        System.out.println("====从尾到头的遍历====");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.prev;
        }
        //双链表添加对象/数据
        //在tom和summer之间添加spring对象
        //1、创建Node节点 name 春天
        Node spring = new Node("春天");
        //spring加入到双向链表
        /*spring.next = summer;
        spring.prev = tom;
        summer.prev = spring;
        tom.next = spring;*/
        spring.next = tom.next;
        spring.prev = summer.prev;
        tom.next = spring;
        summer.prev = spring;
        first = jack;//重置first
        System.out.println("====插入后的遍历====");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}

//定义一个Node类，Node对象 表示双向链表的一个节点。
class Node {
    public Object item;//真正存放数据
    public Node next;//指向下一个节点
    public Node prev;//指向上一个节点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}
