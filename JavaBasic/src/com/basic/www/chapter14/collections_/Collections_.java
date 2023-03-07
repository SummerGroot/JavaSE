package com.basic.www.chapter14.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-07 13:57
 */
public class Collections_ {
    public static void main(String[] args) {
        //创建一个ArrayList集合
        List list = new ArrayList();
        list.add("tom");
        list.add("kobe");
        list.add("james");
        list.add("smith");
        //reverse：反转
        Collections.reverse(list);
        System.out.println("list: " + list);//list: [smith, james, kobe, tom]
        //shuffle：随机排序
        Collections.shuffle(list);
        System.out.println("list: " + list);//list: [james, smith, kobe, tom]
        //sort：自然顺序 升序排列（字符串大小排序）
        Collections.sort(list);
        System.out.println("自然排序后：" + list);//自然排序后：[james, kobe, smith, tom]
        //按照字符串长度大小排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("按照字符串长度排序：" + list);//按照字符串长度排序：[tom, kobe, james, smith]
        //swap 指定位置的元素交换
        Collections.swap(list, 1, 2);
        System.out.println("交换后:" + list);
    }
}
