package com.lessons.lesson2partTwo.Transport;

public class Car implements Transport {
    @Override
    public void drive() {
        System.out.println("Человек едет на машине");
    }

    @Override
    public void stop() {
        System.out.println("Человек остановил машину");
    }
}
