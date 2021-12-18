package com.lessons.lesson2partOneInterfaces;

public class MainApp {
    public static void main(String[] args) {
        Flyable[] flyables = {
                new Duck(),
                new Airplane()
        };
        for (Flyable f: flyables) {
            f.fly();
        }
        Flyable somethingFlyable = new Duck();
        somethingFlyable.fly(); //можно вызвать только метод который есть в интерфейсе
    }
}
