package com.basic.www.chapter14.list_;

import java.util.Vector;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-01 9:30
 */
public class Vector_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //无参构造

        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(101);
        /*
         * 1、new Vector()底层
         * public Vector(){
         * this(10);
         * }
         * vector.add(i)
        //下面这个方法就是添加数据到vector集合
        * public synchronized boolean add(E e) {
        modCount++;
        ensureCapacityHelper(elementCount + 1);
        elementData[elementCount++] = e;
        return true;
        }
         //确定是否需要扩容  条件(minCapacity - elementData.length > 0
        private void ensureCapacityHelper(int minCapacity) {
        // overflow-conscious code
        if (minCapacity - elementData.length > 0)
        grow(minCapacity);
        }
        //如果 需要的数组大小不够用，就扩容
        int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                         capacityIncrement : oldCapacity);
        private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                         capacityIncrement : oldCapacity);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        elementData = Arrays.copyOf(elementData, newCapacity);
        }
    * */
    }
}
