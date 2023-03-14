package com.basic.www.chapter10.codeblock_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-15 14:59
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //创建对象实例时(new)
        AA aa = new AA();//AA静态代码块1被执行
        //创建子类对象实例时，父类也会被加载。而且父类先被加载，子类后被加载
        //BB bb = new BB();
        /*
        AA静态代码块1被执行
        BB静态代码块1被执行
        */
        //使用类的静态成员时（静态属性，静态方法）
        //System.out.println(Cat.n1);
        /*
        Animal静态代码块1被执行
        Cat静态代码块1被执行
        999
        */
        //static代码块，是在类加载时，执行的，只会执行一次。
        //CC cc01 = new CC();//CC静态代码块1被执行
        //普通的代码块，在创建对象实例时，会被隐式的调用。
        //被创建一次，就会调用一次。
        //如果只是使用类的静态成员时，普通代码块并不会执行。
        //DD dd01 = new DD();//DD普通代码块1被执行
        //System.out.println(DD.n2);//100

    }
}

class AA {
    //静态代码块
    static {
        System.out.println("AA静态代码块1被执行");
    }
}

class BB extends AA {
    //静态代码块
    static {
        System.out.println("BB静态代码块1被执行");
    }
}

class CC{
    static {
        System.out.println("CC静态代码块1被执行");
    }
}
class DD{
    public static int n2=100;
    {
        //创建对象时被调用，而且每创建一个对象，则调用一次
        System.out.println("DD普通代码块1被执行");
    }
}
class Animal {
    static {
        System.out.println("Animal静态代码块1被执行");
    }
}

class Cat extends Animal {
    public static int n1 = 999;

    //静态代码块
    static {
        System.out.println("Cat静态代码块1被执行");
    }
}
