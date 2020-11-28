package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int j) {
        String val = String.valueOf(j);
        for (int i = 0; i < (val.length() - 1) / 2; i++) {
            if (val.charAt(i) != val.charAt(val.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}