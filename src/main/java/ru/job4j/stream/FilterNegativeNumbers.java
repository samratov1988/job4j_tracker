package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, -7, 50, -1, 0, 32, -13, -15);
        List<Integer> positive = numbers.stream().filter(n -> n > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
