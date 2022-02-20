package com.lessons.lesson8StreamLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp8Stream {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>(Arrays.asList(12,412,231,123,41,1,1,3,234,63,38));
        List<Integer> integers2 = integers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer<200;
            }
        }).collect(Collectors.toList());
        System.out.println(integers2);

        List<Integer> integers3 = integers.stream().filter((integg)->integg>200).collect(Collectors.toList());
        System.out.println(integers3);

        //без возвращения листа
        integers.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer % 2 == 0;
                    }
                })
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.print(integer+" ");
                    }
                });
        System.out.println();

        //без возвращения листа в лямбде
        integers.stream().filter((intg -> intg%2==0)).forEach((intg)-> System.out.print(intg+" "));

        System.out.println();
        //Создание стрима без массива и преобразование из одного типа в другой
        Stream.of("A","B","C").map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.hashCode();
            }
        }).forEach((s)-> System.out.print(s+" "));
        System.out.println();
        //district оставляет только уникальные элементы
        integers.stream().distinct().forEach((s)-> System.out.print(s+" "));
        System.out.println();
        //allMatch - все значения должны соответсвовать условию
        System.out.println(integers.stream().allMatch((s)->s>=1));
        //anyMatch - хотя бы один элемент должен соответствовать условию
        System.out.println(integers.stream().anyMatch((s)->s>400));
        //noneMatch - ни один не должен соответсвовать.
        System.out.println(integers.stream().anyMatch((s)->s>0));

        //reduce
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(nums.stream().reduce(0,(a,b)->a+b));

        //числа в строковые зачение и в целую строку
        System.out.println(integers.stream().map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer.toString();
            }
        }).collect(Collectors.joining(" разделитель ","Префикс ",".")));

    }
}
//01:34