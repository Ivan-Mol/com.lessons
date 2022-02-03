package com.lessons.lesson7Threads2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExam {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 12; i++) {
            final String s = "N"+i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(s + " start");
                    try {
                        Thread.sleep(2000+((int) Math.random()*3000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(s + " end");

                }
            });
        }
        executorService.shutdown();
    }

}
