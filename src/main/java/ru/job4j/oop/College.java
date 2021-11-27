package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman fresh = new Freshman();
        Student stud = fresh; // Приведение(повышение) к типу родителя Student
        Object obj = fresh; // Приведение(повышение) к типу родителя Object
        Student student = new Freshman(); // Приведение типа при создании объекта
        Freshman freshman = (Freshman) student; // Понижение типа
    }
}
