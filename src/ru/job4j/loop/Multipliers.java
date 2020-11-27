package ru.job4j.loop;

public class Multipliers {
    public static void out(int n) {
        String out = "1";
        String ln = System.lineSeparator();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                out = out + ln + String.valueOf(i);
            }
        }
        System.out.println(out);
    }
}

