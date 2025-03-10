package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);

    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
    boolean resuls1 = LogicNot.isEven(-4);
    boolean resuls2 = LogicNot.isPositive(-4);
    boolean resuls3 = LogicNot.notEven(-4);
    boolean resuls4 = LogicNot.notPositive(-4);
    boolean resuls5 = LogicNot.notEvenAndPositive(-4);
    boolean resuls6 = LogicNot.evenOrNotPositive(-4);
        System.out.println(resuls1);
        System.out.println(resuls2);
        System.out.println(resuls3);
        System.out.println(resuls4);
        System.out.println(resuls5);
        System.out.println(resuls6);
    }
}

