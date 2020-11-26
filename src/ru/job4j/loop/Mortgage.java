package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int monthly, double percent) {
        int year = 0;
        double crd = amount;
        while (crd > 0) {
            year++;
            crd = (crd + crd * percent / 100) - monthly;
        }
        return year;
    }
}