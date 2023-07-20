package com.basic.www.chatper28_java8.functionalInterface_;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @Auther : Summer
 * @Classname FunctionalInterfaceTest
 * @Description
 * @Date 2023/7/7 21:41
 * @Created by Summer
 * @Version: 1.0
 */
public class FunctionalInterfaceTest {
    //java内置的四大和兴接口
    //消费型 Consumer<T>
    @Test
    public void test01() {
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("学习好，学习棒，奖励自己：" + aDouble);
            }
        });
        System.out.println("===lambda方式===");
        happyTime(1000, money -> System.out.println("学习好，学习棒，奖励自己：" + money));
    }

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }

    //供给型 Supplier<T>
    @Test
    public void test02() {
        List<String> list = Arrays.asList("成都", "重庆", "云南", "贵州");
        List<String> filterStrs01 = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("成");
            }
        });
        System.out.println(filterStrs01);
        System.out.println("===lambda方式===");
        List<String> filterStrs02 = filterString(list, s -> s.contains("重"));
        System.out.println(filterStrs02);
    }

    //根据给定的规则去过滤集合中的字符串。此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> pre) {
        ArrayList<String> filterList = new ArrayList<>();
        for (String s : list) {
            if (pre.test(s)) {
                filterList.add(s);
            }
        }
        return filterList;
    }

    //函数型 Function<T,R>
    //断定型 Predicate<T>
}
