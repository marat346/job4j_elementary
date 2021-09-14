package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2) {
        double rsl = x2 - x1;
        return rsl;
    }

    public static double distance1(int y1, int y2) {
        double rsl = y2 - y1;
        return rsl;
    }

    public static double distance2(int x1, int y1, int x2, int y2) {
        double distance = Math.pow(x2 - x1, 2);
        return distance;
    }

    public static double distance3(int x1, int y1, int x2, int y2) {
        double distance1 = Math.pow(y2 - y1, 2);
        return distance1;
    }

    public static double square(double summa) {
        double square = Math.sqrt(summa);
        return square;
    }

    public static void main(String[] args) {
        double distance = Point.distance(0, 2);
        double distance1 = Point.distance1(0, 0);
        double distance2 = Point.distance2(0, 0, 2, 0);
        double distance3 = Point.distance3(0, 0, 2, 0);
        double summa = distance2 + distance3;
        double square = Point.square(summa);

        System.out.println("result (0, 0) to (2, 0) " + square);

    }
}

