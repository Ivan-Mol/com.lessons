package com.lessons.lesson6Threads;


public class Counter{
    private int count;
    public Counter() {
        count = 0;
    }

    public void incrementCount() {
        count++;
    }

    public void decrementCount() {
        count--;
    }
    public int getCount(){
        return count;
    }
}