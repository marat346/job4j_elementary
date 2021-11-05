package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
            int result = first;
            if (third >= second && third >= first) {
                result = third;
            }
            if (second >= first && second >= third) {
                result = second;
            }
            return result;
        }

        public static void main(String[] args) {
       int firstMax = ThreeMax.max(10, 5, 1);
       int secondMax = ThreeMax.max(10, 50, 1);
        System.out.println(firstMax);
        System.out.println(secondMax);
    }
}
