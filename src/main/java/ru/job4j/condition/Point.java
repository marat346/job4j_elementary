package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow( y2 - y1,2));
        return rsl;
    }

    public static void main(String[] args) {
        double distance = Point.distance(0, 0, 2, 0);
        double distance2 = Point.distance(2, 3, 7, 5);
        double distance3 = Point.distance(3, 2, 9, 4);
        System.out.println("result (0, 0) to (2, 0) " + distance);
        System.out.println("result (2, 3) to (7, 5) " + distance2);
        System.out.println("result (3, 2) to (9, 4) " + distance3);
    }
}
