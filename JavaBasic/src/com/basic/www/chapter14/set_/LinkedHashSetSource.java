package com.basic.www.chapter14.set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-02 16:38
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        /*
         * 说明：
         * 1、在LinkedHashSet中维护了一个hash表和双向链表（LinkedHashSet有head和tail）
         * 2、每一个结点有pre和next属性，这样可以形成双向链表
         * 3、在添加元素时，先求hash值，在求索引。确定该元素在hashtable的位置，然后将添加的元素
         * 加入到双向链表（如果已经存在，不添加[原则和hashset一样]
         * tail.next= newElement;
         * newElement.pre= tail;
         * tail=newElement;
         * 4、这样的话，我们遍历LinkedHashSet也能确保插入顺序和遍历顺序一致
         * */
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("夏", 1001));
        set.add(123);
        set.add("FXY");
        System.out.println("set" + set);
        /*
        * 1、添加顺序和取出顺序一致
        * 2、LinkedHashSet底层维护的是一个LinkedHashMap（是HashMap的子类）
        * 3、底层结构（数组+双向链表）
        * 4、第一次添加时，直接将数组table扩容到16，存放的结点类型是LinkedHashMap$Entry
        * 5、数组是HashMap$Node[]存放的元素/数组是LinkedHashMap$Entry
        *
             static class Entry<K,V> extends HashMap.Node<K,V> {
            Entry<K,V> before, after;
            Entry(int hash, K key, V value, Node<K,V> next) {
                super(hash, key, value, next);
            }
            }
        * */

    }
}

class Customer {
    private String name;
    private int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
