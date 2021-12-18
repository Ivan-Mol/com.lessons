package com.lessons.lesson1Classes.animals;
// final в классе запрещает создавать наследников
public final class Cat extends Animal{
    int clawsLength;
    public Cat(String name, String color, int age, int clawsLength){
        this.name = name;
        this.color = color;
        this.age = age;
        this.clawsLength = clawsLength;
    }
//финал в методе запрещает его переопределение в наследниках
    public final static void onlyCatMethod(){
        System.out.println("onlyCatMethod");
    }
    @Override
    public void voice(){
        System.out.println(name + " Meow");
    }
    //переопределение метода класса Object для перевода объекта кот в строку
    @Override
    public String toString(){
        return "CAT "+ name +" " + color+ " "+ age + " " + clawsLength;
    }

}
