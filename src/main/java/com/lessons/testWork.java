package com.lessons;

import java.util.Random;

public class testWork {
    public static void main(String[] args) {
        inter inter = ()-> System.out.println("asd");
        inter inter2 = ()-> System.out.println("aasd");
        inter.printSmt();
        inter2.printSmt();


    }


    @FunctionalInterface
    public interface inter{
        public void printSmt();
    }
}
