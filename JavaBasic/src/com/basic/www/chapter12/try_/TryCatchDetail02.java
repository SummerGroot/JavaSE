package com.basic.www.chapter12.try_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 18:34
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
        /*
        * 1、try代码块有多个异常
        * 2、可以使用多个catch分别捕获不同的异常，相应处理
        * 3、要求子类异常写在前面，父类异常写在后面*/
        try {
            Person person = new Person();
            //person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("空指针异常=" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算数异常=" + e.getMessage());
        } finally {
        }
    }
}

class Person {
    private String name = "james";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
