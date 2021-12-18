package com.lessons.lesson2partOneInterfaces;

public class Duck implements Flyable,Swimable{

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {

    }
}
