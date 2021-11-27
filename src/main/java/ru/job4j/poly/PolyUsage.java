package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle train3 = new Train();
        Vehicle air1 = new Aircraft();
        Vehicle air2 = new Aircraft();
        Vehicle air3 = new Aircraft();
        Vehicle bus1 = new Autobus();
        Vehicle bus2 = new Autobus();
        Vehicle bus3 = new Autobus();

        Vehicle[] vehicles = new Vehicle[]{train1, train2, train3,
                                            air1, air2, air3,
                                            bus1, bus2, bus3};
        for (Vehicle v: vehicles) {
            v.move();
        }
    }
}
