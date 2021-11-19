package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }

    public static void main(String[] args) {
        Fitness.calc(95, 90);
        Fitness.calc(90, 95);
        Fitness.calc(50, 90);
        Fitness.calc(90, 90);
    }
}
