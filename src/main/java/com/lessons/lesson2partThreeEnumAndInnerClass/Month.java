package com.lessons.lesson2partThreeEnumAndInnerClass;
//Перечисления
public enum Month {
    //Список возможных вариантов перечисления
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4),
    MAY(5), JUNE(6), JULY(7), AUGUST(8),
    SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

    //поле у перечислений
    private int numberOfMonth;

    //геттер для поля
    public int getNumberOfMonth(){
        return numberOfMonth;
    }
    //конструктор для создания перечислений
    Month(int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }
}
