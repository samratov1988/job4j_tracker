package ru.job4j.pojo;

public class Library { // philosophyJava1168, clean code464
    public static void main(String[] args) {
        Book javaForDummies = new Book("Java for Dummies", 434);
        Book springJava = new Book("Spring Java", 754);
        Book philosophyJava = new Book("Philosophy Java", 1168);
        Book cleanCode = new Book("Clean code", 464);
        Book[] books = new Book[4];
        books[0] = javaForDummies;
        books[1] = springJava;
        books[2] = philosophyJava;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + ", p." + bk.getCountPages());
        }
        books[0] = cleanCode;
        books[3] = javaForDummies;
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + ", p." + bk.getCountPages());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + ", p." + bk.getCountPages());
            }
        }
    }
}
