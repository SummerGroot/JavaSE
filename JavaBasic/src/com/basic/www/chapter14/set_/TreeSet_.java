package com.basic.www.chapter14.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-07 12:51
 */
public class TreeSet_ {
    public static void main(String[] args) {
        /*
         * 1、当使用无参构造器，创建TreeSet时，仍然是无序
         * 2、希望添加的元素，按照字串大小来排序
         * 3、使用TreeSet提供的构造器，可以传入一个比较器（匿名内部类）
         *  并指定排序规则 */
        //TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用字符串大小比较方法
                //return ((String) o1).compareTo((String) o2);
                //按照长度大小排序
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        //添加数据
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("james");
        treeSet.add("xy");
        treeSet.add("a");
        System.out.println("treeSet" + treeSet);
        /*
        * 1、构造器把传入的比较对象，赋给TreeSet的底层TreeMap的属性this.comparator
            public TreeMap(Comparator<? super K> comparator) {
            this.comparator = comparator;
            }
         2、在调用treeSet.add("tom"),在底层会执行到
         if (cpr != null) {//cpr就是我们的匿名内部类（对象）
            do {
                parent = t;
                cmp = cpr.compare(key, t.key);//动态绑定到我们的匿名内部类（对象）comparator
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else //如果相等，即返回0，这个k就没有加入
                    return t.setValue(value);
            } while (t != null);
        }
    * */
    }
}
