package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public static double area1(double a, double b, double c, double p) {
        double equality = p * (p - a) * (p - b) * (p - c);
        return equality;
    }

    public static double area2(double equality) {
        double s = Math.sqrt(equality);
        return s;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        double equality = TrgArea.area1(2, 2, 2, rsl);
        double results = TrgArea.area2(equality);
        System.out.println("area (2, 2, 2) = " + results);
    }
}