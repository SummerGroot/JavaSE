package com.basic.www.chapter14.list_;

import java.util.LinkedList;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-01 10:40
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println("ll=" + ll);

        //删除节点
        ll.remove();//默认删除第一个节点
        System.out.println("ll=" + ll);
        /*
        1、LinkedList ll = new LinkedList();
        public LinkedList() {}
        2、这时ll的属性first=null last = null
        3、执行
            public boolean add(E e) {
            linkLast(e);
            return true;
            }
        4、将新的节点，加入到双向链表的最后
            void linkLast(E e) {
            final Node<E> l = last;
            final Node<E> newNode = new Node<>(l, e, null);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            size++;
            modCount++;
        }
        */
        /*
        * ll.remove();
        * 1、执行removeFirst()
        *   public E remove() {
            return removeFirst();
            }
            * 2、执行
            public E removeFirst() {
            final Node<E> f = first;
            if (f == null)
                throw new NoSuchElementException();
            return unlinkFirst(f);
            }
        * 3、执行
        *private E unlinkFirst(Node<E> f) {
        // assert f == first && f != null;
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null; // help GC
        first = next;
        if (next == null)
            last = null;
        else
            next.prev = null;
        size--;
        modCount++;
        return element;
    }
             */
    }
}
