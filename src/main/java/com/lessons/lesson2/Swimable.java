package com.lessons.lesson2;

public interface Swimable {
    //дефолтная реализация с 8 джавы
    //если наследник не переопределил, будет работать дефолтный метод
    default void swim(){
        System.out.println("swim");
    }
}
