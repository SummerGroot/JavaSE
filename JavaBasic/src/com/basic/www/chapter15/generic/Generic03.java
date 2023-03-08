package com.basic.www.chapter15.generic;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-08 17:20
 */
public class Generic03 {
    public static void main(String[] args) {
        //注意：E该数据类型在定义Person对象的时候指定,在编译期间，就确定E是什么类型
        Person<String> person = new Person<String>("夏天");
        person.show();//class java.lang.String
        /*
        * 1、上面的Person类
         class Person {
            String s;
            public Person(String s) {//E也可以是参数类型
                this.s = s;
            }
            public String f(){//返回类型使用E
                return s;
            }
            }
* */
        Person<Integer> person01 = new Person<Integer>(100);
        person01.show();//class java.lang.Integer
        /*class Person<Integer> {
            Integer s;

            public Person(Integer s) {//E也可以是参数类型
                this.s = s;
            }
            public Integer f(){//返回类型使用E
                return s;
            }
        }*/
    }
}

//泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型，
//或者是某个方法返回值的类型，或者是参数类型.
class Person<E> {
    E s;//E表示s的数据类型，该数据类型在定义Person对象的时候指定,在编译期间，就确定E是什么类型

    public Person(E s) {//E也可以是参数类型
        this.s = s;
    }
    public E f(){//返回类型使用E
        return s;
    }
    public void show(){
        System.out.println(s.getClass());//显示s的允许类型
    }
}