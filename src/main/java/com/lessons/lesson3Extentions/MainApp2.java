package com.lessons.lesson3Extentions;

public class MainApp2 {
    public static void main(String[] args) {
        //ошибку можно перехватить в любом месте по ее движению к началу стека
        try {
            firstMethod();
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка перехватывается выше по стеку");
        }
        System.out.println("Код продолжает работать после catch-потому что ошибка обработана");


        throw new RuntimeException("Ошибка ввода вывода"); // выбрасываем ошибку сами
    }

    public static void firstMethod(){
        methodWithError();
    }
    public static void methodWithError(){
        try {
            //ошибка
            int x = 10/0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Арифметическая ошибка");
        }
    }
}
