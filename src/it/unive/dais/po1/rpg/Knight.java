package it.unive.dais.po1.rpg;

public class Knight extends Hero {
    private int strength;

    public Knight(String name, int hitPoints, int maxHitPoints, int strength) {
        super(name, hitPoints, maxHitPoints);
        this.strength = strength;
    }


    @Override
    public int attack() {
        return this.strength;
    }
}
