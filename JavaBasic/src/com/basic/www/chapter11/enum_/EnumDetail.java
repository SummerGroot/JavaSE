package com.basic.www.chapter11.enum_;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-02-20 14:47
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASSICMUSIC.play();
    }
}

class A {
}

//enum实现的枚举类，仍然是一个类，可以实现接口
interface IA {
    public void play();
}

enum Music implements IA {
    CLASSICMUSIC;

    public void play() {
        System.out.println("好听的音乐");
    }
}