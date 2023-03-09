package com.basic.www.chapter15.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-09 15:36
 */
public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        //给T指定的类型是 User
        Dao<User> dao = new Dao<>();
        dao.save("001", new User(1, 10, "jack"));
        dao.save("002", new User(2, 18, "king"));
        dao.save("003", new User(3, 24, "harden"));

        List<User> list = dao.list();
        System.out.println(list);
        dao.update("003",new User(3, 24, "kiven"));
        System.out.println("====修改后====");
        list= dao.list();
        System.out.println(list);
    }

}

class Dao<T> {
    //定义个泛型类Dao<T>，在其中定义一个Map成员变量，Map的键为String类型，值为T类型/
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        //保存T类型的对象到Map成员变量中
        map.put(id, entity);
    }

    public T get(String id) {
        //从map中获取id对应的对象
        return map.get(id);
    }

    public void update(String id, T entity) {
        //替换map中key为id的内容，改为entity对象
        map.put(id, entity);
    }

    public List<T> list() {
        //返回map中存放的所以T对象
        //遍历map,将map所有的value(T entity)，封装到ArrayList返回
        //创建ArrayList
        List<T> list = new ArrayList<>();
        //遍历map
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            //list.add(map.get(key));
            //mao.get(key 返回就是User对象---->ArrayList
            list.add(get(key));//可以直接使用本类的get方法
        }
        return list;
    }

    public void delete(String id) {
        //删除指定id对象
        map.remove(id);
    }
}

class User {
    //定义User类
    //定义三个属性
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
