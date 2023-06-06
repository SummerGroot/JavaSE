package com.basic.www.chapter12.try_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 12:31
 */
public class TryCatchExercise01 {
    public static void main(String[] args) {
        System.out.println(Exception01.method());//4
    }
}

class Exception01 {
    public static int method() {
        try {
            String[] names = new String[3];//创建数组
            //names[1] = "tom";
            if (names[1].equals("tom")) {//空指针异常
                System.out.println(names[1]);
            } else {
                names[3] = "summer";
            }
            // System.out.println(names[3]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return 3;
        } finally {
            return 4;
        }

    }
}