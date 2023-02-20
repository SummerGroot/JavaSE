package com.basic.www.chapter11.annotation_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 15:03
 */
public class Override_ {
    public static void main(String[] args) {

    }
}

class Father {
    public void fly() {
        System.out.println("father   fly()");
    }
}

class Son extends Father {
    @Override
    /*
     * 1、@Override 注解 放在fly方法上，表示子类的fly方法是重写了父类fly方法
     * 2、如果没有写@Override 也是重写。
     * 3、如果写了@Override注解，编译器就会去检查该方法是否真的重写了父类的方法
     * 如果的确重写了，则编译通过，如果没有构成重写，则编译错误。
     *如果发现 @interface 表示一个 注解类
     * @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.SOURCE)
        public @interface Override {
        }
     * */
    public void fly() {
        super.fly();
    }

}