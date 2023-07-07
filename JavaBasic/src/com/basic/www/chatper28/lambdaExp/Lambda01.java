package com.basic.www.chatper28.lambdaExp;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

/**
 * @Auther : Summer
 * @Classname Lambda01
 * @Description
 * @Date 2023/7/7 15:18
 * @Created by Summer
 * @Version: 1.0
 */
public class Lambda01 {
    //Lambda表达式
    @Test
    public void test01() {
        Runnable r01 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱中国！！！");
            }
        };
        r01.run();
        System.out.println("================================");
        //-> lambda操作符
        Runnable r02 = () -> System.out.println("我爱lambda");

        r02.run();
    }

    @Test
    public void test02() {
        Comparator<Integer> com01 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare01 = com01.compare(12, 21);
        System.out.println(compare01);//-1
        System.out.println("lambda表达式写法");
        Comparator<Integer> com02 = (o1, o2) -> Integer.compare(o1, o2);
        int compare02 = com02.compare(123, 21);
        System.out.println(compare02);//-1
        //方法引用
        Comparator<Integer> com03 = Integer :: compare;
        int compare03 = com02.compare(123, 21);
        System.out.println(compare03);//-1
    }
}

