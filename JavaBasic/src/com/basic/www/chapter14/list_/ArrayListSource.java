package com.basic.www.chapter14.list_;

import java.util.ArrayList;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-24 16:50
 */
public class ArrayListSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //使用无参构造器创建ArrayList对象
        //ArrayList al = new ArrayList();
        /*
        public ArrayList() {
            this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
            //transient Object[] elementData; 创建一个elementData 空数组
        }
        */
        ArrayList al = new ArrayList(8);
        /*
        public ArrayList(int initialCapacity) {
            if (initialCapacity > 0) {
                this.elementData = new Object[initialCapacity];
                //创建一个指定大小的数组
            } else if (initialCapacity == 0) {
                this.elementData = EMPTY_ELEMENTDATA;
            } else {
                throw new IllegalArgumentException("Illegal Capacity: "+
                        initialCapacity);
            }
        }
        */
        //使用for循环给al集合添加1-10数据
        for (int i = 0; i <= 10; i++) {
            al.add(i);
            /*
            public boolean add(E e) {
                ensureCapacityInternal(size + 1);
                //private int size; size = 0
                elementData[size++] = e;
                return true;
            }
            */
            /*
            private void ensureCapacityInternal(int minCapacity) {
                ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
            }
            private static int calculateCapacity(Object[] elementData, int minCapacity) {
            //该方法确定minCapacity 第一次扩容为10
                if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
                    return Math.max(DEFAULT_CAPACITY(10), minCapacity);
                }
                return minCapacity;
            }
            private void ensureExplicitCapacity(int minCapacity) {
                modCount++;//记录集合被修改的次数
                if (minCapacity - elementData.length > 0)
                    grow(minCapacity);
                    //如果element数组不够大，就调用grow()去扩容
            }
            private void grow(int minCapacity) {
                int oldCapacity = elementData.length;
                int newCapacity = oldCapacity + (oldCapacity >> 1);
                if (newCapacity - minCapacity < 0)
                    newCapacity = minCapacity;
                if (newCapacity - MAX_ARRAY_SIZE > 0)
                    newCapacity = hugeCapacity(minCapacity);
                elementData = Arrays.copyOf(elementData, newCapacity);
            }
            第一次扩容 newCapacity = 10
            第二次及其以后，按照1.5倍扩容
            扩容使用数组Arrays.CopyOf()
            */
        }
        //使用for循环给al集合添加1-15数据
        for (int i = 0; i <= 15; i++) {
            al.add(i);
        }
        al.add(100);
        al.add(200);
        al.add(null);
        for (Object obj : al) {
            System.out.println(obj);
        }

    }
}
