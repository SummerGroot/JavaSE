package com.basic.www.chapter05;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-09 10:27
 */
public class Stars {
    public static void main(String[] args) {
        /*
         *       *
         *      * *
         *     *   *
         *    *******
         *思路分析
         *化繁为简
         * 1、先打印矩形
         * *****
         * *****
         * *****
         * *****
         * 2、打印半个金字塔
         * *  //第一层
         * **
         * ***
         * ****
         * *****
         *
         * 3、打印整个金字塔
              *         1  2*层数-1  4=（总层数-层数）个空格
             ***        3
            *****       5
           *******      7
          *********     9
          4、打印空心的金字塔
           *        //当前行的第一个位置是*，最后一个位置也是*
          * *
         *   *
        *     *
       *********   //最后一行全是*
        先死后活
        5  层数做成变量  int totalLevel =5


          *
          *
          * */
        int totalLevel = 10;
        for (int i = 1; i <= totalLevel; i++) {//i表示层数
            //在输出*之前，还要输出(总层数-层数)空格
            for(int k=1;k<=totalLevel-i;k++){
                System.out.print(" ");
            }
            //控制打印每层*的个数
            for (int j = 1; j <= 2*i-1; j++) {
                //当前行的第一个位置是*，最后一个位置也是*,最后一层全是*
                if(j == 1 || j == 2*i-1 || i == totalLevel){
                    System.out.print("*");
                }else {//其他情况输出空格
                    System.out.print(" ");
                }

            }
            //每打印完一层*后，就换行 println本身会换行
            System.out.print("\n");
        }
    }
}
