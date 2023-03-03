package com.basic.www.chapter14.map_;

import java.util.*;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-03 17:52
 */
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", new Book("", 100));
        map.put("邓超", "玛丽");
        map.put("王宝强", "pgone");
        map.put("rapper", "pgone");
        map.put(null, "刘亦菲");
        map.put("me", "迪丽热巴");
        //取出所有的key，通过key，取出对应的value
        System.out.println("第一种方式");
        Set keyset = map.keySet();
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        //迭代器
        System.out.println("第二种方式");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }
        //把所有的values取出
        System.out.println("===取出所有的value===");
        Collection values = map.values();
        //这里可以使用所有Collection的遍历方法
        for (Object value : values) {
            System.out.println(value);
        }
        //迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }
        //通过EntrySet来获取k-v
        System.out.println("===使用entryset===");
        Set entrySet = map.entrySet(); //EntrySert<Map.Entry<K,V>>
        for (Object entry : entrySet) {
            //将entry转成Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            //System.out.println(next.getClass());
            //向下转型
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
