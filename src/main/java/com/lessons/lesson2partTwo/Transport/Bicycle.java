package com.lessons.lesson2partTwo.Transport;

public class Bicycle implements Transport{
    @Override
    public void drive() {
        System.out.println("Человек едет на велосипеде");
    }

    @Override
    public void stop() {
        System.out.println("Человек остановил велосипед");
    }
}
