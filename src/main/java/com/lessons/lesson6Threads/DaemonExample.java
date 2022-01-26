package com.lessons.lesson6Threads;

public class DaemonExample {
    public static void main(String[] args) {
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (true) {
                    count++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(count + " seconds");
                }
            }
        });
        //setDaemon - делает поток демоном, это означает что когда все потоки завершатся, завершится и демон, даже если он еще работал
        timer.setDaemon(true);
        timer.start();
        try {
            Thread.sleep(5000);
            System.out.println("main остановился");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
