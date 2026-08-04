package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        if (age > 18) {
            System.out.println("Welcome to the cinema! ");
        } else {
            System.out.println("It is not for you, go home. ");
        }
    }

    public static void main(String[] args) {
        access(21);
        access(16);
    }
}
