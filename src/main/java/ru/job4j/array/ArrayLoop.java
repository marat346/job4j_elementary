package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] wave = new int[5];
        for (int index = 0; index < wave.length; index++) {
          wave[index] = index * 2 + 3;
        }
        for (int index = 0; index < wave.length; index++) {
            System.out.println(wave[index]);
        }
    }
}
