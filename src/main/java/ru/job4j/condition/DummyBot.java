package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String result = "I dont know, please ask another question.";
        if ("Hi, Bot".equals(question)) {
            result = "Hi, SmartAss";
        } else if ("Bye.".equals(question)) {
            result = "See you later.";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = answer("Hi, Bot");
        System.out.println(result);
        result = answer("Bye.");
        System.out.println(result);
    }
}
