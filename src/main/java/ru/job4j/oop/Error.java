package ru.job4j.oop;

public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Активна: " + active);
        System.out.println("Код ошибки: " + status);
        System.out.println("Сообщение: " + message);
        System.out.println();
    }

    public static void main(String[] args) {

        Error error404 = new Error(true, 404, "не найдено");
        error404.printInfo();

        Error error405 = new Error(true, 405, "метод запроса не используется");
        error405.printInfo();

        Error error408 = new Error(true, 408, "время ожидания истекло");
        error408.printInfo();

        Error error505 = new Error();
        error505.printInfo();
    }
}
