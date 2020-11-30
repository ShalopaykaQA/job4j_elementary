package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                rsl[i] = left[i] + right[j];
            }
        }
        return rsl;
    }
}

