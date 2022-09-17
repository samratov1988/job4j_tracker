package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (s, s1) -> map.put(s, s1);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");
        /*
            Замените вставку элементов в карту на использование
            BiConsumer, он уже объявлен, требуется его реализовать.

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        */

        BiPredicate<Integer, String> biPred = (i, y) -> (i % 2 == 0 || y.length() == 4);
        for (Integer i : map.keySet()) {
            /*
                Замените проверку в if() на использование BiPredicate,
                он объявлен выше, требуется его реализовать.
             */
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        /*
            Заменить создание ArrayList из значений Map на Supplier,
            объявлен ниже, требуется его реализовать.
         */
        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        /*
         List<String> strings = new ArrayList<>(map.values());
         */

        Consumer<String> con = (s) -> System.out.println(s);
        Function<String, String> func = str -> str.toUpperCase();
        for (String s : sup.get()) {
            /*
                Заменить вывод строк на применение Consumer
                Заменить преобразование строк к строкам в верхнем регистре с помощью Function
                Необходимое объявлено выше, требуется их реализовать.
            */
            con.accept(func.apply(s));
        }
    }
}
