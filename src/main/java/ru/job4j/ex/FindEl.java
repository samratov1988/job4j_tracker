package ru.job4j.ex;

import java.util.concurrent.ExecutionException;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Item not found.");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {

        return true;
    }

    public static void process(String[] value, String key, String[] abuses) {
        try {
            if (indexOf(value, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] array = new String[] {"one", "two", "three", "four"};
        try {
            indexOf(array, "five");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
