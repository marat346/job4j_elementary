package ru.job4j.converter;

public class TimeMachine {
    public void goToFuture(Cat cat) {
        cat = new Cat(cat.age);
        cat.age += 10;
    }

    public void goToPast(Cat cat) {
        cat = new Cat(cat.age);
        cat.age -= 10;
    }

    public static void main(String[] args) {

        TimeMachine timeMachine = new TimeMachine();
        Cat barsik = new Cat(5);

        System.out.println("Сколько лет Барсику в самом начале работы программы?");
        System.out.println(barsik.age);

        timeMachine.goToFuture(barsik);
        System.out.println("А теперь?");
        System.out.println(barsik.age);

        System.out.println("Елки-палки! Барсик постарел на 10 лет! Живо гони назад!");
        timeMachine.goToPast(barsik);
        System.out.println("Получилось? Мы вернули коту его изначальный возраст?");
        System.out.println(barsik.age);
    }
}