package com.basic.www.conpter08.poly_.detail_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-09 15:07
 */
public class PolyDetail {
    public static void main(String[] args) {

        // 向上转型：父类的引用指向了子类的对象
        // 语法：父类类型 引用名 =  new 子类类型();
        Animal animal = new Cat();

        // Object obj = new Animal();????
        Object obj = new Animal();

        // 可以调用父类中的所有成员（遵守访问权限）
        // 不能调用子类中特有成员
        // 因为在编译阶段，能调用哪些成员是由编译类型来决定的。
        // 最终运行效果看子类的具体实现,调用方法时，从子类开始查找方法
        animal.eat();//猫吃鱼
        animal.show();//你好!!!
        animal.sleep();//睡觉
        animal.run();//跑
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
