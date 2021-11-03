package ru.job4j.condition;

public class SqArea {
    public static int ratio(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;
    }

    public static void main(String[] args) {
        int result1 = SqArea.ratio(6, 2);
        int result2 = SqArea.ratio(4, 1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        System.out.println(" p = 4, k = 1, s = 2, real = " + result2);
    }
}

