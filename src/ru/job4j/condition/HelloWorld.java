package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String s = " ";
        if (number % 3 == 0 && number % 5 == 0) {
            s = "Hello, World!!!";
        } else if (number % 3 == 0) {
                s = "Hello";
            } else if (number % 5 == 0) {
                    s = "World";
                } else {
                    s = "Operation not support";
                }

        return s;
    }
}