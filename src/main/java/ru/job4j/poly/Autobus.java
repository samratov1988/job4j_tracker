package ru.job4j.poly;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " - Двигается по асфальтированным трассам со скоростью 100 км/ч.");
    }
}
