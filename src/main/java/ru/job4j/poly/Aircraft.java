package ru.job4j.poly;

public class Aircraft implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " - Летит со скоростью 800 км/ч.");
    }
}
