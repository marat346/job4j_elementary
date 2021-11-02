package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
        } else if (number % 3 == 0) {
            rsl = "Исходное число делится на 3, но не является четным.";
        } else if (number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является четным.";
        } else {
            rsl = "Исходное число не делится на 3 и не является четным.";
        }
        return rsl;
    }

    public static void main(String[] args){
    String resuls1 = DivideBySix.checkNumber(24);
    String resuls2 = DivideBySix.checkNumber(9);
    String resuls3 = DivideBySix.checkNumber(14);
    String resuls4 = DivideBySix.checkNumber(25);
    System.out.println(resuls1);
    System.out.println(resuls2);
    System.out.println(resuls3);
    System.out.println(resuls4);
   }
}

