package com.basic.www.chapter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-01-31 10:13
 */
public class Method02 {
    public static void main(String[] args) {
        //遍历一个数组，输出数组的各个元素
        int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
        //使用方法完成输出,创建MyTools对象
        MyTools tool = new MyTools();
        tool.printArr(map);
        //new MyTools().printArr(map);


        //============================
        //遍历map数组
        //传统解决方式直接遍历
        /*for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }*/
        //要求再次遍历map数组

    }
}

//把输出的功能，写到一个类的方法中，调用该方法
class MyTools {
    //方法。接收一个二维数组
    public void printArr(int[][] map) {
        //对传入的map数组遍历
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
