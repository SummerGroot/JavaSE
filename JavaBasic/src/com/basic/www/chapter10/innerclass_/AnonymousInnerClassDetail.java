package com.basic.www.chapter10.innerclass_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-17 10:38
 */
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.f1();
        //外部其他类----不能访问---->匿名内部类
    }
}

class Outer04 {
    private int n1 = 99;

    public void f1() {
        //创建一个基于类的匿名内部类
        //不能添加访问修饰符
        //作用域：仅仅在定义的方法或代码块中。Outer04$1
        //如果外部类和匿名内部类的成员重名时，匿名内部类访问的话，默认遵循就近原则，
        //如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问。
        Person p = new Person() {
            private int n1 = 88;

            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法 n1=" + n1);
                //Outer04.this就是调用 f1的 对象
                System.out.println("外部类的 n1=" + Outer04.this.n1);
            }
        };
        p.hi();//动态绑定
        //也可以直接调用，匿名内部类本身也是返回对象
        //class 匿名内部类 extends Person{}
        /*new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法,hahaha");
            }

            @Override
            public void ok(String name, int n) {
                super.ok(name, n);
            }
        }.ok("summer", 25);*/
    }
}

class Person {//类

    public void hi() {
        System.out.println("Person的hi方法");
    }

    public void ok(String name, int n) {
        System.out.println("Person ok()" + name + n);
    }
}
