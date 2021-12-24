package com.lessons.lesson4PartOneGenerics;

import java.lang.reflect.Array;

public class TestBox<N extends Number>{
    N[] array;
    //N... - аргумент переменной длины - может передааться любое кол-во
    public TestBox(N... array){
        this.array = array;
    }

    public double average(){
        double average = 0.0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i].doubleValue();
        }
        average = average/array.length;
        return average;
    }
//<?> - любое значение
    public boolean compareAverage(TestBox<?> AnotherTestBox){
        return Math.abs(this.average() - AnotherTestBox.average())<0.0001;

    }

}
