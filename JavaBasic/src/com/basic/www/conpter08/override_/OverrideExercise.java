package com.basic.www.conpter08.override_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-09 11:46
 */
public class OverrideExercise {
    public static void main(String[] args) {
        /*
        * 分别创建Person和Student对象，调用say方法输出自我介绍*/
        Person summer = new Person("summer",24);
        System.out.println(summer.say());
        Student student = new Student("summer",25,123,98);
        System.out.println(student.say());
    }
}
