package com.lessons.lesson2partTwo;

import com.lessons.lesson2partTwo.Transport.Transport;

public class Human {
    String name;
    Transport currentTransport;
    public void driveTransport(Transport transport){
        if (currentTransport!=null){
            currentTransport.stop();
            currentTransport = transport;
            currentTransport.drive();
        }
        else {
            currentTransport = transport;
            currentTransport.drive();
        }

    }
    public void stopTransport(){
        if (currentTransport!=null){
            currentTransport.stop();
            currentTransport = null;
        }
        else {
            System.out.println("Нечего останавливать");
        }
    }

}
