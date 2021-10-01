package ru.job4j.pojo;

public class Library {
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
        for (Book bk : books) {
            System.out.println(bk.getName() + ", p." + bk.getCountPages());
        }
        books[0] = cleanCode;
        books[3] = javaForDummies;
        System.out.println();
        for (Book bk : books) {
            System.out.println(bk.getName() + ", p." + bk.getCountPages());
        }
        System.out.println();
        for (Book bk : books) {
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName() + ", p." + bk.getCountPages());
            }
        }
    }
}
