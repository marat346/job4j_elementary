package ru.job4j.condition;

public class SqArea {
    public static double ratio(double p, double k) {
        double h = p / (2 * (k + 1));
        return h;
    }

    public static double leng(double h, double k) {
        double l = h * k;
        return l;
    }

    public static void main(String[] args) {
        double result1 = SqArea.ratio(6, 2);
        double length = SqArea.leng(result1, 2);
        double square = result1 * length;
        System.out.println(" p = 6, k = 2, s = 2, real = " + square);
    }
}

