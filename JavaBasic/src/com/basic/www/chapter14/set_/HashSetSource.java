package com.basic.www.chapter14.set_;

import java.util.HashSet;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-02 9:46
 */
public class HashSetSource {
    public static void main(String[] args) {

        HashSet sh = new HashSet();
        sh.add("java");
        sh.add("fxy");
        sh.add("java");
        System.out.println("sh=" + sh);
        /*
        * 源码解读
        * 1、执行无参构造器
        public HashSet() {
        map = new HashMap<>();
        }
        *2、执行add()方法
        public boolean add(E e) {//e="java
        return map.put(e, PRESENT)==null;//PRESENT=private static final Object PRESENT = new Object();
        }
        3、执行put()方法  该方法会执行Hash（key）得到key对应的hash值 算法=return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        public V put(K key, V value) {//key="java" value=PRESENT 共享
        return putVal(hash(key), key, value, false, true);
        }
        4、执行putVal()方法
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;//定义了辅助变量
        //transient Node<K,V>[] table;  table就是HashMap的一个数组，类型是Node[]
        * if语句表示如果当前table 是null，或者大小=0
        * 就是第一次扩容，到16个空间
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
            * 根据key，得到hash去计算key应该存放到table表的哪个索引位置
            * 并把这个位置的对象 赋给p
            * 判断p是否为null
            * 如果p为null，表示还没有存放元素，就创建一个Node(Node=“java",value=PRESENT)
            * 就放在该位置tab[i] = newNode(hash, key, value, null);
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;
            //如果当前索引位置对应的链表的第一个元素和准备添加的key的hash值一样
            //并且满足
            准备加入的key和p指向的Node结点的key 是同一个对象。
            指向的Node结点的key 的equals()和准备加入的key比较后相同
            就不能加入
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            再判断p 是不是一颗红黑树，如果是红黑树，就调用 putTreeVal，来进行添加
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
            如果当前table对应索引位置，已经是一个链表，就使用for循环比较
            * 依次和该链表的每个元素比较后，都不相同，则加入到该链表的最后
            *   在把元素添加到链表后，立即判断该链表是否已经达到8个结点
            *   就调用treeifyBin()对当前链表进行树化（转成红黑树）
            *   在转成红黑树时，要进行判断
            * if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                    resize();
            * 如果上面条件成立，对table扩容
            * 只有上面条件不成立时，才进行转成红黑树
            * 比较过程中，有相同的情况，就直接break
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD（8） - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        * size就是每加入一个结点Node(k,v,h,next)，size++
        if (++size > threshold)
            resize();//扩容
        afterNodeInsertion(evict);//让其子类去实现不同的功能
        return null;
        }
        * */
    }
}
