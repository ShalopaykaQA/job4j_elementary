package ru.job4j.loop.exercise;

public class Hamming {
    public static int checkStrings(String left, String right) {
        if (left.length() != right.length()) {
            return -1;
       }
        int counter = 0;

        for (int i = 0; i < left.length(); i++) {

        if (left.charAt(i) != right.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}