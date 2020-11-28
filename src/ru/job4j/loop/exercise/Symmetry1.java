package ru.job4j.loop.exercise;

public class Symmetry1 {
    public static boolean check(int i) {
        String val = String.valueOf(i);
        StringBuilder sb = new StringBuilder(val);
        return (val.equals(sb.reverse().toString()));
    }
}