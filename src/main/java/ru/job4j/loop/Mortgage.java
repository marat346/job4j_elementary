package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double dolg = 0;
        percent *= 0.01;
        dolg = (((amount * percent) + amount) - salary);
         while (dolg >= 0) {
             dolg = (((dolg * percent) + dolg) - salary);
             year++;
         }
         return year;
    }
}
