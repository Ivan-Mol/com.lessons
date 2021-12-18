package com.lessons.lesson2partTwoInterface.Transport;

public class Moto implements Transport {
    @Override
    public void drive() {
        System.out.println("Человек едет на мотоцикле");
    }

    @Override
    public void stop() {
        System.out.println("Человек остановил мотоцикл");
    }
}
