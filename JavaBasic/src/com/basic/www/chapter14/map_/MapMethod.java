package com.basic.www.chapter14.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-03 16:42
 */
public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        //1.put：添加
        map.put("邓超", new Book("", 100));
        map.put("邓超", "玛丽");
        map.put("王宝强", "pgone");
        map.put("rapper", "pgone");
        map.put(null, "刘亦菲");
        map.put("me", "迪丽热巴");
        System.out.println("map=" + map);//map={邓超=玛丽, null=刘亦菲, 王宝强=pgone, me=迪丽热巴, rapper=pgone}
        //2.remove：根据键删除映射关系
        map.remove("me");
        //3. get：根据键获取值
        System.out.println(map.get("邓超"));//玛丽
        System.out.println(map);//{邓超=玛丽, null=刘亦菲, 王宝强=pgone, rapper=pgone}
        //4. size：获取元素个数
        System.out.println(map.size());//4
        //5. isEmpty：判断个数是否为0
        System.out.println(map.isEmpty());//false
        //6.clear：清除
        //7. containsKey：查找键是否存在
        System.out.println(map.containsKey(null));//true
        System.out.println(map.containsValue("刘亦菲"));//true
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
