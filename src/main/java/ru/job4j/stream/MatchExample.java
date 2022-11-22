package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("One", "Two", "Three", "Four", "Five");
        boolean rsl = strings
                .stream()
                .noneMatch("Six"::contains);
        System.out.println(rsl);

        boolean rsl2 = strings
                .stream()
                .anyMatch(e -> e.endsWith("e"));
        System.out.println(rsl2);

        boolean rsl3 = strings
                .stream()
                .allMatch(e -> e.startsWith("Three"));
        System.out.println(rsl3);

    }
}
