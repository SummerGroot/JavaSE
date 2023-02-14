package com.basic.www.chapter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-01-31 11:07
 */
public class MethodExercise01 {
    public static void main(String[] args) {
        AA1 a = new AA1();
        if(a.isOdd(1)){
            System.out.println("是奇数");
        }else {
            System.out.println("是偶数");
        }
        AA2 a2 = new AA2();
        a2.print(30,30,'*');
    }
}


class AA1 {
    //编写类Aa,有一个方法：判断一个数是奇数odd还是偶数，返回boolean
    /*
    * 1、方法的返回类型boolean
    * 2、方法的名字isOdd
    * 3、方法的形参(int num)
    * 4、方法体，判断*/
    public boolean isOdd(int num) {
        /*if (num % 2 != 0) {
            System.out.println(num + "是奇数");
            //return true;
        } else {
            System.out.println(num + "是偶数");
            //return false;
        }*/
        //return num % 2 != 0 ? true : false;
        return num % 2 != 0;
    }
}
class AA2{
    //根据行、列、字符打印 对应行数和列数的字符，
    //比如：行：4，列：4，字符#，则打印相应的效果
    /*
    * ####
    * ####
    * ####
    * */
    /*
     * 1、方法的返回类型void
     * 2、方法的名字print
     * 3、方法的形参(int row,int col,char c)
     * 4、方法体，循环*/
    public void print(int row,int col,char c){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}