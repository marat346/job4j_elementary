package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = point + 1; i < array.length; i++) {
                    if (array[i] != null)  {
                        int notNullIndex = i;
                        String temp = array[point];
                        array[point] = array[notNullIndex];
                        array[notNullIndex] = temp;
                        break;

                    }
                }
            }
        }
        return array;
    }
}
