package com.basic.www.chapter14.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-03 14:38
 */
public class Map_ {
    public static void main(String[] args) {
        //Map与Collection并列存在。用于保存具有映射关系的数据：Key-Value（双列元素)
        Map map = new HashMap();
        map.put("no1", "夏源");//k-v
        map.put("no2", "玩耍");
        map.put("no1", "summer");//相同的k，就等价于替换
        map.put(null, null);
        //一对一关系
        System.out.println(map.get("no1"));
        /*
        * 通过get方法，传入key，会返回对应的value*/
        System.out.println("map" + map);
    }
}
