package com.basic.www.chapter10.innerclass_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-17 9:42
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        //匿名内部类
        Outer03 outer03 = new Outer03();
        outer03.method();
    }
}

class Outer03 {//外部类
    private int n1 = 10;//属性

    public void method() {//方法
        //基于接口的匿名内部类
        /*
         * 1、想使用接口IA接口，并创建对象
         * 2、写个类，实现该接口，并创建对象
         * 3、需求Tiger类只是使用一次，以后不再使用。
         * 4、使用匿名内部类实现
         * 5、tiger的编译类型是---->IA
         * 6、tiger的运行类型----->就是匿名内部类 XXXX====>Outer03$1
         *
         * 底层会分配类名 Outer03$1
         * class XXXX implements IA{
         *   @Override
            public void cry() {
                System.out.println("老虎在叫...");
            }
         * }
         * 7、jdk底层会创建匿名内部类Outer03$1，立即马上会创建了Outer03$1实例，
         * 并且把地址返回给tiger
         * 8、匿名内部类使用一次，就不能再使用。
         * */
        /*Tiger tiger = new Tiger();
        tiger.cry();*/
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎在叫...");
            }
        };
        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();
        //基于类的内部类
        /*
        * 1、father编译类型Father
        * 2、father 运行类型 Outer03$2
        * 3、底层会创建匿名内部类
        * class Outer03$2 extends Father{
        *  @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        * }
        *
        * 4、同时也直接返回了匿名内部类 Outer03$2对象
        * 5、参数列表会传递给构造器*/
        Father father = new Father("summer") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father的运行类型=" + father.getClass());//Outer03$2
        father.test();
        /*
         * 基于抽象类的匿名内部类
         * */
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}

interface IA {//接口

    public void cry();
}

/*class Tiger implements IA {
    @Override
    public void cry() {
        System.out.println("老虎叫唤...");
    }
}

class Dog implements IA {
    @Override
    public void cry() {
        System.out.println("火锅在叫...");
    }
}*/

class Father {
    public Father(String name) {//构造器
        System.out.println("接收到name=" + name);
    }

    public void test() {//方法

    }
}

abstract class Animal {
    abstract void eat();
}