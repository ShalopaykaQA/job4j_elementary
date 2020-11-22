package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first < second) {
            return second;

        } else if (second < third) {
            return third;
        }
        return first;
    }

    public static void main(String[]args) {
        int max = MultiMax.max(45, 13, 85);
        System.out.println(max);

    }
}