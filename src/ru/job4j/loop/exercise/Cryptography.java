package ru.job4j.loop.exercise;

public class Cryptography {
    public static String code(String s) {
        StringBuilder code = new StringBuilder(s);
        if (s.length() > 4) {
            for (int i = 0; i < s.length() - 4; i++) {
                code.setCharAt(i, '#');
            }
        }
        if (s.length() == 0) {
            return "empty";
        }
        System.out.println(code);
        return code.toString();
    }
}
