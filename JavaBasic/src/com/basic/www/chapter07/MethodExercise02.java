package com.basic.www.chapter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-01-31 17:03
 */
public class MethodExercise02 {
    public static void main(String[] args) {
        MyTool tool = new MyTool();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        tool.printArr(arr);

        Person04 p04 = new Person04();
        p04.name = "summer1";
        p04.age = 25;
        //创建tool
        Person04 pnew = tool.copyPerson(p04);
        //p04和pnew是两个独立的对象
        //可以通过hashCode看看对象是否是一个。
        System.out.println(p04 == pnew);//false
        System.out.println(p04.equals(pnew));
    }
}

//编写一个类MyTool，编写一个方法可以打印二维数组的数据
class MyTool {
    public void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Person04 copyPerson(Person04 p04) {
        //编写一个方法copyPerson，可以复制一个Person对象，返回复制的对象。克隆对象
        //注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
        //创建一个新对象
        Person04 pnew = new Person04();
        pnew.name = p04.name;//把原来对象的名字赋给pnew.name
        pnew.age = p04.age;//把原来对象的年龄赋给pnew.age
        return pnew;
    }
}

class Person04 {
    String name;
    int age;
}

