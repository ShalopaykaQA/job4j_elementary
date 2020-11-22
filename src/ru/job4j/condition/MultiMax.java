package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int max = first;
        if (max < second) {
            max = second;
        }
        if (max < third) {
            max = third;
        }
        return max;
    }

    public static void main(String[]args) {
        int max = MultiMax.max(7, 13, 5);
        System.out.println(max);

    }
}