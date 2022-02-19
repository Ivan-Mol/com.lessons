package com.lessons.lesson8StreamLambdas;

public class MainApp8 {
    public static void main(String[] args) {
        //в методе main переопределям run в анонимном классе
        doSomething(new Runnable() {
            @Override
            public void run() {
                System.out.println("Первый вариант");
            }
        });
        doSomething(()-> System.out.println("Второй вариант с лямбдой"));

        doSomething(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Третий вариант с лямбдой");
            }
        });
    }
    //создаем метод в который можно пробросить нужный нам метод run в объекте
    public static void doSomething(Runnable runnableObj){
        runnableObj.run();
    }
}
