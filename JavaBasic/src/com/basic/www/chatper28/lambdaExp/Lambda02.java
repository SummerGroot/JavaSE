package com.basic.www.chatper28.lambdaExp;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Auther : Summer
 * @Classname Lambda02
 * @Description
 * @Date 2023/7/7 15:35
 * @Created by Summer
 * @Version: 1.0
 */
public class Lambda02 {
    //Lambda 的使用
    //(o1, o2) -> Integer.compare(o1, o2);
    //格式：
    /*
     * ->：Lambda操作符 箭头操作符
     * 左边：Lambda形参列表（其实就是接口中的抽象方法的形参列表）
     * 右边：Lambda体(就是重写方法的抽象方法的方法体)
     * */
    //Lambda 表达式的使用（6种情况）
    /*
    * 左边：Lambda形参列表的参数类型可以省略(类型推断)
    * 如果Lambda形参列表只有一个参数，其一对()也可以省略
    * 右边：Lambda体应该使用一对 {} 包裹
    * 如果Lambda体只有一条执行语句(可能是return) 省略这一对{} 和return
    * */
    //Lambda本质：作为接口的实例
    @Test
    public void test01() {
        //格式1：无参，无返回值
        Runnable r01 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱中国！！！");
            }
        };
        r01.run();
        System.out.println("================================");
        //-> lambda操作符
        Runnable r02 = () -> {
            System.out.println("我爱lambda");
        };
        r02.run();
    }

    @Test
    public void test02() {
        //格式2：需要一个参数，但没有返回值
        Consumer<String> con01 = new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con01.accept("summer");
        System.out.println("======Lambda======");
        Consumer<String> con02 = (String s) -> {
            System.out.println(s);
        };
        con02.accept("action");
    }

    @Test
    public void test03() {
        //格式3：数据类型可以省略，因为由编译器推断得出，称为“类型推断”；
        System.out.println("======Lambda======");
        Consumer<String> con02 = (s) -> {
            System.out.println(s);
        };
        con02.accept("action");
    }

    @Test
    public void test04() {
        //语法4：Lambda若只需要一个参数时，参数的小括号可省略
        System.out.println("======Lambda======");
        Consumer<String> con02 = s -> {
            System.out.println(s);
        };
        con02.accept("action");
    }

    @Test
    public void test05() {
        //语法5：Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
        Comparator<Integer> com01 = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(02);
            }
        };
        System.out.println(com01.compare(12, 21));
        System.out.println("======Lambda======");
        Comparator<Integer> com02 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(02);
        };
        System.out.println(com02.compare(12, 6));
    }

    @Test
    public void test06() {
        //语法6：当Lambda体只有一条语句时，return与大括号若有，都可以省略
        System.out.println("======Lambda======");
        Comparator<Integer> com02 = (o1, o2) -> o1.compareTo(02);
        System.out.println(com02.compare(12, 125));
    }
}
