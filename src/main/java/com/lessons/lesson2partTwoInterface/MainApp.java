package com.lessons.lesson2partTwoInterface;

import com.lessons.lesson2partTwoInterface.Transport.Car;
import com.lessons.lesson2partTwoInterface.Transport.Moto;
import com.lessons.lesson2partTwoInterface.Transport.Transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
