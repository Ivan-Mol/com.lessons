package com.lessons.lesson4PartOneGenerics;
//N extends Number - добавляет для N методы родителя

public class BoxWithNumbers<B extends Number> {
    private B[] array;

    public BoxWithNumbers(B[] array) {
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
}