package org.example.Logic;

import org.example.Heroes.Heroes;

public class Logic {
    public static void logic(Heroes createHero) {
        System.out.println();

        if (createHero.getPhysicalPower() < 2 || createHero.getPhysicalPower() > 12) {
            System.out.println("Физическая мощь выходит за пределы броска двух шестигранников.");
        }

        if (createHero.getAthletics() < 2 || createHero.getAthletics() > 12) {
            System.out.println("Атлетика выходит за пределы броска двух шестигранников.");
        }

        if (createHero.getMindset() < 2 || createHero.getMindset() > 12) {
            System.out.println("Мышление выходит за пределы броска двух шестигранников.");
        }

        if (createHero.getSpiritStrength() < 2 || createHero.getSpiritStrength() > 12) {
            System.out.println("Духовная сила выходит за пределы броска двух шестигранников.");
        }

        if (createHero.getHealth() < 2 || createHero.getHealth() > 12) {
            System.out.println("Здоровье выходит за пределы броска двух шестигранников.");
        }

        if (createHero.getCharisma() < 2 || createHero.getCharisma() > 12) {
            System.out.println("Харизма выходит за пределы броска двух шестигранников.");
        }


    }
}
