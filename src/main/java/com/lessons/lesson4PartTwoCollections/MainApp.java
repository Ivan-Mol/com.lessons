package com.lessons.lesson4PartTwoCollections;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("AAAAAAAA","BBB","CCC","BBB","B","EEEE","FFFF"));
        //удаляет все B
        while (strings.remove("B"));
        System.out.println(strings);
        //использование Компаратора для изменения способа сортировки - здесь сортирует по длине строки
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(strings);
//Каждый элемент имеет ссылку на соседний
        List<String > linkedList = new LinkedList<>();

    }
}
