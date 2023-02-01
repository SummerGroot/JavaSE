package com.basic.www.conpter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-01 11:30
 */
public class MiGong {
    public static void main(String[] args) {
        //1、先创建迷宫，用二维数组表示
        int[][] map = new int[8][7];
        //先规定map数组的元素值：0表示可以走，1表示障碍物
        //将最上行最下行全部为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //将第1列和最后一列全部为1
        for (int i = 1; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        //输出当前迷宫
        System.out.println("=======当前地图情况=======");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
