package com.basic.www.chapter15.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-09 10:34
 */
public class GenericDetail {
    public static void main(String[] args) {
        //给泛型指向数据类型时，要求是引用类型，不能是基本数据类型
        //在给泛型指定泛型具体类型后，可以传入该类型或者子类类型。
        //因为E指定了A类型，构造器传入了 new A()
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> bPig = new Pig<A>(new B());
        bPig.f();
        /*
         * 编译器会进行类型推断，推荐第二种写法*/
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>();//推荐写法
        //如果这样写，泛型默认是Object
        ArrayList list3 = new ArrayList();//<===>ArrayList<Object> list= new ArrayList<Object>();
        list3.add("xxx");
        /*public boolean add(E e) {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }*/
        Tiger tiger = new Tiger();
        /*
        class Tiger{
            Object e;
            public Tiger(){}
            public Tiger(Object e) {
                this.e = e;
            }
        }*/
    }
}

class Tiger<E> {
    E e;

    public Tiger() {
    }

    public Tiger(E e) {
        this.e = e;
    }
}

class A {
}

class B extends A {
}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f() {
        System.out.println(e.getClass());
    }
}