package com.lessons.lesson6Threads;

public class MainApp {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread iter "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        //метод join заставляет поток в котором выполняется thread подождать его
        try {
            thread.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
