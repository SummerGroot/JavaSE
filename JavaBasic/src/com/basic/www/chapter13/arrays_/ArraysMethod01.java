package com.basic.www.chapter13.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 17:36
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6};
        Integer[] integers = {1, 20, 90};
        //遍历
        /*for (int i = 0; i <integers.length ; i++) {
            System.out.println(integers[i]);
        }*/
        //System.out.println(Arrays.toString(integers));
        /*public static String toString(Object[] a) {
            if (a == null)
                return "null";

            int iMax = a.length - 1;
            if (iMax == -1)
                return "[]";

            StringBuilder b = new StringBuilder();
            b.append('[');
            for (int i = 0; ; i++) {
                b.append(String.valueOf(a[i]));
                if (i == iMax)
                    return b.append(']').toString();
                b.append(", ");
            }
        }*/
        //sort方法的使用
        Integer[] arr = {1, -1, 7, 0, 89,};
        /*
         * 因为数组是引用类型，所以通过sort排序后，会影响到实参arr
         * sort重载的，也可以通过传入一个接口Comparator实现定制排序
         * 调用定制排序时，传入两个参数1、排序的数组arr
         * 2、实现了Comparator接口的匿名内部类，要求实现Compare方法
         * */
        //Arrays.sort(arr);
        //定制排序
        /*
        * 体现了接口编程的方式
        * 源码分析
        * 1、 Arrays.sort(arr, new Comparator()
        * 2、最总到了 TimSort类  private static <T> void binarySort(T[] a, int lo, int hi, int start,
                                       Comparator<? super T> c)
       *执行到  binarySort方法的代码，会根据动态绑定机制c.compare()执行我们
       * 传入到匿名内部类compare方法
       * while (left < right) {
                int mid = (left + right) >>> 1;
                if (c.compare(pivot, a[mid]) < 0)
                    right = mid;
                else
                    left = mid + 1;
            }
            *
        *new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;//向下转型
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        * public int compare(Object o1, Object o2) 返回的值>0还是<0会影响排序的结果
        * */
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;//向下转型
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));

    }
}
