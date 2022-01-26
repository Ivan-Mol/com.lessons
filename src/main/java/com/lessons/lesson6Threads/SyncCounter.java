package com.lessons.lesson6Threads;

public class SyncCounter {
    private int count;
    public SyncCounter() {
        count = 0;
    }

    public synchronized void incrementCount() {
        count++;
    }

    public synchronized void decrementCount() {
        count--;
    }
    public int getCount(){
        return count;
    }
}
