package org.example.Heroes;

public class Heroes {
    protected int physicalPower;
    protected int athletics;
    protected int mindset;
    protected int spiritStrength;
    protected int health;
    protected int charisma;

    public void createNewHero(int physicalPower, int athletics, int mindset,
                              int spiritStrength, int health, int charisma) {
        this.physicalPower = physicalPower;
        this.athletics = athletics;
        this.mindset = mindset;
        this.spiritStrength = spiritStrength;
        this.health = health;
        this.charisma = charisma;
    }

    public int getPhysicalPower() {
        return physicalPower;
    }

    public int getAthletics() {
        return athletics;
    }

    public int getMindset() {
        return mindset;
    }

    public int getSpiritStrength() {
        return spiritStrength;
    }

    public int getHealth() {
        return health;
    }

    public int getCharisma() {
        return charisma;
    }
}
