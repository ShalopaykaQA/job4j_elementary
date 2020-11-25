package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int result = 1;
        for (int count = 3; count <= finish; count += 2) {
            boolean prime = true;
            for (int i = 3; i * i <= count; i += 2) {
                if (count % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                result++;
            }
        }
        return result;
    }
}

