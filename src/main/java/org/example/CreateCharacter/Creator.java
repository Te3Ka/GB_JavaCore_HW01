package org.example.CreateCharacter;

import org.example.Decorator.Decorator;
import org.example.Heroes.Heroes;
import org.example.Logic.Logic;

public class Creator {
    static Heroes newHero = new Heroes();

    public static void characteristics() {
        newHero.createNewHero(Decorator.createNewHero("Физическая мощь"),
                                Decorator.createNewHero("Атлетика"),
                                Decorator.createNewHero("Мышление"),
                                Decorator.createNewHero("Духовная Сила"),
                                Decorator.createNewHero("Здоровье"),
                                Decorator.createNewHero("Харизма"));
        Logic.logic(newHero);
        System.out.println("Done");
    }
}