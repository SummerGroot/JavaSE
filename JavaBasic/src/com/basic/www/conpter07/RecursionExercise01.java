package com.basic.www.conpter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-01 11:06
 */
public class RecursionExercise01 {
    public static void main(String[] args) {
        T01 t01 = new T01();
        //System.out.println("当n=7 对应的斐波那契数=" + t01.fibonacci(7));
        int day = 1;
        int peachNum = t01.peach(day);
        if (peachNum != -1) {
            System.out.println("第" + day + "天有" + peachNum + "个桃子");
        }
    }
}

class T01 {
    //1、请使用递归的方式求出斐波那契数
    //1,1,2,3,5,8,13...给你一个整数n，求出它的值是多少
    /*
     * 分析
     * 1、当n=1 斐波那契数 是1
     * 2、当n=2 斐波那契数 是1
     * 3、当n>=3 斐波那契数 是前两个数的和
     * 4、这里就是一个递归的思想
     * */
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("要求输入的n>=1的整数");
        }
        return -1;
    }

    //2、猴子吃桃问题：有一堆桃子，猴子第一天吃了其中的一半，
    //并再多吃了一个！以后每天后都吃其中的一半，然后再多吃一个。
    //当到第10天时，想再吃时（即还没吃），发现只有一个桃子了。
    //问题：最初共有多少个桃子？
    /*
     * 1、day=10时，有1个桃子
     * 2、day=9时，有（day10+1）*2=4
     * 3、规律：（后一天桃子+1）*2=前一天*/
    public int peach(int day) {
        if (day == 10) {//第10天只有1个桃子
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("day在1-10");
            return -1;
        }
    }
}
