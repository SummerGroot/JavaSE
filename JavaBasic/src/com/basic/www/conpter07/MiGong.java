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
        map[2][2] = 1;
        //输出当前迷宫
        System.out.println("=======当前地图情况=======");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        //使用findWay找路
        T02 t02 = new T02();
        t02.findWay(map, 1, 1);
        System.out.println("=====找路的情况如下=====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class T02 {
    //使用递归回溯的思想来解决老鼠出迷宫
    /*
     * 1、findWay方法是专门来找出迷宫的路径
     * 2、如果找到就返回true，否则返回false
     * 3、map就是二维数组，即表示迷宫
     * 4、i,j就是老鼠的位置，初始化的位置为(1,1)
     * 5、因为是递归的找路，所以先规定map数组的各个值的含义
     *   0表示可以走，1表示障碍物，2表示可以走的路，3表示走过，但是走不通
     * 6、当map(6,5)=2说明找到通路，否则就继续找。
     * 7、先确定老鼠找路的策略：下->右->上->左*/
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {//说明已经找到
            return true;
        } else {
            if (map[i][j] == 0) {//当前这个位置0，说明可以走
                //假定可以走通
                map[i][j] = 2;
                //使用找路的策略，来确定该位置是否真的可以走通
                //下->右->上->左
                if (findWay(map, i + 1, j)) {//走下
                    return true;
                } else if (findWay(map, i, j + 1)) {//右
                    return true;
                } else if (findWay(map, i - 1, j)) {//上
                    return true;
                } else if (findWay(map, i, j - 1)) {//左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }

            } else {//map[i][j]=1,2,3
                return false;
            }
        }
    }
}
