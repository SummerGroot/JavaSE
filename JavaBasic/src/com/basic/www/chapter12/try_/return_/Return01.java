package com.basic.www.chapter12.try_.return_;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-05-17 14:21
 */
public class Return01 {
    public static void main(String[] args) {
        System.out.println(getResult1());
    }

    @SuppressWarnings("finally")
    public static int getResult1() {
        int a = 100;

        try {
            return a + 1; //注意，java的基础数据类型是值传递，这里的返回值已经和上面的a没有关系了
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return a;    //最后再把值重定向到a(相当于将try中的返回值覆盖掉)，所以输出还是100
        }
    }
    public static int getResult2(){
        int a =100;

        try{
            return a++;   //切记 a++   ----> a=a+1 此时a的值做出了改变
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            return a;
        }
    }
}

