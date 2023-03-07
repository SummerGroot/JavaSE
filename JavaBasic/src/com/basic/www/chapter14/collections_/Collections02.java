package com.basic.www.chapter14.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-07 14:46
 */
public class Collections02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("kobe");
        list.add("james");
        list.add("smiths");
        //1. Object max(Collection)：根据元素的自然排序，返回给定集合中的最大元素。
        System.out.println("自然顺序的最大元素=" + Collections.max(list));//自然顺序的最大元素=tom
        //2. Object max(Collection，Comparator)：根据Comparator指定的顺序，返回给定集合中的最大元素。
        //返回长度最大的元素
        Object maxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("长度最大的元素=" + maxObject);//长度最大的元素=smiths
        //3. Object min(Collection)：
        System.out.println("自然顺序的最小元素=" + Collections.min(list));//自然顺序的最小元素=james
        //4. Object min(Collection，Comparator)：
        //5. int frequency(Conllection,Object)：返回指定集合中指定元素的出现次数。
        System.out.println("tom出现的次数=" + Collections.frequency(list, "tom"));//tom出现的次数 = 1
        //6. void copy(List dest,List src)：将src中的内容复制到dest中。
        ArrayList dest = new ArrayList();
        //为了完成一个完整的拷贝，先给dest赋值，大小和list.size()一样
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        //拷贝
        Collections.copy(dest, list);
        System.out.println("dest=" + dest);
        //7. boolean replaceAll(List list,Object oldVal,Object newVal)：使用新值替换List对象的所有旧值。
        //如果list中有tom就替换成汤姆
        Collections.replaceAll(list, "tom", "汤姆");
        System.out.println("替换后为=" + list);//替换后为=[汤姆, kobe, james, smiths]

    }
}
