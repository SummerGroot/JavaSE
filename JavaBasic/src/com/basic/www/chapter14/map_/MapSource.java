package com.basic.www.chapter14.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-03 14:57
 */
public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "夏源");//k-v
        map.put("no2", "玩耍");
        map.put(new Car(),new Person());
        /*
        * 1、k-v最后是 HashMap$Node node = newNpde(hash,key,value,null)
        * 2、k-v 为了方便程序员的遍历，还会创建EntrySet集合，该集合存放的元素的类型，
        * 而一个Entry对象就有K,V EntrySet<Entry<K,v>> 即 transient Set<Map.Entry<K,V>> entrySet
        * 3、entrySet 中 定义的类型是Map.Entry,但实际上存放的还是HashMao$Node
        * 这时因为 static class Node<K,V> implements Map.Entry<k,v>
        4、放把HashMap$Node对象存放到entrSet就方便我们的遍历，因为Map.Entry提供了重要方法。
        *  K getKey(); V getValue();*/
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for(Object obj : set){
            //为了从HashMap$Node 取出K-V
            //1、先做一个向下转型
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
class Car{}
class Person{}
