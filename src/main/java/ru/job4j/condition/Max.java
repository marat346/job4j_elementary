package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean more = left >= right;
        int result = more ? left : right;
        return result;
    }

    public int add(int left, int right, int left1) {
        return max(
                left,
                max(right, left1)
        );
    }

    public int add(int left, int right, int left1, int right1) {
        return max(
                left,
                add(right, left1, right1)
        );
    }
}

