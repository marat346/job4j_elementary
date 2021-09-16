package ru.job4j.condition;

public class SqArea {
    public static double ratio(double p, double k) {
        double h = (p / (2 * (k + 1)));
        double s = h * (h * k);
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.ratio(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}

