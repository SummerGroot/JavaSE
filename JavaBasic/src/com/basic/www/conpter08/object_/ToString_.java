package com.basic.www.conpter08.object_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-13 15:58
 */
public class ToString_ {
    public static void main(String[] args) {

        /*
        Object 的 toString() 方法返回一个字符串，该字符串包含了该对象的类的全限定名，
        getClass().getName() 类的全类名(包名+类名）
        Integer.toHexString(hashCode()将对象的hashCode值转成16进制字符串
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        */

        Monster monster = new Monster("小妖怪", "巡山", 3000);
        System.out.println(monster.toString() + "monster.hashCode()：" + monster.hashCode());
        //com.basic.www.conpter08.object_.Monster@1b6d3586
        System.out.println(monster);
        //等价monster.toString()
        //Monster{name='小妖怪', job='巡山', salary=3000.0}
    }
}

class Monster {
    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    //重写toString()方法，输出对象的属性

    @Override
    public String toString() {
        //重写后，一般把对象的属性输出，可以自己定制。
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
