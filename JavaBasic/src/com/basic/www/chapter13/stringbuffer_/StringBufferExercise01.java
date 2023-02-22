package com.basic.www.chapter13.stringbuffer_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-22 14:48
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;// ok
        StringBuffer sb = new StringBuffer(); //ok
        sb.append(str);//需要看源码 , 底层调用的是 AbstractStringBuilder 的 appendNull
        /*public AbstractStringBuilder append(String str) {
            if (str == null)
                return appendNull();
            int len = str.length();
            ensureCapacityInternal(count + len);
            str.getChars(0, len, value, count);
            count += len;
            return this;
        }*/
        /*private AbstractStringBuilder appendNull() {
            int c = count;
            ensureCapacityInternal(c + 4);
            final char[] value = this.value;
            value[c++] = 'n';
            value[c++] = 'u';
            value[c++] = 'l';
            value[c++] = 'l';
            count = c;
            return this;
        }*/
        System.out.println(sb.length());//4
        System.out.println(sb);//null
        //下面的构造器，会抛出 NullpointerException
        StringBuffer sb1 = new StringBuffer(str);//看底层源码 super(str.length() + 16);
        System.out.println(sb1);
    }
}
