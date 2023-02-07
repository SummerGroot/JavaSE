package com.basic.www.conpter07;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-01-31 10:32
 */
public class MethodDetail01 {
    public static void main(String[] args) {
        AA a = new AA();
        //int[] res = a.getSumAndSub(1, 4);
        //System.out.println(res[0]);
        //System.out.println(res[1]);
        byte a1=1;
        byte b=4;
        int[] res=a.getSumAndSub(a1,b);
        System.out.println(res[1]);
    }
}

class AA {
    public int[] getSumAndSub(int a, int b) {
        int[] resArr = new int[2];//创建数组
        resArr[0] = a + b;
        resArr[1] = a - b;
        return resArr;
    }

    public double f1() {
        double d1 = 1.1 * 3;
        int n = 100;
        return n;
        //int--->double
    }
    public void f2(){
        System.out.println("hello1");
        System.out.println("hello1");
        System.out.println("hello1");
        System.out.println("hello1");
        return;
    }
}
