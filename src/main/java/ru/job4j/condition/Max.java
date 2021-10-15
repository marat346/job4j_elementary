package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean more = left >= right;
        int result = more ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int more = Max.max(1, 2);
        int more1 = Max.max(2, 1);
        int more2 = Max.max(7, 7);
        System.out.println(more);
        System.out.println(more1);
        System.out.println(more2);
    }
}
