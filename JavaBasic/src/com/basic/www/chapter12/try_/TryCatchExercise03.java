package com.basic.www.chapter12.try_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-21 12:45
 */
public class TryCatchExercise03 {
    public static void main(String[] args) {
        System.out.println(Exception03.method());//i=4 3
    }
}

class Exception03 {
    public static int method() {
        int i = 1;
        try {
            i++;//i=2
            String[] names = new String[3];//创建数组
            if (names[1].equals("tom")) {//空指针异常
                System.out.println(names[1]);
            } else {
                names[3] = "summer";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;//i=3 =>保存临时变量temp=3
        } finally {
            ++i;//i=4
            System.out.println("i=" + i);
        }
    }
}
