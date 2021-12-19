package com.lessons.lesson3Extentions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainApp {
    //исключения
    public static void main(String[] args) {

        //обрабатываем ошибку которая не была обработана в методе
        try {
            doSomething();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // throws чтобы не обрабатывать исключения в методе, должен обрабатывать тот кто вызвал метод выше по стеку
    public static void doSomething() throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("fileName");
    }




}
