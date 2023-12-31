package org.example.Decorator;

import java.util.Scanner;

public class Decorator {
    static Scanner scanner = new Scanner(System.in);
    public static void start() {
        System.out.println("Программа предназначена для создания Характеристик Героя для НРИ \"Герои Случая\"");
    }

    public static int createNewHero(String characteristic) {
        System.out.print("Введите значение характеристики " + characteristic + ": ");
        return scanner.nextInt();
    }
}
