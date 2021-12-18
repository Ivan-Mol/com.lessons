package com.lessons.lesson1Classes;

import com.lessons.lesson1Classes.animals.Animal;

//лежит не в пакете но имеет доступ потому что у полей модификатор protected
public class Cow extends Animal {
    public Cow(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    @Override
    public void voice(){
        System.out.println(name + " Mooo");
    }
}
