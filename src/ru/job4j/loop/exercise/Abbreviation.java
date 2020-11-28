package ru.job4j.loop.exercise;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt()) = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(s.charAt(i) + 1);
            }
        } System.out.println(sb);
        return s;
    }
}