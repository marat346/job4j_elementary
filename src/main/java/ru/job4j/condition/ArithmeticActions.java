package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        if ((left + right) == rsl) {
            return "added";
        }
        if ((left - right) == rsl) {
            return "subtracted";
        }
        if ((left * right) == rsl) {
            return "multiplied";
        }
        if ((left / right) == rsl) {
            return "divided";
        }
        return "none";
    }
}