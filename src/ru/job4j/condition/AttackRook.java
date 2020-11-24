package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        boolean check = false;
        char[] result = left.toCharArray();
        char[] result1 = right.toCharArray();

        check = result[0] == result1[0] || result[1] == result1[1];
        return check;
    }

}

