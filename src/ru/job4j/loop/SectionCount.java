package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        while (length >= section) {
            count = length - section;
            count++;
           break;
        }
        return count;
    }
}

