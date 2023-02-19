package com.basic.www.chapter08.poly_.polyarr_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-10 11:16
 */
public class PolyArray {
    public static void main(String[] args) {
        /*
         * 应用实例：现有一个继承结构如下：要求创建1个Person对象，
         * 2个Student对象和2个Teacher对象，统一放在数组中，并调用say方法。
         * */
        Person[] persons = new Person[5];//创建Person类型的数组
        persons[0] = new Person("summer", 20);
        persons[1] = new Student("lisi", 18, 100);
        persons[2] = new Student("james", 20, 98);
        persons[3] = new Teacher("吉泽明步", 30, 8000);
        persons[4] = new Teacher("king", 45, 80000);

        //循环遍历多态数组 调用say方法
        for (int i = 0; i < persons.length; i++) {
            //提示：persons[i] 编译类型是Person，
            //运行类型是根据实际情况由JVM来判断
            System.out.println(persons[i].say());//动态绑定机制
            //类型判断+向下转型
            if (persons[i] instanceof Student) {
                //判断persons[i]是不是Student
                Student student = (Student) persons[i];//向下转型
                student.say();
                //((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];//向下转型
                teacher.teach();
            } else if (persons[i] instanceof Person) {

            } else {
                System.out.println("你的类型有误，请自己检查");
            }
        }
    }
}

