package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Поехали!");
    }

    @Override
    public void pass(int numPass) {
        System.out.println("Количество пассажиров: " + numPass);
    }

    @Override
    public int fill(int fuel) {
        int priceOne = 40;
        return priceOne * fuel;
    }
}
