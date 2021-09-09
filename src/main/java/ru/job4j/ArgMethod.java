package ru.job4j;

public class ArgMethod {

    public static void hello(String name, String age) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        String age = "Hello, ";
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }
}