package ru.job4j.calculate;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int rsl = X2.calc(1, 1, 1, 0);
        System.out.println(rsl);
    }
}