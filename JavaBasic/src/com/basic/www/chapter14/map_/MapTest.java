package com.basic.www.chapter14.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther : Summer
 * @Classname MapTest
 * @Description
 * @Date 2023/5/19 15:54
 * @Created by Summer
 * @Version: 1.0
 */
public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "玛丽");
        map.put("王宝强", "pgone");
        map.put("rapper", "pgone");
        map.put(null, "刘亦菲");
        map.put("me", "迪丽热巴");
        map.put(null, null);
        System.out.println("key=" + map.keySet());
        System.out.println("val=" + map.values());
    }
}
