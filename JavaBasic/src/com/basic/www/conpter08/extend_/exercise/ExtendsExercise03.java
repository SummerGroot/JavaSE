package com.basic.www.conpter08.extend_.exercise;

/**
 * @version: java version 1.8
 * @Author: Summer Johnny
 * @description:
 * @date: 2023-02-08 15:38
 */
public class ExtendsExercise03 {
    public static void main(String[] args) {
        Pc pc = new Pc("intel", 16, 500, "IBM");
        pc.printInfo();
    }
}

/*
 * 1、编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法返回Computer详细信息
 * 2、编写Pc子类，继承Computer类，添加特有属性（品牌brand）
 * 3、编写NotePad子类，继承Computer类，添加特有属性（演示color）
 * 4、编写Test类，在main方法中创建Pc和NotePad对象，分分别给对象中特有的属性赋值，
 * 以及从Computer类继承的属性赋值，并使用方法打印输出信息。
 * */
class Computer {
    private String cpu;
    private int memory;
    private int disk;

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    //返回computer相信信息
    public String getDetails() {
        return "CPU: " + cpu + ", 内存: " + memory + ", 硬盘: " + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}

class Pc extends Computer {
    //编写Pc子类，继承Computer类，添加特有属性（品牌brand）
    private String brand;

    //这里IDEA根据继承的规则，自动把构造器的调用写好
    //这里也体现出：继承设计的基本思想。父类的构造完成父类属性初始化
    //子类的构造器完成子类属性初始化
    public Pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("PC信息：");
        //System.out.println(getCpu()+getMemory()+getDisk());
        //调用父类的getDetial方法，得到相关属性信息....
        System.out.println(getDetails() + " brand:" + getBrand());
    }
}

class NotePad extends Computer {
    //编写NotePad子类，继承Computer类，添加特有属性（演示color）
    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Test {
}