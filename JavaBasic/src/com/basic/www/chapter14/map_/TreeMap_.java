package com.basic.www.chapter14.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-07 13:16
 */
public class TreeMap_ {
    public static void main(String[] args) {
        //使用无参构造器，没有排序
        //TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //1、按照传入的k(String)的大小排序
                //return ((String)o1).compareTo((String)o2);
                //按照String的长度来排序
                return ((String) o1).length() - ((String) o2).length();

            }
        });
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kobes", "科比");
        treeMap.put("smiths", "斯密斯");
        treeMap.put("a", "A");
        System.out.println("treeMap = " + treeMap);
        /*
        * 1、构造器，把传入的实现了 Comparator 接口的匿名内部类（对象），传给TreeMap的Comparator
            public TreeMap(Comparator<? super K> comparator) {
            this.comparator = comparator;
            }
        * 2、调用 put方法
        * 第一次添加，把k-v封装到Entry对象，放入root
        Entry<K,V> t = root;
        if (t == null) {
            compare(key, key); // type (and possibly null) check

            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        *以后添加
        * Comparator<? super K> cpr = comparator;
        if (cpr != null) {
            do {//遍历所有的k，给当前的k找到适当的位置
                parent = t;
                cmp = cpr.compare(key, t.key);//动态绑定到匿名内部类compare
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else//如果遍历过程种，发现准备添加k和当前已有的k相等，就不添加
                    return t.setValue(value);
            } while (t != null);
        }
        * */
    }
}

