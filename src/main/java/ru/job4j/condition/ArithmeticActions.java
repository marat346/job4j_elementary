package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String fifa = "none";
        if ((left + right) == rsl) {
            fifa = "added";
        }
        if ((left - right) == rsl) {
            fifa = "subtracted";
        }
        if ((left * right) == rsl) {
            fifa = "multiplied";
        }
        if ((left / right) == rsl) {
            fifa = "divided";
        }
        return fifa;
    }
}