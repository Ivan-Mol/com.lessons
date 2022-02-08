package com.lessons.lesson7Threads2;

import java.util.Vector;

//перехват ошибки в потоке с помощью setUncaughtExceptionHandler
public class uncaughtExceptionHandl {
    public static void main(String[] args) {
        Thread threadWithError = new Thread(new Runnable() {
            @Override
            public void run() {
                int err = 10/0;
                System.out.println("end");
            }
        });
        threadWithError.start();
        threadWithError.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Error Catched");
            }
        });
    }
}
