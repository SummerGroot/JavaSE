package com.basic.www.chapter14.set_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-01 16:47
 */
@SuppressWarnings({"all"})
public class HashSetStrcture {
    public static void main(String[] args) {
        //模拟一个HashSet（HashMap）的底层结构
        /*
         * 1、创建数组，数组的类型是Node[]
         * 2、直接把Node[]数组称为表*/
        Node[] table = new Node[16];
        //System.out.println("table" + table);
        //3、创建结点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;//将jack节点挂载到john
        Node rose = new Node("rose", null);
        jack.next = rose;//将rose节点挂在到jack
        Node lucy = new Node("lucy", null);
        table[3] = lucy;//把lucy放到table表的索引为3的位置
        System.out.println("table=" + table);
    }
}

class Node {//节点，存储数据，可以指向下一个结点，从而形成链表
    Object item;//存放数据
    Node next;//指向下一个结点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
