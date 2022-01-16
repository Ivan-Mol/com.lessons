package com.lessons.lesson5CollectionsHashMap;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("frst","string1");
        map.put("scnd","string2");
        for (Map.Entry<String,String> o: map.entrySet()){
            System.out.println(o.getValue());
        }
        //если не найдет по ключу - вернет стандартное значение
        System.out.println(map.getOrDefault("z","ZZZZzz"));

        //Set - не хранит одинаковые объекты
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("B");
        System.out.println(set);
        //Iterator для обхода всех элементов 
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
