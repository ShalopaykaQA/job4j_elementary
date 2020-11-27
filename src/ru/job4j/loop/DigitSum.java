package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        do  {
            sum += num % 10;
            num /= 10;
            }
        while ((num / 10) > 0);
        sum += num % 10;
            return sum;
    }
}