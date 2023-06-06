package com.basic.www.chapter10.innerclass_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-17 9:14
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        //局部内部类
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("outer02 hashcode()="+outer02.hashCode());//Outer02.this hashCode()=460141958

    }
}

class Outer02 {//外部类
    private int n1 = 100;

    private void m2() {
        System.out.println("Outer02");
    }//私有方法

    public void m1() {//方法
        //局部内部类是定义在外部类的局部位置，通常在方法中。
        //不能添加访问修饰符。但是可以使用final修饰符，
        //作用域：仅仅在定义它的方法或代码块中。
        /* final*/
        class Inner02 {
            //局部内部类（本质仍然是一个类）
            //可以直接访问外部类的所有成员，包含私有的。
            private int n1 = 800;

            public void f1() {
                //局部内部类可以直接访问外部类的成员。
                //如果外部类和局部内部类的成员重名时，默认遵循就近原则，
                //如果想访问外部类的成员，
                //则可以使用（外部类名.this.成员）去访问。
                System.out.println("局部内部类n1=" + n1+"\n外部类n1="+Outer02.this.n1);//局部内部类n1：800外部类n1=100
                //Outer02.this外部类的对象，即哪个对象调用了m1，Outer02.this就是哪个对象
                System.out.println("Outer02.this hashCode()="+Outer02.this.hashCode());///Outer02.this hashCode()=460141958
                m2();//Outer02
            }
        }
        //外部类在方法中，可以创建Inner02对象，然后调用方法。
        Inner02 inner02 = new Inner02();
        inner02.f1();

    }

    {
        //代码块
        class Inner03 {
            private int n1 = 100;
            private  void f1(){
                System.out.println("代码块种的内部类");
            }
            private void f2(){
                System.out.println("局部内部类n1=" + n1+"\n外部类n1= "+Outer02.this.n1);
            }
        }
    }
}