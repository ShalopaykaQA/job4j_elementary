package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        boolean b = false;

        if (year % 400 == 0) {
            b = true;
        } else if (year % 100 == 0) {
            b = false;
        } else if (year % 4 == 0) {
            b = true;
        }

        return b;
    }
}