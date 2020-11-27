package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int mod = n - (d * (n / d));
        return mod;
    }
}