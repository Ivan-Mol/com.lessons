package com.lessons.lesson7Threads2;

import java.util.concurrent.*;

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
//получение от потока результата его деятельности в виде некоторого объекта. Эту задачу можно решить с
// использованием интерфейсов Callable<V> и Future<V>. Совместное использование двух реализаций данных
// интерфейсов позволяет получить результат в виде некоторого объекта.
        ExecutorService executorServiceWithCallable = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 9; i++) {
            final String counter = Integer.toString(i);

             Future<String> stringFuture = executorServiceWithCallable.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return counter +" return";
                }
            });
            try {
                System.out.println(stringFuture.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorServiceWithCallable.shutdown();

    }

}
