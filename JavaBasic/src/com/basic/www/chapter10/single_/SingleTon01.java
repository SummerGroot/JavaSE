package com.basic.www.chapter10.single_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-16 9:41
 */
public class SingleTon01 {
    public static void main(String[] args) {
        //饿汉式单例模式
        //通过方法获取对象
        Girlfriend gf01 = Girlfriend.getInstance();
        System.out.println(gf01);//Girlfeiend{name='summer'}
        Girlfriend gf02 = Girlfriend.getInstance();
        System.out.println(gf02);//Girlfeiend{name='summer'}

        System.out.println(gf01 == gf02);//true
        //System.out.println(Girlfriend.n);
    }
}

//有一个类 Girlfeiend，只能有一个女朋友
class Girlfriend {
    private String name;
    public static int n = 100;
    //为了能够在静态方法种，返回gf对象，需要将其修饰改为static
    //通常是重量级对象，饿汉式可能造成创建了对象，但是没有使用。
    private static Girlfriend gf = new Girlfriend("summer");

    //如何保障我们只能创建一个GirlFriend
    //1、将构造器私有化
    private Girlfriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }

    //2、类的内部创建。(该对象是static)
    //3、提供一个公共的静态方法
    public static Girlfriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
