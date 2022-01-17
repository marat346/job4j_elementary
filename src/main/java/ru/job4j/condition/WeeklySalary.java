package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int weekday = 10;
        int overtime = 15;
        int rsl = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] > 8) {
                hours[i] = (hours[i] - 8) * overtime + 8 * weekday;
                rsl += hours[i];
            } else {
                hours[i] *= weekday;
                rsl += hours[i];
            }
        }
            return rsl + hours[5] + hours[6];
        }
    }












