package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static boolean nonexist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean resuls = Triangle.exist(2, 2, 2);
        boolean nonresuls = Triangle.nonexist(2, 2, 9);
        System.out.println(resuls);
        System.out.println(nonresuls);
    }
 }
