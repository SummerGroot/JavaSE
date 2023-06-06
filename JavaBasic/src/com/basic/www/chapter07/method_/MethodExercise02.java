package com.basic.www.chapter07.method_;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-01-31 17:03
 */
public class MethodExercise02 {
    public static void main(String[] args) {
        MyTool tool = new MyTool();//创建new MyTool()对象
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//建立二维数组
        tool.printArr(arr);//方法调用

        Person04 p04 = new Person04();//创建new Person04()对象
        p04.name = "summer1";
        p04.age = 25;
        //创建tool
        Person04 pnew = tool.copyPerson(p04);
        //p04和pnew是两个独立的对象
        //可以通过hashCode看看对象是否是一个。
        System.out.println(p04 == pnew);//false
        System.out.println(p04.equals(pnew));//false
        System.out.println(p04.hashCode());//460141958
        System.out.println(pnew.hashCode());//1163157884
    }
}

//编写一个类MyTool，编写一个方法可以打印二维数组的数据
class MyTool {
    //二维数组遍历方法
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

