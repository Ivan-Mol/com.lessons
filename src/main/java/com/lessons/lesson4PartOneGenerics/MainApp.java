package com.lessons.lesson4PartOneGenerics;

import java.lang.reflect.Array;
import java.util.Arrays;

//Generics Обобщения
public class MainApp {
    public static void main(String[] args) {
        genBox<String> strBox = new genBox<>("String");
        strBox.setObj("String2"); //Уже не поставить ничего кроме строки
        genBox<Integer> intBox1 = new genBox<>(21); //примитивный тип заворачивается в Integer
        genBox<Integer> intBox2 = new genBox<>(12);
        System.out.println(intBox1.getObj()+intBox2.getObj());

        TestBox<Number> testBox1 = new TestBox<>(12,32,12,412);
        System.out.println(testBox1.average());
        TestBox<Number> testBox2 = new TestBox<>(14,2,12,42,15,2,21,23,51,72);

    }

}
