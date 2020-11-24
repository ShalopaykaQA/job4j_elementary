package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rsl = 0;
        int day0 = hours[0];
        int overday0 = 0;
        if (hours[0] > 8) {
            day0 = 8;
            overday0 = hours[0] - 8;
        }
        int day1 = hours[1];
        int overday1 = 0;
        if (hours[1] > 8) {
            day1 = 8;
            overday1 = hours[1] - 8;
        }
        int day2 = hours[2];
        int overday2 = 0;
        if (hours[2] > 8) {
            day2 = 8;
            overday2 = hours[2] - 8;
        }
        int day3 = hours[3];
        int overday3 = 0;
        if (hours[3] > 8) {
            day3 = 8;
            overday3 = hours[3] - 8;
        }
        int day4 = hours[4];
        int overday4 = 0;
        if (hours[4] > 8) {
            day4 = 8;
            overday4 = hours[4] - 8;
        }
        int day5 = hours[5];
        int overday5 = 0;
        if (hours[5] > 8) {
            day5 = 8;
            overday5 = hours[5] - 8;
        }
        int day6 = hours[6];
        int overday6 = 0;
        if (hours[6] > 8) {
            day6 = 8;
            overday6 = hours[6] - 8;
        }

        rsl = day0 * 10 + overday0 * 15 + day1 * 10 + overday1 * 15 + day2 * 10 + overday2 * 15
                + day3 * 10 + overday3 * 15 + day4 * 10 + overday4 * 15 + day5 * 20 + overday5 * 30
                + day6 * 20 + overday6 * 30;

        return rsl;
    }
}