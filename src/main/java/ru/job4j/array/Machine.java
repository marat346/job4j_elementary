package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int y = money - price;
        for (int i = 0; i <= coins.length - 1; i++) {
            while (y >= coins[i]) {
                rsl[size] = coins[i];
                size += 1;
                y -= coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
