package com.basic.www.chapter14.map_;

import java.util.HashMap;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-06 17:20
 */
@SuppressWarnings({"all"})
public class HashMapSource {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java", 10);//ok
        map.put("c++", 10);//ok
        map.put("java", 20);//替换value
        System.out.println("map=" + map);//map={c++=10, java=20}
        //HashMap源码解读
        /*
        * 1、执行构造器   new HashMap()
        *   初始化加载因子 this.loadFactor = DEFAULT_LOAD_FACTOR
        * HashMap$Node[] table =null
        * 2、执行put()  基本数据类型的装箱操作
        * 会调用 计算key的hash值  (h = key.hashCode()) ^ (h >>> 16)
            public V put(K key, V value) {//K="java",V=10
            return putVal(hash(key), key, value, false, true);
            }
        * 3、执行putval()
         final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;//辅助变量
        * //如果底层的table数组为null，或者length=0 就扩容16
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
            * //取出hash值对应的table的索引位置的Node，如果为null就直接把加入的k-v创建成一个Node，加入到该位置
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;//辅助变量
            if (p.hash == hash &&
            //如果table的索引位置的k的hash值相同和新的k的hash值相同，
            * 并 满足（table现有的结点的k和准备添加的k是同一个对象 || equasl返回真）
            * 就认为不能加入新的k-v
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
            * //如果当前的table的已有的Node是红黑树，就安装红黑树的方式处理
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
            * //如果找到的结点，后面是链表后面就循环的比较
                for (int binCount = 0; ; ++binCount) {  死循环
                    if ((e = p.next) == null) {//如果整个链表，没有和他相同，就加到该链表的最后
                        p.next = newNode(hash, key, value, null);
                        * 加入后，判断当前链表的个数，是否已经到8个，到8个后，就调用treeifyBin方法进行红黑树的转换
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                    * //在循环比较过程种，发现有相同，就break，就只是替换value
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;//替换 k对应的值
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;//每增加一个Node，就size++
        if (++size > threshold)//如果size>临界值，就扩容
            resize();
        afterNodeInsertion(evict);
        return null;
    }
    * 5、关于树化（转成红黑树）
    * 如果table为null 或者大小没到64，暂时不树化，进行扩容，否则才会真正树化 ——>剪枝
    * final void treeifyBin(Node<K,V>[] tab, int hash) {
        int n, index; Node<K,V> e;
        if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
            resize();        * */

    }
}
