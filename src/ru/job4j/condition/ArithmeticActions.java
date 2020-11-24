package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String action = "none";
        if (rsl == left + right) {
            action = "added";
        }
        if (rsl == left - right) {
            action = "subtracted";
        }
        if (rsl == left * right) {
            action = "multiplied";
        }
        if (rsl == left / right) {
            action = "divided";
        }
        return action;
    }
}