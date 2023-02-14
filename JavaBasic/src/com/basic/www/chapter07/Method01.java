package com.basic.www.chapter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-01-30 17:53
 */
public class Method01 {
    public static void main(String[] args) {
        //方法使用
        // 1、方法写好后，不去调用，不会输出
        //2、先创建一个对象，然后调用其方法
        Person p1 = new Person();
        p1.speak();//调用方法
        p1.cal01();
        p1.cal02(100);//调用cal02方法，同时给n = 100
        int sum = p1.getSum(1, 2);
        //调用getSum方法，同时a=1，b=2
        //把方法getSum返回的值，赋给变量sum
        System.out.println("getSum方法返回的值="+sum);
    }
}

class Person {
    String name;
    int age;

    //方法（成员方法）
    //添加speak成员方法，输出：我是一个好人
    /*
     * 1、public：表示方法公开
     * 2、void：表示方法没有返回值
     * 3、speak（）：speak是方法名，（）形参列表
     * 4、{}方法体，可以写我们要执行的代码
     * */
    public void speak() {
        System.out.println("我是一个好人");
    }

    //添加cal01成员方法，可以计算从1+...+1000的结果
    public void cal01() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("计算结果为：" + sum);
    }

    //添加cal02成员方法，该方法可以接收一个数n，计算从1+...+n的结果
    //(int n)形参列表 ，表示当前有一个形参n，可以接受用户输入
    public void cal02(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n;
        }
        System.out.println("计算结果为：" + sum);
    }

    //添加getSum成员方法，可以计算两个数的和
    /*
     * 1、public表示方法是公开的
     * 2、int：表示方法执行后，返回一个int值
     * 3、getSum方法名
     * 4、(int a, int b)形参列表，2个形参，可以接收用户传入的两个数
     * 5、return sum;表示sum的值返回*/
    public int getSum(int a, int b) {
        int sum = a + b;
        //System.out.println(a+"+"+b+"=" + sum);
        return sum;
    }
}