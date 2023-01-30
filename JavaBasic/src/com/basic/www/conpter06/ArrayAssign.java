package com.basic.www.conpter06;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2022-12-22 15:52
 */
public class ArrayAssign {
    public static void main(String[] args) {
        //基本数据类型赋值,赋值方式为值拷贝
        //n2的变化不会影响n1的值
        int n1 = 10;
        int n2 = n1;

        n2 = 80;
        System.out.println("n1=" + n1);//10
        System.out.println("n2=" + n2);//80
        System.out.println("============================");
        //数组：在默认情况下是引用传递，赋的值是地址->赋值方式为引用赋值
        //传递的是地址，arr2的变化会影响arr1
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;//arr1赋给arr2
        arr2[0] = 10;
        //遍历arr1
        System.out.println("=====arr1的元素======");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");//10 2 3
        }

    }
}
