package com.lessons.lesson2partOneInterfaces;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }
}
