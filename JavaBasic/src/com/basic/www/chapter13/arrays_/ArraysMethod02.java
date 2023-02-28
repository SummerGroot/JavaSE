package com.basic.www.chapter13.arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 18:32
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        //binarySearch通过二分搜索法进行查找
        /*
         * 1、使用binarySearch 二叉查找
         * 2、要求数组时有序的，如果该数组时无序的，不能使用
         * 3、数组中不存在该元素，则返回-1*/
        System.out.println(Arrays.binarySearch(arr, 2));//1
        //copyOf
        /*
         * /1. 从 arr 数组中，拷贝 arr.length 个元素到 newArr 数组中
            2. 如果拷贝的长度 > arr.length 就在新数组的后面 增加 null
            3. 如果拷贝长度 < 0 就抛出异常 NegativeArraySizeException
            4. 该方法的底层使用的是 System.arraycopy(
         * 如果拷贝长度<0就抛出异常  NegativeArraySizeException*/
        Integer[] newArr = Arrays.copyOf(arr, arr.length - 2);
        System.out.println("=====拷贝完后=====");
        System.out.println(Arrays.toString(newArr));
        //fill元素的填充
        Integer[] num = new Integer[]{9, 3, 2};
        /*
         * 1、使用99去填充num数组，可以理解成替换原理*/
        Arrays.fill(num, 99);
        System.out.println("=====填充完后=====");
        System.out.println(Arrays.toString(num));
        //equals  比较两个元素内容是否完全一致
        Integer[] arr1 = {1, 2, 3, 4, 5, 6};
        //如果arr和arr的元素一样，则返回true
        System.out.println(Arrays.equals(arr, arr1));
        //asList 将一组值，转换成list
        /*
        * 1、 asList会将(2, 3, 4, 5, 6, 1)数据转成一个List集合
        * 2、返回的aslist编译类型 List(接口)
        * 3、aslist运行类型 java.util.Arrays$ArrayList
        * 4、是Arrays类的静态内部类
        *  private static class ArrayList<E> extends AbstractList<E>
        implements RandomAccess, java.io.Serializable*/
        List<Integer> aslist = Arrays.asList(2, 3, 4, 5, 6, 1);
        System.out.println("aslist=" + aslist);
        System.out.println("aslist的运行类型"+aslist.getClass());
    }
}
