package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        int fact;
        if (n == 0 | n == 1) {
            fact = 1;
        } else {
            fact = calc(n - 1) * n;
        }
        return fact;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
