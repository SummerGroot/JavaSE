package com.basic.www.chapter14.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @Author: Summer Johnny
 * @version: java version 1.8
 * @date: 2023-03-03 14:20
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(new Car("BMW", 20000));
        lhs.add(new Car("奥迪", 300000));
        lhs.add(new Car("奔驰", 400000));
        lhs.add(new Car("保时捷", 500000));
        lhs.add(new Car("BMW", 20000));
        System.out.println("lhs = " + lhs);
    }
}

class Car {
    //两个属性
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    //重写equals方法，和hashCode
    //当name和price相同时，就返回同的hashcode值，equals返回T

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
