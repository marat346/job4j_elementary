package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] data = new int[size][size];
        for (int i = 0; i < data.length; i++) {
             for (int j = 0; j < data[i].length; j++) {
                data[i][j] += (i + 1) * (j + 1);
            }
        }
        return data;
    }
}
