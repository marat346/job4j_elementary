package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean more = left >= right;
        int result = more ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {

        return max(first, max(second, third, fourth));
    }
}

