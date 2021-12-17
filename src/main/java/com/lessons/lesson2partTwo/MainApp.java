package com.lessons.lesson2partTwo;

import com.lessons.lesson2partTwo.Transport.Car;
import com.lessons.lesson2partTwo.Transport.Moto;
import com.lessons.lesson2partTwo.Transport.Transport;

public class MainApp {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport moto = new Moto();
        Human human = new Human();
        human.stopTransport();
        human.driveTransport(car);
        human.driveTransport(moto);
        human.stopTransport();
        human.driveTransport(car);
    }
}
